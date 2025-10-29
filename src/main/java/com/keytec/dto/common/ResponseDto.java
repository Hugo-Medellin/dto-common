package com.keytec.dto.common;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto<T> {

    private Integer codigo_estatus = 0;
    private List<String> mensajes;
    private List<String> errores;
    private ZonedDateTime fecha_accion = ZonedDateTime.now();
    private ContenidoDto<T> contenido;

    public ResponseDto(Integer codigo_estatus, List<String> errores) {
        this.codigo_estatus = codigo_estatus;
        this.errores = errores;
    }

    public ResponseDto(Integer codigo_estatus, String error) {
        this.codigo_estatus = codigo_estatus;
        this.errores = Collections.singletonList(error);
    }

    public ResponseDto(ContenidoDto<T> contenido) {
        this.contenido = contenido;
    }

    public ResponseDto(List<String> mensajes) {
        this.mensajes = mensajes;
    }

    public ResponseDto(String message) {
        this.mensajes = Collections.singletonList(message);
    }
}