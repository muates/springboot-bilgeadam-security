package com.muates.springbootbilgeadamsecurity.service.impl;

import com.muates.springbootbilgeadamsecurity.model.entity.Role;
import com.muates.springbootbilgeadamsecurity.repository.RoleRepository;
import com.muates.springbootbilgeadamsecurity.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }
}
