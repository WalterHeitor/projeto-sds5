package com.devsuprerior.dsvendas.infrastructura.usecases;

import com.devsuprerior.dsvendas.domain.dto.SellerResponse;
import com.devsuprerior.dsvendas.domain.entities.Seller;
import com.devsuprerior.dsvendas.domain.repositories.SellerRepository;
import com.devsuprerior.dsvendas.infrastructura.database.Postgres.SellerRepositoryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepositoryData sellerRepositoryData;
    @Autowired
    private SellerRepository sellerRepository;

    public SellerService(SellerRepositoryData repositoryData, SellerRepository sellerRepository) {
        this.sellerRepositoryData = repositoryData;
        this.sellerRepository = sellerRepository;
    }

    public List<SellerResponse> findAll(){
        List<Seller> sellers = sellerRepository.findAll(sellerRepositoryData);
        return sellers.stream().map(seller -> new SellerResponse(seller))
                .collect(Collectors.toList());
    }

}
