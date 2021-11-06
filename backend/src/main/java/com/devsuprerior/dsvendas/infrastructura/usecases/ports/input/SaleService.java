package com.devsuprerior.dsvendas.infrastructura.usecases.ports.input;

import com.devsuprerior.dsvendas.infrastructura.http.dto.SaleResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SaleService {

    Page<SaleResponse> findAll(Pageable pageable);
}
