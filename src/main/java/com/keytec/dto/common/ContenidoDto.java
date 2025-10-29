package com.keytec.dto.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContenidoDto<T> {
    private T info;
    private PaginacionDto paginacion;

    public ContenidoDto(T info) {
        this.info = info;
    }
}