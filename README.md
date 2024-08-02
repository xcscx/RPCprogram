# A-easyRPC

用于学习RPC（远程过程调用）技术的项目



### 各个模块介绍：

- **a-example-common 通用模块**
  - model  实体类模块
  - service  服务接口 

- **a-example-consumer 服务消费者**
  - consumer  调用服务的业务

- **a-example-provider 服务提供者**
  - provider  提供服务的方法
  - serviceImpl  实现服务接口

- **a-rpc-easy 服务器**
  - model  请求和返回实体
  - proxy  代理调用
  - registry  注册中心
  - serializer  序列化
  - server  服务



### 启动流程：

1. 启动 a-example-provider的EasyProviderExample服务，提供服务
2. 启动a-example-consumer的EasyConsumerExample服务，调用服务



### 反应结果：

```text
服务所在端口为：8080
Received request：POST /
用户名xtx
```





