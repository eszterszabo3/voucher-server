package com.example.server.exampleserver.controller;

import com.example.server.exampleserver.model.Voucher;
import com.example.server.exampleserver.service.VoucherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoucherController {

    private final VoucherService voucherService;

    public VoucherController(VoucherService voucherService) {
        this.voucherService = voucherService;
    }

    @GetMapping("/vouchers")
    public List<Voucher> retrieveAllVouchers() {
        return voucherService.getAllVouchers();
    }

}
