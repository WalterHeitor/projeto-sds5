package com.devsuprerior.dsvendas.infrastructura.usecases;

import com.devsuprerior.dsvendas.domain.dto.SaleResponse;
import com.devsuprerior.dsvendas.domain.entities.Sale;
import com.devsuprerior.dsvendas.domain.repositories.SaleRepository;
import com.devsuprerior.dsvendas.infrastructura.database.Postgres.SaleRepositoryData;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    private SaleRepositoryData saleRepositoryData;
    private SaleRepository saleRepository;

    public SaleService(SaleRepositoryData saleRepositoryData, SaleRepository saleRepository) {
        this.saleRepositoryData = saleRepositoryData;
        this.saleRepository = saleRepository;
    }

    public List<SaleResponse> findAll() {
        List<Sale> sales = saleRepository.findAll(saleRepositoryData);
        return sales.stream().map(sale -> new SaleResponse(sale))
                .collect(Collectors.toList());
    }


}
