package com.muates.springbootbilgeadamsecurity.service.impl;

import com.muates.springbootbilgeadamsecurity.model.dto.UserAddRequest;
import com.muates.springbootbilgeadamsecurity.model.entity.Role;
import com.muates.springbootbilgeadamsecurity.model.entity.User;
import com.muates.springbootbilgeadamsecurity.repository.RoleRepository;
import com.muates.springbootbilgeadamsecurity.repository.UserRepository;
import com.muates.springbootbilgeadamsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    //todo: refactor edilecek
    @Override
    public User addUser(UserAddRequest request) {
        List<Role> roleList = roleRepository.findAll();
        List<Long> role_ids = new ArrayList<>();
        for (var role : request.getRoles())
            role_ids.add(role.getId());

        User user = User.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .roles(roleList
                        .stream()
                        .filter(role -> role_ids.contains(role.getId()))
                        .collect(Collectors.toList()))
                .build();

        return userRepository.save(user);
    }
}
