package com.letlink.webinterface.datamapper;

import com.letlink.common.datamodel.Category;

public interface CategoryMapper {
	public void insert(Category category);
	public Category selectById(int categoryID);
	public Category selectByName(String categoryName);
	public void update(Category category);
	public void delete(int categoryID);
	public int selectRowCount();
}
