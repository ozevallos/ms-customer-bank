package com.nttdata.customer.utils;

import com.nttdata.customer.dto.CustomerDTO;
import com.nttdata.customer.model.Customer;

import org.springframework.beans.BeanUtils;

public class AppUtils {

    public static CustomerDTO entityToDto(Customer customer){
    	CustomerDTO customerDto = new CustomerDTO();
        BeanUtils.copyProperties(customer,customerDto);
        return customerDto;
    }

    public static Customer dtoToEntity(CustomerDTO customerDto){
    	Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto,customer);
        return customer;
    }
}
