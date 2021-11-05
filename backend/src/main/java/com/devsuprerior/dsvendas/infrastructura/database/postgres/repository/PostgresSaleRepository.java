package com.devsuprerior.dsvendas.infrastructura.database.postgres.repository;

import com.devsuprerior.dsvendas.domain.entities.Sale;
import com.devsuprerior.dsvendas.domain.repositories.SaleRepository;
import com.devsuprerior.dsvendas.infrastructura.database.postgres.repositoryjpa.SaleRepositoryData;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PostgresSaleRepository implements SaleRepository {

    private final SaleRepositoryData saleRepositoryData;

    public PostgresSaleRepository(SaleRepositoryData saleRepositoryData) {
        this.saleRepositoryData = saleRepositoryData;
    }


    @Override
    public List<Sale> findAlSales() {
        List<Sale> sales = saleRepositoryData.findAll().stream().map(saleDataSql -> {
            Sale sale = new Sale(
                    saleDataSql.getId(),
                    saleDataSql.getVisited(),
                    saleDataSql.getDeals(),
                    saleDataSql.getAmount(),
                    saleDataSql.getDate()
                    );
                    return sale;
        }).collect(Collectors.toList());
        return sales;
    }
}
