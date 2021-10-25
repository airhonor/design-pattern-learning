package com.hz.design.pattern.flyweight;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-22 11:27
 **/
public class MainClass {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Website website11 = factory.getWebsite("csdn");
        Website website12 = factory.getWebsite("csdn");
        Website website21 = factory.getWebsite("zhihu");
        Website website22 = factory.getWebsite("zhihu");

        website11.postBlog(new User("张三", "助理工程师"));
        website11.uploadPicture(new User("张三", "助理工程师"));
        website12.postBlog(new User("李四", "中级工程师"));
        website12.uploadPicture(new User("李四", "中级工程师"));

        website21.postBlog(new User("王五", "副高级工程师"));
        website21.uploadPicture(new User("王五", "副高级工程师"));
        website22.postBlog(new User("赵六", "高级工程师"));
        website22.uploadPicture(new User("赵六", "高级工程师"));
    }
}
