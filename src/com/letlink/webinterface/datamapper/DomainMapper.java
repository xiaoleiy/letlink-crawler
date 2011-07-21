package com.letlink.webinterface.datamapper;

import java.util.List;

import com.letlink.common.datamodel.Domain;

public interface DomainMapper {
	public int insert(Domain domain);
	public Domain selectById(long id);
	public Domain selectByName(String name);
	public List<Domain> selectAllCrawling(boolean isCrawling);
	public List<Domain> selectAllByCategory(int categoryID);
	public List<Domain> selectAll();
	public int update(Domain domain);
	public int delete(long domainID);
}
