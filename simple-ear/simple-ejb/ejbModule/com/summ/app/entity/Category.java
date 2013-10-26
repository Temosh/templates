package com.summ.app.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the category database table.
 * 
 */
@Entity
@NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c")
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "category_id")
    private int categoryId;

    private String name;

    @Column(name = "parent_category")
    private int parentCategory;

    public Category() {
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentCategory() {
        return this.parentCategory;
    }

    public void setParentCategory(int parentCategory) {
        this.parentCategory = parentCategory;
    }

}