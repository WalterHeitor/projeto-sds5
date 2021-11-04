package com.devsuprerior.dsvendas.infrastructura.database.Postgres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepositoryData extends JpaRepository<SaleDataSql, Long> {
}
