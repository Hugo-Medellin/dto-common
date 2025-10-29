package com.keytec.dto.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginacionDto {
    private boolean last;
    private Long totalElements;
    private int totalPages;
    private int size;
    private int number;
    private boolean first;
    private int numberOfElements;
    private boolean empty;
}