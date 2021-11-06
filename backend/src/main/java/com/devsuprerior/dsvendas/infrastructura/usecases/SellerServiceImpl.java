package com.devsuprerior.dsvendas.infrastructura.usecases;


import com.devsuprerior.dsvendas.domain.entities.Seller;
import com.devsuprerior.dsvendas.domain.repositories.SellerRepository;
import com.devsuprerior.dsvendas.infrastructura.http.dto.response.SellerResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerServiceImpl {

    private final SellerRepository sellerRepository;

    public SellerServiceImpl(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    public List<SellerResponse> findAll(){
        List<Seller> sellers = sellerRepository.findAllSellers();
        return sellers.stream().map(seller -> new SellerResponse(seller))
                .collect(Collectors.toList());
    }

}
