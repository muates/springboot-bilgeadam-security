package com.muates.springbootbilgeadamsecurity.repository;

import com.muates.springbootbilgeadamsecurity.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}
