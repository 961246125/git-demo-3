package com.guigu.boot.config;

import com.guigu.boot.bean.Pet;
import com.guigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //告诉SpringBoot这是一个配置类==配置文件
public class Myconfig {
    @Bean  //给容器中添加组件。方法名作为组件的ID，返回类型就是组件类型，返回值就是组件在容器中的实例
    public User user01(){
        return new User("zhangsan","18");
    }
    @Bean
    public Pet tomcatPet(){
        return new Pet("Tom");
    }
}
