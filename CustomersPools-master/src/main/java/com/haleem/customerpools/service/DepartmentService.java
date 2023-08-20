/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haleem.customerpools.service;

import com.haleem.customerpools.entity.Department;
import com.haleem.customerpools.entityservice.DepartmentFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author sobhy.haleem
 */
@Stateless
public class DepartmentService implements DepartmentServiceLocal {
    
    @EJB
    private DepartmentFacadeLocal departmentFacadeLocal;

    public List<Department> findAllDepartments() {
        return departmentFacadeLocal.findAll();
    }

    @Override
    public Department findDepartmentById(Integer departmentId) {
        return departmentFacadeLocal.findById(departmentId);
    }
}
