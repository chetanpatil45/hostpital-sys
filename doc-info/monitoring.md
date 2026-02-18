# Monitoring

- Monitoring refers to process of continuously observing and checking the performance, health and functionality if an application or system.
- The goal is to ensure the system operates as expected to detect issues promptly and to gather data for analysis and improvement..
- Monitoring typically involves metrics -  
  - CPU usage
  - Memory usage
  - response times
  - error rates
  - application logs

## Monitoring in SPRING BOOT
In spring boot monitoring involves using various tools and techniques to track the performance and health of your application. Spring boot provides several built in and external tools to facilitate monitoring.

#### 1. Spring Boot Actuators
   A set of built-in endpoints that provides insights into application.
#### 2. Micrometer
   An Application metric facade to integrate with various monitoring system.
#### 3. External Tools
  Tools like **Prometheus**, **Grafana**, **ELK Stack**(Elastic search, log stash, kibana), and others can be used to collect and visualize metrics and logs.

## To Enable Monitoring 
- Add these properties in *application.properties* file.

```properties
management.endpoints.web.exposure.include=*
management.endpoint.health.show-details=always
```
---
## Monitoring Endpoints

1. To check health of Application
```textmate
localhost://actuator/health
```
```json
{
  "groups": [
    "liveness",
    "readiness"
  ],
  "status": "UP"
}
```

2. To Enlist the metrics 
```textmate
localhost://actuator/metrics
```

```json
{
  "names": [
    "application.ready.time",
    "application.started.time",
    "disk.free",
    "disk.total",
    "executor.active",
    "executor.completed",
    "executor.pool.core",
    "executor.pool.max",
    "executor.pool.size",
    "executor.queue.remaining",
    "executor.queued",
    "hikaricp.connections",
    "hikaricp.connections.acquire",
    "hikaricp.connections.active",
    "hikaricp.connections.creation",
    "hikaricp.connections.idle",
    "hikaricp.connections.max",
    "hikaricp.connections.min",
    "hikaricp.connections.pending",
    "hikaricp.connections.timeout",
    "hikaricp.connections.usage",
    "http.server.requests",
    "http.server.requests.active",
    "jdbc.connections.active",
    "jdbc.connections.idle",
    "jdbc.connections.max",
    "jdbc.connections.min",
    "jvm.buffer.count",
    "jvm.buffer.memory.used",
    "jvm.buffer.total.capacity",
    "jvm.classes.loaded",
    "jvm.classes.loaded.count",
    "jvm.classes.unloaded",
    "jvm.compilation.time",
    "jvm.gc.concurrent.phase.time",
    "jvm.gc.live.data.size",
    "jvm.gc.max.data.size",
    "jvm.gc.memory.allocated",
    "jvm.gc.memory.promoted",
    "jvm.gc.overhead",
    "jvm.gc.pause",
    "jvm.info",
    "jvm.memory.committed",
    "jvm.memory.max",
    "jvm.memory.usage.after.gc",
    "jvm.memory.used",
    "jvm.threads.daemon",
    "jvm.threads.live",
    "jvm.threads.peak",
    "jvm.threads.started",
    "jvm.threads.states",
    "logback.events",
    "process.cpu.time",
    "process.cpu.usage",
    "process.start.time",
    "process.uptime",
    "spring.data.repository.invocations",
    "system.cpu.count",
    "system.cpu.usage",
    "tomcat.sessions.active.current",
    "tomcat.sessions.active.max",
    "tomcat.sessions.alive.max",
    "tomcat.sessions.created",
    "tomcat.sessions.expired",
    "tomcat.sessions.rejected"
  ]
}
```

3. Getting information using metrics

```textmate
localhost:8080/actuator/metrics/<metric_name>
```


