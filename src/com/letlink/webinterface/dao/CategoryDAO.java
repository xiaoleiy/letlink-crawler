package com.letlink.webinterface.dao;

import com.letlink.common.datamodel.Category;

public interface CategoryDAO {
	public int insert(Category category);
	public int update(Category category);
	public int delete(int id);
	public Category getById(int id);
	public Category getByName(String name);
}