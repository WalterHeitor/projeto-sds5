package com.devsuprerior.dsvendas.infrastructura.usecases;

import com.devsuprerior.dsvendas.domain.entities.Sale;
import com.devsuprerior.dsvendas.domain.repositories.SaleRepository;
import com.devsuprerior.dsvendas.domain.repositories.SellerRepository;
import com.devsuprerior.dsvendas.infrastructura.http.dto.response.SaleResponse;
import com.devsuprerior.dsvendas.infrastructura.http.dto.response.SaleSuccessResponse;
import com.devsuprerior.dsvendas.infrastructura.http.dto.response.SaleSumResponse;
import com.devsuprerior.dsvendas.infrastructura.usecases.ports.input.SaleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {

    private final SaleRepository saleRepository;
    private final SellerRepository sellerRepository;

    public SaleServiceImpl(SaleRepository saleRepository, SellerRepository sellerRepository) {
        this.saleRepository = saleRepository;
        this.sellerRepository = sellerRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public Page<SaleResponse> findAll(Pageable pageable) {
        sellerRepository.findAllSellers();      // => isto e para jpa manter em cache.
        Page<Sale> sales = saleRepository.findAlSales(pageable);

        return sales.map(sale -> new SaleResponse(sale));
    }

    @Transactional(readOnly = true)
    @Override
    public List<SaleSumResponse> amountGroupedBySeller() {
        return saleRepository.amountGroupedBySeller();
    }

    @Override
    public List<SaleSuccessResponse> successGroupedBySeller() {
        return saleRepository.successGroupedBySeller();
    }
}
