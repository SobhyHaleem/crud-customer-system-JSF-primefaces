
package com.haleem.customerpools.entityservice;

import com.haleem.customerpools.entity.Department;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sobhy.haleem
 */
@Stateless
public class DepartmentFacade extends AbstractFacade<Department> implements DepartmentFacadeLocal {

   @PersistenceContext(unitName = "com.acme_AcmePools_war_AcmePools-1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DepartmentFacade() {
        super(Department.class);
    }

    @Override
    public Department findById(Integer departmentId) {
        return (Department) em.createNamedQuery(Department.FIND_BY_ID).setParameter("id", departmentId).getSingleResult();
    }
}
