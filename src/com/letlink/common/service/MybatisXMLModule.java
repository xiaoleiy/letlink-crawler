package com.letlink.common.service;

import org.mybatis.guice.XMLMyBatisModule;

public class MybatisXMLModule extends XMLMyBatisModule {

	@Override
	protected void initialize() {
		setEnvironmentId("innodb"); // Change to customize environment 
		setClassPathResource("com/letlink/webinterface/datamapper/mybatis-config.xml");
	}

}
