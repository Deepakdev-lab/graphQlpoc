package com.dashboardapi.whkstatusapi.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Entity
@Table(name = "overall_uptime")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class OverallUptime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "time_period")
    private String timePeriod;
    private BigDecimal percentage;
    @Column(name = "org_id")
    private Long orgId;
}
