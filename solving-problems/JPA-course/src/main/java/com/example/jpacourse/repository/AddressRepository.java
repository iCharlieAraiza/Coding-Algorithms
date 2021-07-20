package com.example.jpacourse.repository;

import com.example.jpacourse.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository< Address, Long> {
}
