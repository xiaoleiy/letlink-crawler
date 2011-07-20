package com.letlink.webinterface.datamapper;

import java.util.List;

import com.letlink.common.datamodel.Category;

public interface CategoryMapper {
	public int insert(Category category);
	public Category selectById(int categoryID);
	public Category selectByName(String categoryName);
	public List<Category> selectAll();
	public int update(Category category);
	public int delete(int categoryID);
}
