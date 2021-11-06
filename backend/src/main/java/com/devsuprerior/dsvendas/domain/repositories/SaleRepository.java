package com.devsuprerior.dsvendas.domain.repositories;

import com.devsuprerior.dsvendas.domain.entities.Sale;
import com.devsuprerior.dsvendas.infrastructura.http.dto.response.SaleSuccessResponse;
import com.devsuprerior.dsvendas.infrastructura.http.dto.response.SaleSumResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SaleRepository {
    Page<Sale> findAlSales(Pageable pageable);

    List<SaleSumResponse> amountGroupedBySeller();
    List<SaleSuccessResponse>successGroupedBySeller();
}
