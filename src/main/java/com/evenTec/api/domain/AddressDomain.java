package com.evenTec.api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "adress")
@Entity

public class AddressDomain {
	@Id
	@GeneratedValue
	private UUID id;

	private String city;
	private String uf;

	@ManyToOne
	@JoinColumn(name = "event_id")
	private EventDomain eventDomain;
}
