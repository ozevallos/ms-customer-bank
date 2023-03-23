package com.nttdata.customer.dto;

import java.util.Date;

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
	private Date dateCreate;
	private Date dateModify;
	private Date dateCustomer;
	
}
