package com.devsuprerior.dsvendas.infrastructura.database.postgres.repositoryjpa;

import com.devsuprerior.dsvendas.infrastructura.database.postgres.datasql.SaleDataSql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepositoryData extends JpaRepository<SaleDataSql, Long> {
}
