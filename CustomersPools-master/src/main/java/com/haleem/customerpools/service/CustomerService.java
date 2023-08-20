/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haleem.customerpools.service;

import com.haleem.customerpools.entity.Customer;
import com.haleem.customerpools.entityservice.CustomerFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author sobhy.haleem
 */
@Stateless
public class CustomerService implements CustomerServiceLocal {

    @EJB
    private CustomerFacadeLocal customerFacade;

    @Override
    public void addCustomer(Customer customer) {
        customerFacade.create(customer);
    }

    @Override
    public void editCustomer(Customer customer) {
        customerFacade.edit(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerFacade.remove(customer);
    }
    
    @Override
    public Customer findById(Integer customerId) {
        return customerFacade.findById(customerId);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerFacade.findAll();
    }
    
}
