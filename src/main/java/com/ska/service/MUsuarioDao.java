package com.ska.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ska.entity.MUsuario;

public interface MUsuarioDao extends JpaRepository<MUsuario, Long>{

}
