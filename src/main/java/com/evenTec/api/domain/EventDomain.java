package com.evenTec.api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "Event")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventDomain {
	@Id
	@GeneratedValue
	private UUID id;

	private String title;
	private String description;
	private String imgUrl;
	private Boolean remote;
	private Date date;
}
