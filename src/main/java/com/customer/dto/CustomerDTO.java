package com.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
	
	private String id;
	private String name;
	private String lastName1;
	private String lastName2;
	private String docId;
	private String documentType;
	private String customerType;
	private String dateCreate;
	private String dateModify;
	private String dateCustomer;
	
}
