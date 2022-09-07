package com.fstop.test.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "STUDENT")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class country {

	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "name")
	private String name;

}
