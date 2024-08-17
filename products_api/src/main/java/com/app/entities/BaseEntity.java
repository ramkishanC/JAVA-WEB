package com.app.entities;

import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@MappedSuperclass 
@Data
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
}
