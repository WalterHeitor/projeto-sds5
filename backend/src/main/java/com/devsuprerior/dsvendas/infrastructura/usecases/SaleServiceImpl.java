package com.devsuprerior.dsvendas.infrastructura.usecases;

import com.devsuprerior.dsvendas.domain.entities.Sale;
import com.devsuprerior.dsvendas.domain.repositories.SaleRepository;
import com.devsuprerior.dsvendas.infrastructura.usecases.ports.input.SaleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {

    private final SaleRepository saleRepository;

    public SaleServiceImpl(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @Override
    public List<Sale> listSales() {
        return saleRepository.findAlSales();
    }
}
