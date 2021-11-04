package com.devsuprerior.dsvendas.domain.repositories;

import com.devsuprerior.dsvendas.domain.entities.Sale;
import com.devsuprerior.dsvendas.infrastructura.database.Postgres.SaleRepositoryData;

import java.util.List;

public interface SaleRepository {
    List<Sale> findAll(SaleRepositoryData saleRepositoryData);
}
