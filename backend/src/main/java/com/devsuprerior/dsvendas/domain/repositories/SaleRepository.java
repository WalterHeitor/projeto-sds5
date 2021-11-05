package com.devsuprerior.dsvendas.domain.repositories;

import com.devsuprerior.dsvendas.domain.entities.Sale;

import java.util.List;

public interface SaleRepository {
    List<Sale> findAlSales();
}
