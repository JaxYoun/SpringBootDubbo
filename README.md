# SpringBootDubbo
1. 一个spring-boot集成dubbo的多模块项目
2. 包括rest、idl、service、dao、domain、common六个子模块
3. 其中rest和service是独立微服务，rest是消费者，service是生产者
4. 其他模块为这两个模块提供直接或间接依赖
5. 仅仅构建了项目结构，两个独立的服务可以启动，由于dubbo-starter依赖下载的问题，dubbo的集成未完成