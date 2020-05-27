package com.rhb.api.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Data
@Table(name = "red_packet_record")
public class RedPacketRecord implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "red_id")
    private String redId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "total_count")
    private Long totalCount;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    private Date optime;

    private Boolean isActive;
}