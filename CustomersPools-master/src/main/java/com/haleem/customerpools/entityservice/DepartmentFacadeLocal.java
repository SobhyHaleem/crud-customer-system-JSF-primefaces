/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haleem.customerpools.entityservice;

import com.haleem.customerpools.entity.Department;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sobhy.haleem
 */
@Local
public interface DepartmentFacadeLocal {
    
    public List<Department> findAll();
    
    public Department findById(Integer departmentId);
}
