package com.ska.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ska.entity.Roles;

public interface RolesDao extends JpaRepository<Roles, Long> {

}
