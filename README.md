# simple-rpc-framework


## 前言

目前只实现了 RPC 框架最基本的功能

## 介绍

是一款基于 Netty+Kyro+Zookeeper 实现的 RPC 框架。


### 该RPC项目的结构

该框架使用示意图如下图所示：

![](./images/rpc-architure.png)

服务提供端 Server 向注册中心注册服务，服务消费者 Client 通过注册中心拿到服务相关信息，然后再通过网络请求服务提供端 Server。


![](./images/rpc-architure-detail.png)


### 项目基本情况

- 使用Netty实现网络传输；
- 使用Netty心跳机制 : 保证客户端和服务端的连接不被断掉，避免重连。
- 使用开源的序列化机制 Kyro替代 JDK 自带的序列化机制
- 使用 Zookeeper 作为注册中心管理相关服务地址信息
- 动态代理使用JDk自带的动态代理屏蔽远程方法调用的细节
- 客户端调用远程服务的时候进行负载均衡为避免单个服务器响应同一请求，避免造成服务器宕机、崩溃等问题
- 集成 Spring 通过注解注册服务和服务消费




