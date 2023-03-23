package com.nttdata.customer.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="customer")
public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	//codigo unico de cliente
	private String id;

	//Nombre de cliente o nombre de empresa
	private String name;
	
	//Primer Apellido de cliente personal
	private String lastName1;
	
	//Segundo Apellido de cliente personal
	private String lastName2;

	//Numero de identificación (DNI, CARNET_EXT,RUC, PASAPORTE y PART_NACIMIENTO )
	private String docId;
	
	//Tipo de documento de identificación (DNI-01, CARNET_EXT-04,RUC-06, PASAPORTE-07 y PART_NACIMIENTO-11)
	private String documentType;
	
	//Tipo de cliente
	private String customerType;
	
	//Fecha creacion del registro
	private Date dateCreate;
	
	//Fecha modificacion del registro
	private Date dateModify;
	
	//Fecha nacimiento para personas y creacion para empresas
	private Date dateCustomer;
	
}
