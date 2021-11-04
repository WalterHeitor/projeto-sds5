package com.devsuprerior.dsvendas.domain.repositories;

import com.devsuprerior.dsvendas.domain.entities.Seller;
import com.devsuprerior.dsvendas.infrastructura.database.Postgres.SellerRepositoryData;

import java.util.List;

public interface SellerRepository {
    List<Seller> findAll(SellerRepositoryData repositoryData);
}
