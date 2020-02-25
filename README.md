#### 码匠社区
[elasticsearch中文社区](https://elasticsearch.cn/)

#### 资料
[Building a GitHub App or an OAuth App](https://developer.github.com/apps/)  
[github上传徽章](https://github.com/settings/applications/)
[时序图工具软件](https://www.visual-paradigm.com)  
[OkHttp](https://square.github.io/okhttp/)  
[fastJson](https://mvnrepository.com/)  
[h2](http://www.h2database.com/html/quickstart.html)
[spring boot mybatis](http://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
[spring boot api database](https://docs.spring.io/spring-boot/docs/2.1.11.RELEASE/reference/html/)
[flyway](https://flywaydb.org/getstarted/firststeps/maven)
[bootstrap 全局样式-栅格系统](https://v3.bootcss.com/css/)
[bootstrap 组件-导航条](https://v3.bootcss.com/css/)
[lombok](https://projectlombok.org/setup/maven)
[idea 安装lombok插件](idea lombok 插件)
[thymeleaf3.0](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)
[spring interceptor](https://docs.spring.io/spring/docs/5.0.3.RELEASE/spring-framework-reference/web.html)
[spring framework doc](https://docs.spring.io/spring/docs/5.0.3.RELEASE/spring-framework-reference/index.html)
[html在线转义（符号转义）](https://www.sojson.com/rehtml)
[Postman](https://chrome.google.com/webstore/detail/coohjcphdfgbiolnekdpbcijmhambjff)

#### 脚本
```sql
  create table USER
  (
      ID           INT auto_increment,
      ACCOUNT_ID   VARCHAR(100),
      NAME         VARCHAR(50),
      TOKEN        CHAR(36),
      GMT_CREATE   BIGINT,
      GMT_MODIFIED BIGINT,
      constraint USER_PK
          primary key (ID)
  );
alter table USER add bio varchar(256);
```

#### idea快捷键

生成实体变量包括new: Ctrl+Alt+V 
换行后定位到最开始: Shift + enter
标签成对拷贝：Ctrl + w
查看方法参数：Ctrl + p
快速重写方法：Ctrl + o
快速删除无用包：keymap-optimize import设置：Ctrl+Shift+O
查找错误信息：Ctrl + shift + F
查看方法依赖：alt + F7
修改文件重新加载：Ctrl + shift + F9
大小写转换：

#### 常用技术点
拦截器：interceptor->见资料-【spring interceptor】
mybatis-generator集成->
通用异常处理->
添加富文本编辑器->
51-上传图片-markdown实现上传功能
添加日志

#### 命令
-- mybatis-generator
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
-- flyway
mvn flyway:migrate
 

#### 视频总结
[26-引入jQuery，提取公共页面thymeleaf-include](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)
[27-thymeleaf动态href](th:href="@{'/profile/'+${section}(page=${pagination.totalPage})}")

#### ***Ext*** 文件是扩展方法，防止重新生成代码是覆盖自定义扩展方法


