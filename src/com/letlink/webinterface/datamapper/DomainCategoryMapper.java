package com.letlink.webinterface.datamapper;

import com.letlink.common.datamodel.DomainCategory;

public interface DomainCategoryMapper {
	public int insert(DomainCategory category);
	public DomainCategory selectById(int categoryID);
	public DomainCategory selectByName(String categoryName);
	public int update(DomainCategory category);
	public int delete(int categoryID);
}
