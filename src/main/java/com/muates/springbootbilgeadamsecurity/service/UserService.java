package com.muates.springbootbilgeadamsecurity.service;

import com.muates.springbootbilgeadamsecurity.model.dto.UserAddRequest;
import com.muates.springbootbilgeadamsecurity.model.entity.User;

public interface UserService {
    User addUser(UserAddRequest request);
}
