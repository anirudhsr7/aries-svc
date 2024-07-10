package com.example.AriesSvc.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "table_data")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Outlet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "outlet_name")
    private String outletName;

    @Column(name = "sale_offer")
    private String saleOffer;

}
