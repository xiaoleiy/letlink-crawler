package com.letlink.webinterface.servlets;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.logging.Logger;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;

import com.letlink.common.datamodel.Category;
import com.letlink.common.datamodel.Domain;
import com.letlink.webinterface.datamapper.CategoryMapper;
import com.letlink.webinterface.datamapper.DomainMapper;

public class TestDomainWOGuice {
	
	private static final String MAPPER_CONFIG = "com/letlink/webinterface/datamapper/mybatis-config.xml";
	private static final String DB_ENV = "development";
	private Logger logger = Logger.getLogger("TestDomainWOGuice");
	private SqlSession session;
	private CategoryMapper categoryMapper;
	private DomainMapper domainMapper;
	
	@Before
	public void setUp() throws Exception {
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader(MAPPER_CONFIG), DB_ENV);
		session = factory.openSession();
		categoryMapper = session.getMapper(CategoryMapper.class);
		domainMapper   = session.getMapper(DomainMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		session.commit();
		session.close();
	}

	@Test
	public void test() {
		Category category = new Category("News", "news, contest...");
		int rows = categoryMapper.insert(category);
		assertEquals(rows, 1);
		logger.info("[INFO] ID of the inserted category: " + category.getCategoryID());
	}
	
	@Test
	public void testDomain() {
		Domain domain = new Domain("http://www.douban.com", "douban", true, "Douban is a community for discovering new life!");
		int rows = domainMapper.insert(domain);
		assertEquals(rows, 1);
		logger.info("[INFO] ID of the inserted domain: " + domain.getDomainID());
	}

}
