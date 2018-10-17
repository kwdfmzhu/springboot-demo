package com.kwdfmzhu.github.springbootmybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author kwdfmzhu
 * @date 2018/8/6
 */
@Configuration
@MapperScan(basePackages = {TestDataSourceConfig.PACKAGE, TestDataSourceConfig.EXT_PACKAGE}, sqlSessionFactoryRef = "testSessionFactory")
public class TestDataSourceConfig {

    public static final String BASE_PATH = "com.kwdfmzhu.github.springbootmybatis";
    public static final String PACKAGE = BASE_PATH + ".dao.mapper";
    public static final String EXT_PACKAGE = BASE_PATH + ".dao.mapperext";
    public static final String MAPPER_LOCATION = "classpath:sqlmap/test/**/*.xml";

    @Value("${spring.datasource-test.url}")
    private String url;

    @Value("${spring.datasource-test.username}")
    private String username;

    @Value("${spring.datasource-test.password}")
    private String password;

    @Value("${spring.datasource-test.driver-class-name}")
    private String driverClassName;

    @Bean(name = "testDataSource")
    @Primary
    public DataSource testDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    //SessionFactory
    @Bean(name = "testSessionFactory")
    @Primary
    public SqlSessionFactory testSessionFactory(@Qualifier("testDataSource") DataSource dataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(TestDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }

    //testTransactionManager事务开启
    @Bean(name = "testTransactionManager")
    @Primary
    public DataSourceTransactionManager testTransactionManager() {
        return new DataSourceTransactionManager(testDataSource());
    }
}
