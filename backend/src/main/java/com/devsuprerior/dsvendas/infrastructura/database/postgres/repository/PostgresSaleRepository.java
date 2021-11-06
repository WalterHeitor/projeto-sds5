package com.devsuprerior.dsvendas.infrastructura.database.postgres.repository;

import com.devsuprerior.dsvendas.domain.entities.Sale;
import com.devsuprerior.dsvendas.domain.repositories.SaleRepository;
import com.devsuprerior.dsvendas.infrastructura.database.postgres.datasql.SaleDataSql;
import com.devsuprerior.dsvendas.infrastructura.database.postgres.repositoryjpa.SaleRepositoryData;
import com.devsuprerior.dsvendas.infrastructura.http.dto.response.SaleSuccessResponse;
import com.devsuprerior.dsvendas.infrastructura.http.dto.response.SaleSumResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostgresSaleRepository implements SaleRepository {

    private final SaleRepositoryData saleRepositoryData;

    public PostgresSaleRepository(SaleRepositoryData saleRepositoryData) {
        this.saleRepositoryData = saleRepositoryData;
    }


    @Override
    public Page<Sale> findAlSales(Pageable pageable) {
        Page<SaleDataSql> saleDataSqls = saleRepositoryData.findAll(pageable);
        return saleDataSqls.map(saleDataSql -> {
            Sale sale = new Sale(
                    saleDataSql.getId(),
                    saleDataSql.getVisited(),
                    saleDataSql.getDeals(),
                    saleDataSql.getAmount(),
                    saleDataSql.getDate()
            );
            return sale;
        });
    }

    @Override
    public List<SaleSumResponse> amountGroupedBySeller() {
        return saleRepositoryData.amountGroupedBySeller();
    }

    @Override
    public List<SaleSuccessResponse> successGroupedBySeller() {
        return saleRepositoryData.successGroupedBySeller();
    }
}
