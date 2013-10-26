package com.summ.app.session;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.summ.app.entity.Category;

/**
 * Session Bean implementation class CategoryFacade
 */
@Stateless
@LocalBean
public class CategoryFacade extends AbstractFacade<Category> {

    @PersistenceContext(unitName = "TestEEEJB")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoryFacade() {
        super(Category.class);
    }

}
