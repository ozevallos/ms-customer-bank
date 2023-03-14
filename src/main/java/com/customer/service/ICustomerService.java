package com.customer.service;

import com.customer.dto.CustomerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICustomerService {

	Flux<CustomerDTO> findAll();
    Mono<CustomerDTO> findById(String id);
    Mono<CustomerDTO> save(Mono<CustomerDTO> customerDtoMono);
    Mono<CustomerDTO> update(Mono<CustomerDTO> customerDtoMono, String id);
    Mono<Void> delete(String id);
	
}
