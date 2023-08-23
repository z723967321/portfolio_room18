package com.room18.common.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
public class TransactionRecordVO {
    private Long trId;
    private Long userId;
    private String transactionTypeString;

    private Long numberOfTransaction;

    private Long productionId;

    private String productionTypeString;

    private Long productionDetailId;

    private BigDecimal productionPrice;

    private BigDecimal cost;

    private BigDecimal remainCash;

    private LocalDateTime time;

    // Getter and Setter methods
}