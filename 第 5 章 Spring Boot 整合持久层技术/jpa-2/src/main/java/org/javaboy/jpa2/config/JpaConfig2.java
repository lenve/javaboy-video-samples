package org.javaboy.jpa2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
@EnableJpaRepositories(basePackages = "org.javaboy.jpa2.dao2",entityManagerFactoryRef = "localContainerEntityManagerFactoryBean2",transactionManagerRef = "platformTransactionManager2")
public class JpaConfig2 {
    @Autowired
    @Qualifier("dsTwo")
    DataSource dsTwo;

    @Autowired
    JpaProperties jpaProperties;

    @Bean
    LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean2(EntityManagerFactoryBuilder builder) {
        return builder.dataSource(dsTwo)
                .properties(jpaProperties.getProperties())
                .persistenceUnit("pu2")
                .packages("org.javaboy.jpa2.bean")
                .build();
    }

    @Bean
    PlatformTransactionManager platformTransactionManager2(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(localContainerEntityManagerFactoryBean2(builder).getObject());
    }
}
