package com.evenTec.api.repository;

import com.evenTec.api.domain.CouponDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouponInterface extends JpaRepository<CouponDomain, UUID> {
}
