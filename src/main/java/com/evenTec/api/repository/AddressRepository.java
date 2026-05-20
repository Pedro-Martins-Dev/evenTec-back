package com.evenTec.api.repository;

import com.evenTec.api.domain.AddressDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<AddressDomain, UUID> {
}
