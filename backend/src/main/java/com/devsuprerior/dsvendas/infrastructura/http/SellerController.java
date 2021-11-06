package com.devsuprerior.dsvendas.infrastructura.http;

import com.devsuprerior.dsvendas.infrastructura.http.dto.SellerResponse;
import com.devsuprerior.dsvendas.infrastructura.usecases.SellerServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {
    private SellerServiceImpl sellerService;

    public SellerController(SellerServiceImpl sellerService) {
        this.sellerService = sellerService;
    }

    @GetMapping
    public ResponseEntity<List<SellerResponse>> findAll() {
        List<SellerResponse> sellerResponseList = sellerService.findAll();
        return ResponseEntity.ok(sellerResponseList);
    }
}
