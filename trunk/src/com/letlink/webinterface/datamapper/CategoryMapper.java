package com.letlink.webinterface.datamapper;

import com.letlink.common.datamodel.Category;

public interface CategoryMapper {
	public int insert(Category category);
	public Category selectById(int categoryID);
	public Category selectByName(String categoryName);
	public int update(Category category);
	public int delete(int categoryID);
}
