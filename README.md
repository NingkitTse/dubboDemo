# dubboDemo
# Description
Dubbo应用样例，使用Dubbo前提要安装好zooKeeper，Dubbo API提供应用 将服务注册发布到zookeeper，Dubbo API消费者应用 从zookeeper获取服务，使用服务。

Dubbo架构
服务注册中心，服务Provider，服务Consumer，Monitor

大致流程：
- 服务Provider去注册中心注册
- 服务Consumer去注册中心订阅服务
- 注册中心通知Consumer服务可用
- Consumer调用Provider服务
- 调用的同时Monitor 统计调用
