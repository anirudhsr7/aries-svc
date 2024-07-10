package com.example.AriesSvc.repository;

import com.example.AriesSvc.model.Outlet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutletRepository extends JpaRepository<Outlet, Long> {
}
