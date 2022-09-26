package com.example.server.exampleserver.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import com.google.common.collect.Lists;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Voucher {

    private int id;

    private String title;

    private LocalDate expiryDate;

    @JsonIgnore
    public List<Voucher> getAllVouchers() {
        return (voucherList);
    }
    static Random random = new Random();
    static long randomExpiryDurationInDays = random.nextLong(1, 11);

    static List<Voucher> voucherList = Lists.newArrayList(
            new Voucher(0, "Discount 10%", LocalDate.now().plusDays(randomExpiryDurationInDays)),
            new Voucher(1, "Discount 5%", LocalDate.now().plusDays(randomExpiryDurationInDays)),
            new Voucher(2, "Discount 30%", LocalDate.now().plusDays(randomExpiryDurationInDays)),
            new Voucher(3, "$50 off", LocalDate.now().plusDays(randomExpiryDurationInDays)));
}
