package com.syam.binding;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class MyForm {
	@NotNull(message="number is mandatory")
	@Min(value=1,message =" give one number ")
	@Max(value=4, message =" give one number ")
	private Integer field1;
	
	@NotNull
	@Min(value=21, message =" min 21 give ur age")
	@Max(value =100,message="max 100 give ur age")
	private Integer field2;
	
	
	@NotEmpty(message = " give ur name ")
	@Size(min=3, max=30, message =" give ur name ")
	private String field3;
	
	
	@NotNull
	private Double field4;
	
	@NotEmpty(message="email requiried ")
	@Email(message="Enter valid email ")
	private String Email;

}
