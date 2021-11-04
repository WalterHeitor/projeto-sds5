package com.devsuprerior.dsvendas.domain.entities;

import com.devsuprerior.dsvendas.domain.repositories.SaleRepository;
import com.devsuprerior.dsvendas.infrastructura.database.Postgres.SaleRepositoryData;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Sale implements SaleRepository {
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    private Seller seller;

    public Sale() {
    }

    public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDate date) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    @Override
    public List<Sale> findAll(SaleRepositoryData saleRepositoryData) {
        List<Sale> sales = saleRepositoryData.findAll()
                .stream().map(saleDataSql -> {
                    Sale sale = new Sale(
                            id = saleDataSql.getId(),
                            visited = saleDataSql.getVisited(),
                            deals = saleDataSql.getDeals(),
                            amount = saleDataSql.getAmount(),
                            date = saleDataSql.getDate()
                            );
                    return sale;
                })
                .collect(Collectors.toList());
        return sales;
    }
}
