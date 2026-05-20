package com.evenTec.api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Coupon")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Coupon {
	@Id
	@GeneratedValue
	private UUID id;

	private Integer descount;
	private Date valid;

	@ManyToOne
	@JoinColumn(name = "event_id")
	private Event event;
}
