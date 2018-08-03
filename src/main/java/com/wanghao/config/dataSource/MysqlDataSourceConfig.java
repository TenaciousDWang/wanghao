package com.wanghao.config.dataSource;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

@org.springframework.context.annotation.Configuration
@MapperScan(basePackages=MysqlDataSourceConfig.PACKAGE,sqlSessionFactoryRef = "mysqlSqlSessionFactory")
public class MysqlDataSourceConfig {
	
	static final String PACKAGE = "com.wanghao.*.mapper.mysql"; 
	
    @Value("${spring.datasource.url}")  
    private String dbUrl;  

    @Value("${spring.datasource.username}")  
    private String username;  

    @Value("${spring.datasource.password}")  
    private String password;  

    @Value("${spring.datasource.driver-class-name}")  
    private String driverClassName;  

    @Value("${spring.datasource.initialSize}")  
    private int initialSize;  

    @Value("${spring.datasource.minIdle}")  
    private int minIdle;  

    @Value("${spring.datasource.maxActive}")  
    private int maxActive;  

    @Value("${spring.datasource.maxWait}")  
    private int maxWait;  

    @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")  
    private int timeBetweenEvictionRunsMillis;  

    @Value("${spring.datasource.minEvictableIdleTimeMillis}")  
    private int minEvictableIdleTimeMillis;  

    @Value("${spring.datasource.validationQuery}")  
    private String validationQuery;  

    @Value("${spring.datasource.testWhileIdle}")  
    private boolean testWhileIdle;  

    @Value("${spring.datasource.testOnBorrow}")  
    private boolean testOnBorrow;  

    @Value("${spring.datasource.testOnReturn}")  
    private boolean testOnReturn;  

    @Value("${spring.datasource.poolPreparedStatements}")  
    private boolean poolPreparedStatements;  

    @Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")  
    private int maxPoolPreparedStatementPerConnectionSize;  

    @Value("${spring.datasource.filters}")  
    private String filters;  

    @Value("{spring.datasource.connectionProperties}")  
    private String connectionProperties; 
    
    @Value("${spring.datasource.useGlobalDataSourceStat}")
    private boolean useGlobalDataSourceStat;
	
    @Bean(name = "mysqlDataSource" ,destroyMethod = "close",initMethod = "init")
    @Primary   //此注解表示在默认的数据源配置，即在默认配置时用到的数据源配置
    public DataSource mysqlDataSource() {

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
    
    @Bean(name = "mysqlTransactionManager")
    @Primary
    public DataSourceTransactionManager mysqlTransactionManager(@Qualifier("mysqlDataSource") DataSource mysqlDataSource) {
        return new DataSourceTransactionManager(mysqlDataSource);
    }
    
    @Bean(name = "mysqlSqlSessionFactory")
    @Primary
    public SqlSessionFactory mysqlSqlSessionFactory(@Qualifier("mysqlDataSource") DataSource mysqlDataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(mysqlDataSource);
        return sessionFactory.getObject();
    }

}
