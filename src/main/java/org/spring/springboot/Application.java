package org.spring.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.spring.springboot.dao.CityDao;
import org.spring.springboot.domain.City;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 应用启动类
 *
 * Created by bysocket on 16/4/26.
 */
// Spring Boot 应用的标识
@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("org.spring.springboot.dao")
public class Application {

    public static void main(String[] args) {
        // 程序启动入口   git remote add origin https://github.com/wanlinmj/springboot-mybatis-thymeleaf.git
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class,args);

        /**  20170509
         * git 提交
         *  1、 git remote add origin https://github.com/wanlinmj/springboot-mybatis-thymeleaf.git
         *  2、 git push -u origin master
         *  3、 git branch (若果报错： error: src refspec master does not match any. error: failed to push some refs to 'https://github.com/wanlinmj/springboot-mybatis-thymeleaf.git')
         *  4、 git commit -m "test"
         *  5、 git push -u origin master
         */

    }
}
