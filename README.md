# SpringBootDubbo
1. 一个spring-boot集成dubbo的多模块项目
2. 包括rest、idl、service、dao、domain、common六个子模块
3. 其中rest和service是独立微服务，rest是消费者，service是生产者
4. 其他模块为这两个模块提供直接或间接依赖
5. 构建了项目结构，完成打包发布的配置，rest和service两个独立的服务可以启动，以zookeeper作为注册中心，dubbo的集成未完成，并已实现mybatis-postgresql的数据交互
6. spring-boot多模块项目中，比如domain、dao、idl等不需要打为棵执行jar包的项目，需要注释掉pom中的spring-boot打包插件，
可以删掉启动类等不需要的部分，只保留pom、有用代码、有用的静态文件。
7. 需要多模块项目需要处理项目打包及依赖问题：
~~~ 
1.涉及到dao中的xml文件，则需要以静态资源的形式打进dao.jar包，需要在其pom中设置静态资源。
2.service依赖dao，必须在启动类上指定mapper接口类的扫描位置。
3.同时需要在配置文件中指定xml文件及entity类的路径，必不可少。
~~~

# dubbo-admin的部署
1. 从dubbo生态的github下载dubbo-admin的release版源码包dubbo-admin-0.2.0.zip
2. 解压得到dubbo-admin-0.2.0目录，dubbo-admin-0.2.0\dubbo-admin-server\src\main\resources\application.properties
+ 修改端口（默认未8080）：server.port=9973 
+ 保留服务注册地址：admin.registry.address=zookeeper://127.0.0.1:2181
+ 注释掉配置中心 # admin.config-center=zookeeper://127.0.0.1:2181
+ 注释掉配置元数据记录 # admin.metadata-report.address=zookeeper://127.0.0.1:2181
3. cd dubbo-admin-0.2.0/ 执行：mvn clean package编译打包（时间较长，失败则重试）
4. 打好的程序包在dubbo-admin-0.2.0\dubbo-admin-distribution\target下dubbo-admin-0.2.0.jar
5. 由于注册中心配置的是本机，所以此处需要将dubbo-admin部署到zookeeper所在的系统中
6. 在浏览器中访问localhost:9973即可访问管理页面查看服务注册情况