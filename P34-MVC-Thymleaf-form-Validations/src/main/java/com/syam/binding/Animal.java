package com.syam.binding;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Animal {
	
	//@NotNull(message = "id is mandatory...!")
	@Min(value=1)
	@Max(value=3)
	private Integer id;
	
	@Size(min=2, max=20)
	@NotEmpty(message = "name is mandatory...!")
	private String name;
	
	@NotNull(message = "type is mandatory...!")
	private String species;
	
	@NotEmpty(message = "location is mandatory...!")
	private String loc; 
}
