package com.muates.springbootbilgeadamsecurity.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserAddRequest {

    private String username;
    private String password;
    private List<RoleDto> roles;
}
