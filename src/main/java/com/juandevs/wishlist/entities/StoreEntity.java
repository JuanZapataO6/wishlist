package com.juandevs.wishlist.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "stores")
@Getter
@Setter
@NoArgsConstructor
public class StoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_store", nullable = false)
    private Integer storeId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;
}
