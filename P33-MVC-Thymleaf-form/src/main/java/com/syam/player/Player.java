package com.syam.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Player {
	
	@Column(length = 3)
	@Id
	private Integer id;
	
	@Column(length = 20)
	private String name;
	
	@Column(length = 2)
	private Integer age;
	
	@Column(length = 10)
	private String event;

}
