# SpringBootDubbo
1. 一个spring-boot集成dubbo的多模块项目
2. 包括rest、idl、service、dao、domain、common六个子模块
3. 其中rest和service是独立微服务，rest是消费者，service是生产者
4. 其他模块为这两个模块提供直接或间接依赖
5. 仅仅构建了项目结构，两个独立的服务可以启动，由于dubbo-starter依赖下载的问题，dubbo的集成未完成

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