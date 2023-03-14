package com.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.dto.CustomerDTO;
import com.customer.model.Customer;
import com.customer.repository.CustomerRepository;
import com.customer.service.ICustomerService;
import com.customer.utils.AppUtils;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	CustomerRepository _customerRepository;

	@Override
    public Flux<CustomerDTO> findAll() {
        return _customerRepository.findAll().map(AppUtils::entityToDto);
    }

    @Override
    public Mono<CustomerDTO> findById(String id) {
        return _customerRepository.findById(id).map(AppUtils::entityToDto);
    }

    @Override
    public Mono<CustomerDTO> save(Mono<CustomerDTO> customerDtoMono) {

        return customerDtoMono.map(AppUtils::dtoToEntity)
                .flatMap(_customerRepository::insert)
                .map(AppUtils::entityToDto);
    }

    @Override
    public Mono<CustomerDTO> update(Mono<CustomerDTO> customerDtoMono, String id) {
        return _customerRepository.findById(id)
                .flatMap(p->customerDtoMono.map(AppUtils::dtoToEntity))
                .doOnNext(e->e.setId(id))
                .flatMap(_customerRepository::save)
                .map(AppUtils::entityToDto);
    }

    @Override
    public Mono<Void> delete(String id) {
        return _customerRepository.deleteById(id);
    }
	
}
