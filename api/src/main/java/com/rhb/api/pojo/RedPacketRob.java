package com.rhb.api.pojo;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Data
@Table(name = "red_packet_rob")
public class RedPacketRob implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="red_id")
    private String redId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "red_amount")
    private BigDecimal redAmount;

    @Column(name = "is_active")
    private Boolean isActive;

    private Date optime;

}