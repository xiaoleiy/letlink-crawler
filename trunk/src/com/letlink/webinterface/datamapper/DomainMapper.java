package com.letlink.webinterface.datamapper;

import java.util.List;

import com.letlink.common.datamodel.Domain;

public interface DomainMapper {
	public void insert();
	public Domain selectById(long id);
	public Domain selectByName(int name);
	public List<Domain> selectAllCrawling(boolean isCrawling);
	public List<Domain> selectAllByCategory(int categoryID);
	public void update(Domain domain);
	public void delete(long domainID);
}
