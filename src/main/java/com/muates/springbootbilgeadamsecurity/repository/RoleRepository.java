package com.muates.springbootbilgeadamsecurity.repository;

import com.muates.springbootbilgeadamsecurity.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
