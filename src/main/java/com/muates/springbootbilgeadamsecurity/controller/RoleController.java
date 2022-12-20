package com.muates.springbootbilgeadamsecurity.controller;

import com.muates.springbootbilgeadamsecurity.model.entity.Role;
import com.muates.springbootbilgeadamsecurity.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/role")
public class RoleController {

    private final RoleService roleService;

    @PostMapping("/add")
    public Role addRole(@RequestBody Role role) {
        return roleService.addRole(role);
    }
}
