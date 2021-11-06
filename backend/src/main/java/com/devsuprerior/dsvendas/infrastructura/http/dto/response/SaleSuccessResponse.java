package com.devsuprerior.dsvendas.infrastructura.http.dto.response;

import com.devsuprerior.dsvendas.infrastructura.database.postgres.datasql.SellerDataSql;

import java.io.Serializable;

public class SaleSuccessResponse implements Serializable {
    private String sellerName;
    private Long visted;
    private Long deals;

    public SaleSuccessResponse(){}

    public SaleSuccessResponse(SellerDataSql seller, Long visted, Long deals) {
        this.sellerName = seller.getName();
        this.visted = visted;
        this.deals = deals;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getVisted() {
        return visted;
    }

    public void setVisted(Long visted) {
        this.visted = visted;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }
}
