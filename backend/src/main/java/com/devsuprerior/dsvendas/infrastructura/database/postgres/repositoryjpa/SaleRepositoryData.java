package com.devsuprerior.dsvendas.infrastructura.database.postgres.repositoryjpa;

import com.devsuprerior.dsvendas.infrastructura.database.postgres.datasql.SaleDataSql;
import com.devsuprerior.dsvendas.infrastructura.http.dto.response.SaleSuccessResponse;
import com.devsuprerior.dsvendas.infrastructura.http.dto.response.SaleSumResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepositoryData extends JpaRepository<SaleDataSql, Long> {

    @Query("SELECT" +
            " new com.devsuprerior.dsvendas.infrastructura.http.dto.response" +
            ".SaleSumResponse(obj.seller, SUM(obj.amount))" +
            " FROM SaleDataSql as obj GROUP BY obj.seller")
    List<SaleSumResponse> amountGroupedBySeller();

    @Query("SELECT" +
            " new com.devsuprerior.dsvendas.infrastructura.http.dto.response" +
            ".SaleSuccessResponse(obj.seller, SUM(obj.visited), SUM(obj.deals))" +
            " FROM SaleDataSql as obj GROUP BY obj.seller")
    List<SaleSuccessResponse> successGroupedBySeller();

}
