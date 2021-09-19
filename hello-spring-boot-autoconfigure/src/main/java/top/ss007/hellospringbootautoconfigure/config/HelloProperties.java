package top.ss007.hellospringbootautoconfigure.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Ben.Wang
 * <p>
 * Author      Ben.Wang
 * Date        2021/9/17 23:14
 * Description
 */
@ConfigurationProperties(prefix = "ss007.hello")
public class HelloProperties {

    /**
     * 讲话者姓名
     */
    private String name = "ShuSheng007";
    private String content = "Hello Spring Starter";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
