package com.example.demo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SoldCount {
    Integer totalCount;
    Integer soldCount;
}
