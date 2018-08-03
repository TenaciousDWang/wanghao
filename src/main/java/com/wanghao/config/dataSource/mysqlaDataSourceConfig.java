package com.wanghao.config.dataSource;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

@org.springframework.context.annotation.Configuration
@MapperScan(basePackages=mysqlaDataSourceConfig.PACKAGE,sqlSessionFactoryRef = "mysqlaSessionFactory")
public class mysqlaDataSourceConfig {
	static final String PACKAGE = "com.wanghao.*.mapper.mysqla";   //本项目中用的是mybatis，此路径为扫描的mapper的包结构
	
    @Value("${customer.datasource.ds1.url}")  
    private String dbUrl;  

    @Value("${customer.datasource.ds1.username}")  
    private String username;  

    @Value("${customer.datasource.ds1.password}")  
    private String password;  

    @Value("${customer.datasource.ds1.driver-class-name}")  
    private String driverClassName;  

    @Value("${customer.datasource.ds1.initialSize}")  
    private int initialSize;  

    @Value("${customer.datasource.ds1.minIdle}")  
    private int minIdle;  

    @Value("${customer.datasource.ds1.maxActive}")  
    private int maxActive;  

    @Value("${customer.datasource.ds1.maxWait}")  
    private int maxWait;  

    @Value("${customer.datasource.ds1.timeBetweenEvictionRunsMillis}")  
    private int timeBetweenEvictionRunsMillis;  

    @Value("${customer.datasource.ds1.minEvictableIdleTimeMillis}")  
    private int minEvictableIdleTimeMillis;  

    @Value("${customer.datasource.ds1.validationQuery}")  
    private String validationQuery;  

    @Value("${customer.datasource.ds1.testWhileIdle}")  
    private boolean testWhileIdle;  

    @Value("${customer.datasource.ds1.testOnBorrow}")  
    private boolean testOnBorrow;  

    @Value("${customer.datasource.ds1.testOnReturn}")  
    private boolean testOnReturn;  

    @Value("${customer.datasource.ds1.poolPreparedStatements}")  
    private boolean poolPreparedStatements;  

    @Value("${customer.datasource.ds1.maxPoolPreparedStatementPerConnectionSize}")  
    private int maxPoolPreparedStatementPerConnectionSize;  

    @Value("${customer.datasource.ds1.filters}")  
    private String filters;  

    @Value("{customer.datasource.ds1.connectionProperties}")  
    private String connectionProperties; 
    
    @Value("${customer.datasource.ds1.useGlobalDataSourceStat}")
    private boolean useGlobalDataSourceStat;
    
    
    @Bean(name = "mysqlaDatasource",destroyMethod = "close",initMethod = "init")
    public DataSource mysqlaDataSource() {
        DruidDataSource datasource = new DruidDataSource();  

        datasource.setUrl(this.dbUrl);  
        datasource.setUsername(username);  
        datasource.setPassword(password);  
        datasource.setDriverClassName(driverClassName);  

        //configuration  
        datasource.setInitialSize(initialSize);  
        datasource.setMinIdle(minIdle);  
        datasource.setMaxActive(maxActive);  
        datasource.setMaxWait(maxWait);  
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);  
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);  
        datasource.setValidationQuery(validationQuery);  
        datasource.setTestWhileIdle(testWhileIdle);  
        datasource.setTestOnBorrow(testOnBorrow);  
        datasource.setTestOnReturn(testOnReturn);  
        datasource.setPoolPreparedStatements(poolPreparedStatements);  
        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize); 
        datasource.setUseGlobalDataSourceStat(useGlobalDataSourceStat);
        
        try {  
            datasource.setFilters(filters);  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
        datasource.setConnectionProperties(connectionProperties);  
        return datasource; 
    }

    @Bean(name = "mysqlaTransactionManager")
    public DataSourceTransactionManager rdsTransactionManager(@Qualifier("mysqlaDatasource") DataSource mysqlaDataSource) {
        return new DataSourceTransactionManager(mysqlaDataSource());
    }

    @Bean(name = "mysqlaSessionFactory") 
    public SqlSessionFactory mysqlSqlSessionFactory(@Qualifier("mysqlaDatasource") DataSource mysqlaDataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(mysqlaDataSource);
        return sessionFactory.getObject();
    }
}
