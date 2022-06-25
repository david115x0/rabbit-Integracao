package com.dh.catalago.repository;


import com.dh.catalago.entity.Catalago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogoRepository extends JpaRepository<Catalago, Long> {
}
