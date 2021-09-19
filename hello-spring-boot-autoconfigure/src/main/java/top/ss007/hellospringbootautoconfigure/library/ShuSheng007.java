package top.ss007.hellospringbootautoconfigure.library;


/**
 * Created by Ben.Wang
 * <p>
 * Author      Ben.Wang
 * Date        2021/9/17 23:17
 * Description
 */
public class ShuSheng007 {

    private final String name;
    private final String content;

    public ShuSheng007(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public void say(){
        System.out.println(String.format("%s说：%s",name,content));
    }
}
