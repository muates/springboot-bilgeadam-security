package com.muates.springbootbilgeadamsecurity.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductPageRequest {
    private Integer page;
    private Integer size;
}
