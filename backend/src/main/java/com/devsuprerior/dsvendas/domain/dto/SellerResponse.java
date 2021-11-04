package com.devsuprerior.dsvendas.domain.dto;

import com.devsuprerior.dsvendas.domain.entities.Seller;

public class SellerResponse {
    private Long id;
    private String name;

    public SellerResponse() {
    }

    public SellerResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public SellerResponse(Seller seller) {
        this.id = seller.getId();
        this.name = seller.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
