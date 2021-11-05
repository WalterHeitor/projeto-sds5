package com.devsuprerior.dsvendas.infrastructura.database.postgres.datasql;

import com.devsuprerior.dsvendas.domain.entities.Sale;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "tb_sales")
public class SaleDataSql {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private SellerDataSql seller;

    public SaleDataSql() {
    }

    public SaleDataSql(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDataSql seller) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.seller = seller;
    }
    public SaleDataSql(Sale sale) {
        this.id = sale.getId();
        this.visited = getVisited();
        this.deals = getDeals();
        this.amount = getAmount();
        this.date = getDate();
        this.seller = getSeller();
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

    public SellerDataSql getSeller() {
        return seller;
    }

    public void setSeller(SellerDataSql seller) {
        this.seller = seller;
    }
}
