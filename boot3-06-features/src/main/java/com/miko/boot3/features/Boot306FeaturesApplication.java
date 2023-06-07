package com.miko.boot3.features;

import com.miko.boot3.features.bean.Cat;
import com.miko.boot3.features.bean.Dog;
import com.miko.boot3.features.bean.Pig;
import com.miko.boot3.features.bean.Sheep;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

//import static java.awt.Container.log;
//1标示环境
//    区分出几个环境 dev（开发） test（测试） prod（生产）
//     默认环境是default @Profile（）
//      激活环境用 spring.profiles.active=dev
//      组件永远激活 在不配注@Profile情况下

@SpringBootApplication//主程序类
public class Boot306FeaturesApplication {

    public static void main(String[] args) {
        //springapplication:boot的核心api入口
        //SpringApplication.run(Boot306FeaturesApplication.class, args);
        //自定义
//        SpringApplication application = new SpringApplication(Boot306FeaturesApplication.class);
//
//        //调整参数
//        //application.setDefaultProperties();
//        //这个配置不优先但有用
//        //application.setBanner(Banner.Mode.CONSOLE);
//
//        //2.让Springapplication运行起来
//        application.run(args);


        //bulider方式构建 flunetAPI
        ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .main(Boot306FeaturesApplication.class)
                .sources(Boot306FeaturesApplication.class)
                .bannerMode(Banner.Mode.CONSOLE)
                .properties("server.port=8889")
                .run(args);




        try {
            Cat cat = context.getBean(Cat.class);
            System.out.println("组件cat:"+cat);
        }catch (Exception e){

        }

        try {
            Dog dog = context.getBean(Dog.class);
            System.out.println("组件dog:"+dog);
        }catch (Exception e){

        }
        try {
            Sheep sheep = context.getBean(Sheep.class);
            System.out.println("组件sheep:"+sheep);
        }catch (Exception e){

        }
        try {
            Pig pig = context.getBean(Pig.class);
            System.out.println("组件pig:"+pig);
        }catch (Exception e){

        }











    }

}
