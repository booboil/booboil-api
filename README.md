# Booboill - API 开放平台项目

## 项目简介

一款基于Vue3+Spring Boot+Dubbo+Gateway的API接口开发调用平台。管理员可以接入并发布接口、进行可视化接口调用情况；用户可以登录注册，通过接口调用权限、浏览接口及在线接口调试，并通过客户端SDK轻松调用接口。 。


登录注册页面：
![](1.png)

主页（浏览接口）：

![](https://yupi-picture-1256524210.cos.ap-shanghai.myqcloud.com/1/1673399530597-2748898e-9f88-4329-85fc-f7bcdba3ae8a.png)



接口管理：

![img](https://yupi-picture-1256524210.cos.ap-shanghai.myqcloud.com/1/1673399741446-9627305d-cd5e-4dbf-b51a-fc249d2206db.png)



在线调试：

![](https://yupi-picture-1256524210.cos.ap-shanghai.myqcloud.com/1/1673399936177-ae0942ec-f0cc-4481-b101-b109e849b3be.png)


使用自己开发的客户端 SDK，一行代码调用接口：

![](https://yupi-picture-1256524210.cos.ap-shanghai.myqcloud.com/1/1673400021340-08220e8e-3aaf-4ca6-bdd6-c7165402151e.png)


## 技术选型

### 前端

- React 18
- Ant Design Pro 5.x 脚手架
- Ant Design & Procomponents 组件库
- Umi 4 前端框架
- OpenAPI 前端代码生成



### 后端

- Java Spring Boot
- MySQL 数据库
- MyBatis-Plus 及 MyBatis X 自动生成
- API 签名认证（Http 调用）
- Spring Boot Starter（SDK 开发）
- Dubbo 分布式（RPC、Nacos）
- Swagger + Knife4j 接口文档生成
- Spring Cloud Gateway 微服务网关
- Hutool、Apache Common Utils、Gson 等工具库


## 项目大纲

1. 项目介绍和计划
2. 需求分析
3. 业务流程和子系统介绍
4. 技术选型（各技术作用讲解）
5. 前后端项目初始化
    1. 前端 Ant Design Pro 框架最新版本教程
    2. 后端 Spring Boot 万用模板使用
6. 数据库表设计
7. 前后端代码自动生成（强烈推荐，大幅提高开发效率！）
8. 登录页开发
9. 接口管理功能开发（Ant Design 高级组件使用）
10. 模拟 API 接口项目开发
11. HTTP 接口调用
12. API 签名认证详解及开发
13. 客户端 SDK 开发（Spring Boot Starter）
14. 管理员接口发布 / 下线功能开发
15. 接口列表页开发
16. 在线调试接口功能开发
17. 接口调用统计开发
    1. 后端开发
    2. 优化方案分析及对比
18. API 网关详解
    1. 网关介绍及优点
    2. 10 种网关应用场景
    3. 网关分类及技术选型
19. Spring Cloud Gateway 网关实现
    1. 详细带读官方文档
    2. 统一业务处理：用户鉴权及接口调用次数统计
20. 项目分布式改造
    1. 公共模块抽象
    2. RPC 和 HTTP 调用详解及对比
    3. Dubbo 框架讲解及示例项目开发
    4. Dubbo 业务实战
21. 管理员统计分析功能
    1. 前端 2 种可视化库的使用
    2. 后端聚合查询接口开发
22. 项目扩展点及上线分析