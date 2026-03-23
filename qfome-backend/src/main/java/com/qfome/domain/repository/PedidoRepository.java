package com.qfome.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qfome.domain.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    Optional<Pedido> findByCodigo(String codigo);
    List<Pedido> findByClienteIdOrderByDataCriacaoDesc(Long clienteId);
}
