package com.devsuprerior.dsvendas.infrastructura.usecases.ports.input;

import com.devsuprerior.dsvendas.infrastructura.http.dto.response.SaleResponse;
import com.devsuprerior.dsvendas.infrastructura.http.dto.response.SaleSuccessResponse;
import com.devsuprerior.dsvendas.infrastructura.http.dto.response.SaleSumResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SaleService {

    Page<SaleResponse> findAll(Pageable pageable);
    List<SaleSumResponse> amountGroupedBySeller();
    List<SaleSuccessResponse> successGroupedBySeller();
}
