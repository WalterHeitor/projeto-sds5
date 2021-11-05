package com.devsuprerior.dsvendas.infrastructura.controllers;

import com.devsuprerior.dsvendas.domain.entities.Sale;

import java.io.Serializable;
import java.time.LocalDate;

public class SaleResponse implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    public SaleResponse(){}

    public SaleResponse(Long id, Integer visited, Integer deals, Double amount, LocalDate date) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
    }
    public SaleResponse(Sale sale) {
        this.id = sale.getId();
        this.visited = sale.getVisited();
        this.deals = sale.getDeals();
        this.amount = sale.getAmount();
        this.date = sale.getDate();
    }

    public Long getId() {
        return id;
    }

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
}
