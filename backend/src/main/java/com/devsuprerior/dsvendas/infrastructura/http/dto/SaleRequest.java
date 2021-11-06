package com.devsuprerior.dsvendas.infrastructura.http.dto;

import com.devsuprerior.dsvendas.domain.entities.Seller;

import java.time.LocalDate;

public class SaleRequest {
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    private Seller seller;

    public Integer getVisited() {
        return visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public Seller getSeller() {
        return seller;
    }

    public SaleRequest(Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.seller = seller;
    }

    public SaleRequest() {
    }
}
