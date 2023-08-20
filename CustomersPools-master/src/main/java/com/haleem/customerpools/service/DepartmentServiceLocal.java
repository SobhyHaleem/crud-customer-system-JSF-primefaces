/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haleem.customerpools.service;

import com.haleem.customerpools.entity.Department;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author sobhy.haleem
 */
@Local
public interface DepartmentServiceLocal {
    
    public List<Department> findAllDepartments();
    
    public Department findDepartmentById(Integer departmentId);
}
