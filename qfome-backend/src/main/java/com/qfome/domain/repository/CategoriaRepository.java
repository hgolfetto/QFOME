package com.qfome.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qfome.domain.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Optional<Categoria> findBySlug(String slug);
    boolean existsBySlug(String slug);
}
