/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haleem.customerpools.service;

import com.haleem.customerpools.entity.Customer;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sobhy.haleem
 */
@Local
public interface CustomerServiceLocal {
    
    public void addCustomer(Customer customer) ;

    public void editCustomer(Customer customer) ;

    public void deleteCustomer(Customer customer);
    
    public Customer findById(Integer customerId);
    
    public List<Customer> findAllCustomers();
    
}
