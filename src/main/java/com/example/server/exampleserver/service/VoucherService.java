package com.example.server.exampleserver.service;

import com.example.server.exampleserver.model.Voucher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class VoucherService {

    Voucher voucher = new Voucher();

    public List<Voucher> getAllVouchers() {
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(1000, 5000)); // Simulates server processing
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return voucher.getAllVouchers();
    }
}
