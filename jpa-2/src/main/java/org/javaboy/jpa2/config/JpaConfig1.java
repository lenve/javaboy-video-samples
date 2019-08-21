package org.javaboy.jpa2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-29 7:25
 */
@Configuration
@EnableJpaRepositories(basePackages = "org.javaboy.jpa2.dao1",entityManagerFactoryRef = "localContainerEntityManagerFactoryBean1",transactionManagerRef = "platformTransactionManager1")
public class JpaConfig1 {
    @Autowired
    @Qualifier("dsOne")
    DataSource dsOne;

    @Autowired
    JpaProperties jpaProperties;

    @Bean
    @Primary
    LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean1(EntityManagerFactoryBuilder builder) {
        return builder.dataSource(dsOne)
                .properties(jpaProperties.getProperties())
                .persistenceUnit("pu1")
                .packages("org.javaboy.jpa2.bean")
                .build();
    }

    @Bean
    PlatformTransactionManager platformTransactionManager1(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(localContainerEntityManagerFactoryBean1(builder).getObject());
    }
}
