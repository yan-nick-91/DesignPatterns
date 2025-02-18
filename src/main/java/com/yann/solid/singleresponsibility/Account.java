package com.yann.solid.singleresponsibility;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class Account {
        private int accountNumber;
        private String firstName;
        private BigDecimal totalAmount;
}
