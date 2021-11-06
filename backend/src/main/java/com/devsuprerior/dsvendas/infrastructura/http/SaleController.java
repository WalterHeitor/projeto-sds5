package com.devsuprerior.dsvendas.infrastructura.http;

import com.devsuprerior.dsvendas.infrastructura.http.dto.SaleResponse;
import com.devsuprerior.dsvendas.infrastructura.usecases.ports.input.SaleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    private final SaleService saleService;

    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping
    public ResponseEntity<Page<SaleResponse>> findAll(Pageable pageable){
        Page<SaleResponse> saleResponseList = saleService.findAll(pageable);
        return ResponseEntity.ok().body(saleResponseList);
    }
}
