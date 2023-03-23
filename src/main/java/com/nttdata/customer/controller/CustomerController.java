package com.nttdata.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.customer.dto.CustomerDTO;
import com.nttdata.customer.service.CustomerService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustomerService _customerService;
		
	@GetMapping
    public Flux<CustomerDTO> findAll(){
        return _customerService.findAll();
    }

	@GetMapping("/{id}")
    public Mono<CustomerDTO> findProduct(@PathVariable String id){
        return _customerService.findById(id);
    }

	@PostMapping(value="registrar",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<CustomerDTO> save(@RequestBody Mono<CustomerDTO> customerDtoMono){
        return _customerService.save(customerDtoMono);
    }

	@PutMapping("/{id}")
    public Mono<CustomerDTO> update(@RequestBody Mono<CustomerDTO> customerDtoMono, @PathVariable String id){
        return _customerService.update(customerDtoMono,id);
    }

	@DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return _customerService.delete(id);
    }
}
