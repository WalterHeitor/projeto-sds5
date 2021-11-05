package com.devsuprerior.dsvendas.infrastructura.database.postgres.repository;

import com.devsuprerior.dsvendas.domain.entities.Seller;
import com.devsuprerior.dsvendas.domain.repositories.SellerRepository;
import com.devsuprerior.dsvendas.infrastructura.database.postgres.repositoryjpa.SellerRepositoryData;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PostgresSellerRepository implements SellerRepository {

    private final SellerRepositoryData sellerRepositoryData;

    public PostgresSellerRepository(SellerRepositoryData sellerRepositoryData) {
        this.sellerRepositoryData = sellerRepositoryData;
    }


    @Override
    public List<Seller> findAllSellers() {
        List<Seller> sellers = sellerRepositoryData.findAll()
                .stream().map(saleDataSql -> {
                    Seller seller = new Seller(
                            saleDataSql.getId(),
                            saleDataSql.getName()
                    );
                    return seller;
                })
                .collect(Collectors.toList());
        return sellers;
    }
}
