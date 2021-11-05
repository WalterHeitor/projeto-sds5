package com.devsuprerior.dsvendas.infrastructura.usecases.ports.input;

import com.devsuprerior.dsvendas.domain.entities.Sale;

import java.util.List;

public interface SaleService {

    List<Sale> listSales();
}
