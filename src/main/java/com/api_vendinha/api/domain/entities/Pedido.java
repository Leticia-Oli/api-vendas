package com.api_vendinha.api.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pedidos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "produto_id")
    private Long produtoId;

    @Column(name = "qtde")
    private Long qtde;

    @Column(name = "preco")
    private Double preco;
}
