package com.api_vendinha.api.domain.dtos.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PedidoResponseDto {
    private Long id;

    private Long userId;

    private Long produtoId;

    private Long qtde;

    private Double preco;
}
