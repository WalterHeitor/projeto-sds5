package com.devsuprerior.dsvendas.infrastructura.http.dto;

import com.devsuprerior.dsvendas.domain.entities.Seller;

import java.io.Serializable;

public class SellerRequest implements Serializable {
    private static final long serialVersionUID =1L;

    private Long id;
    private String name;

    public SellerRequest() {
    }

    public SellerRequest(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public SellerRequest(Seller entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
