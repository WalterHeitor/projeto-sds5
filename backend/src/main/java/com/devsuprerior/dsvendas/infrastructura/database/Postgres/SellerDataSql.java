package com.devsuprerior.dsvendas.infrastructura.database.Postgres;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "tb_sellers")
public class SellerDataSql {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "seller")
    private List<SaleDataSql> sales = new ArrayList<>();

    public SellerDataSql() {
    }

    public SellerDataSql(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SaleDataSql> getSales() {
        return sales;
    }
}
