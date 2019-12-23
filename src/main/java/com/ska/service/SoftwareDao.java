package com.ska.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ska.entity.Software;

public interface SoftwareDao extends JpaRepository<Software, Long>{

}
