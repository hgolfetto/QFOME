package com.qfome.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qfome.domain.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Optional<Produto> findBySlug(String slug);
    List<Produto> findByCategoriaSlugAndAtivoTrue(String categoriaSlug);
}
