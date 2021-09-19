package top.ss007.hellospringbootautoconfigure.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.ss007.hellospringbootautoconfigure.library.ShuSheng007;

/**
 * Created by Ben.Wang
 * <p>
 * Author      Ben.Wang
 * Date        2021/9/17 23:13
 * Description
 */

@Configuration
@ConditionalOnProperty(value = "ss007.hello.enabled",havingValue = "true")
@ConditionalOnClass(ShuSheng007.class)
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

    private final HelloProperties helloProperties;

    public HelloAutoConfiguration(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    public ShuSheng007 shuSheng007(){
        return new ShuSheng007(helloProperties.getName(),helloProperties.getContent());
    }

}
