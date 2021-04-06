package edu.utfpr.javadb;

import com.jolbox.bonecp.BoneCPDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class MultiTenancyDataSource {
//    @Bean
//    public DataSource dataSource() {
//        BoneCPDataSource ds = new BoneCPDataSource();
//        ds.setDriverClass("com.mysql.jdbc.Driver");
//        ds.setJdbcUrl("jdbc:mysql://localhost:3306/contatos");
//        ds.setUser("root");
//        ds.setPassword("1234");
//        return ds;
//    }
//
//    @Bean(name={ "dataSource", "dataSource1" })
//    public DataSource dataSource1(){
//        BoneCPDataSource ds = new BoneCPDataSource();
//        ds.setDriverClass("org.hsqldb.jdbcDriver");
//        ds.setJdbcUrl("jdbc:hsqldb:mem:tenant_1");
//        ds.setUsername("sa");
//        ds.setPassword("");
//        return ds;
//    }
//    @Bean(name="dataSource2")
//    public DataSource dataSource2() {
//        BoneCPDataSource ds = new BoneCPDataSource();
//        ds.setDriverClass("org.h2.Driver");
//        ds.setJdbcUrl("jdbc:h2:mem:tenant_2");
//        ds.setUsername("sa");
//        ds.setPassword("");
//        return ds;
//    }
}