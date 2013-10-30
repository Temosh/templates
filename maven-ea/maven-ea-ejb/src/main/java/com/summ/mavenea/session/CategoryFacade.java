package com.summ.mavenea.session;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.summ.mavenea.entity.Category;


/**
 * Session Bean implementation class CategoryFacade
 */
@Stateless
@LocalBean
public class CategoryFacade extends AbstractFacade<Category> {

    @PersistenceContext(unitName = "maven-ea-ejb")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoryFacade() {
        super(Category.class);
    }

}
