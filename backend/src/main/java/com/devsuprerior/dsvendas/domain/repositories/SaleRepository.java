package com.devsuprerior.dsvendas.domain.repositories;

import com.devsuprerior.dsvendas.domain.entities.Sale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SaleRepository {
    Page<Sale> findAlSales(Pageable pageable);
}
