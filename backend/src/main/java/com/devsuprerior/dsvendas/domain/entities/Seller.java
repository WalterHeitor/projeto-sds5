package com.devsuprerior.dsvendas.domain.entities;

import com.devsuprerior.dsvendas.infrastructura.database.postgres.repositoryjpa.SellerRepositoryData;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class Seller {
    private Long id;
    private String name;

    private List<Sale> sales = new ArrayList<>();

    public Seller() {
    }

    public Seller(Long id, String name) {
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

    public List<Sale> getSales() {
        return sales;
    }

    @Override
    public String toString() {
        return "CommonSeller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
