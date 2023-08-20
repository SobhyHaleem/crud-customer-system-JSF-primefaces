/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haleem.customerpools.entityservice;

import com.haleem.customerpools.entity.Customer;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sobhy.haleem
 */
@Local
public interface CustomerFacadeLocal {
    
    public void create(Customer customer);
    
    public void edit(Customer customer);
    
    public void remove(Customer customer);
    
    public Customer findById(Integer customerId);
    
    public List<Customer> findAll();
   
}
