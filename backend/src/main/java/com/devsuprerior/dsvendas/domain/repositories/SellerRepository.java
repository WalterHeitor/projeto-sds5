package com.devsuprerior.dsvendas.domain.repositories;

import com.devsuprerior.dsvendas.domain.entities.Seller;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SellerRepository {
    List<Seller> findAllSellers();
}
