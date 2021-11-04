package com.devsuprerior.dsvendas.domain.dto;

import com.devsuprerior.dsvendas.domain.entities.Seller;

import java.time.LocalDate;

public class SaleRequest {
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    private Seller seller;
}
