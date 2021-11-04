package com.devsuprerior.dsvendas.infrastructura.usecases;

import com.devsuprerior.dsvendas.domain.dto.SaleResponse;
import com.devsuprerior.dsvendas.domain.entities.Sale;
import com.devsuprerior.dsvendas.domain.repositories.SaleRepository;
import com.devsuprerior.dsvendas.infrastructura.database.Postgres.SaleRepositoryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class SaleService {

    @Autowired
    private SaleRepositoryData saleRepositoryData;
    @Autowired
    private SaleRepository saleRepository;



    public List<SaleResponse> findAll() {
        List<Sale> sales = saleRepository.findAll(saleRepositoryData);
        return sales.stream().map(sale -> new SaleResponse(sale))
                .collect(Collectors.toList());
    }


}
