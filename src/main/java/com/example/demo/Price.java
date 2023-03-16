package com.example.demo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Price {
    Double price;
    Double discount;
}
