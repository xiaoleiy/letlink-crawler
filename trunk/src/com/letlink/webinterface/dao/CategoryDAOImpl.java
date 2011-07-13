package com.letlink.webinterface.dao;

import com.letlink.common.datamodel.Category;
import com.letlink.webinterface.datamapper.CategoryMapper;

import com.google.inject.Inject;

public class CategoryDAOImpl implements CategoryDAO {

	@Inject
	private CategoryMapper categoryMapper;  
	
	@Override
	public int insert(Category category) {
		int rows = categoryMapper.insert(category);
		return 0;
	}

	@Override
	public int update(Category category) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Category getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
