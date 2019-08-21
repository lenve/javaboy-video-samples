package org.javaboy.json.config;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-23 6:54
 */
@Configuration
public class WebMvcConfig {
//    @Bean
//    MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
//        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        ObjectMapper om = new ObjectMapper();
//        om.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
//        converter.setObjectMapper(om);
//        return converter;
//    }

    //    @Bean
//    ObjectMapper objectMapper() {
//        ObjectMapper om = new ObjectMapper();
//        om.setDateFormat(new SimpleDateFormat("yyyy/MM/dd"));
//        return om;
//    }
//    @Bean
//    GsonHttpMessageConverter gsonHttpMessageConverter() {
//        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
//        converter.setGson(new GsonBuilder().setDateFormat("yyyy/MM/dd").create());
//        return converter;
//    }
//    @Bean
//    Gson gson() {
//        return new GsonBuilder().setDateFormat("yyyy/MM/dd").create();
//    }

    @Bean
    FastJsonHttpMessageConverter fastJsonHttpMessageConverter() {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();
        config.setDateFormat("yyyy-MM-dd");
        converter.setFastJsonConfig(config);
        return converter;
    }
}
