package com.letlink.common.service;

import java.util.Properties;

import com.google.inject.name.Names;
import com.letlink.common.datamodel.Category;
import com.letlink.common.datamodel.Domain;
import com.letlink.webinterface.datamapper.CategoryMapper;
import com.letlink.webinterface.datamapper.DomainMapper;

import static com.google.inject.name.Names.named;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.guice.MyBatisModule;
import org.mybatis.guice.datasource.builtin.PooledDataSourceProvider;

public class MyGuiceModule extends MyBatisModule {

	@Override
	protected void initialize() {
		bindDataSourceProviderType(PooledDataSourceProvider.class);
		bindTransactionFactoryType(JdbcTransactionFactory.class);
		environmentId("innodb");
		binder().bindConstant().annotatedWith(named("mybatis.configuration.cacheEnabled")).to("true");
		binder().bindConstant().annotatedWith(named("mybatis.configuration.lazyLoadingEnabled")).to(false);
		binder().bindConstant().annotatedWith(named("mybatis.configuration.aggressiveLazyLoading")).to(false);
		binder().bindConstant().annotatedWith(named("mybatis.configuration.autoMappingBehavior")).to("PARTIAL");
		binder().bindConstant().annotatedWith(named("mybatis.configuration.defaultExecutorType")).to("SIMPLE");
		addSimpleAlias(Category.class);
		addSimpleAlias(Domain.class);
		addMapperClass(CategoryMapper.class);
		addMapperClass(DomainMapper.class);
		Names.bindProperties(this.binder(), getConnProperties());
	}
	
	/**
	 * TODO: to read database properties from dbconfig.properties, and wrap the properties with given parameters: env_id, db_name 
	 * */
	public Properties getConnProperties(){
		final Properties props = new Properties();
		props.setProperty("mybatis.environment.id", "innodb"); //TODO: delete to test the method environmentId("innodb");
		props.setProperty("JDBC.driver", "com.mysql.jdbc.Driver"); // why need JDBC as prefix?
		props.setProperty("JDBC.url", "jdbc:mysql://192.168.1.130:3306/letlink_webcrawler");
		props.setProperty("JDBC.username", "root");
		props.setProperty("JDBC.password", "root");
		//props.setProperty("JDBC.autoCommit", "false");
		return props;
	}

}
