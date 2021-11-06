package com.devsuprerior.dsvendas.infrastructura.http.dto.response;

import com.devsuprerior.dsvendas.infrastructura.database.postgres.datasql.SellerDataSql;

import java.io.Serializable;

public class SaleSumResponse implements Serializable {
    private String sellerName;
    private Double sum;

    public SaleSumResponse(){}

    public SaleSumResponse(SellerDataSql seller, Double sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
