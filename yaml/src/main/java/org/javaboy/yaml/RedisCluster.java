package org.javaboy.yaml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.PipedReader;
import java.util.List;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-18 7:39
 */
@Component
@ConfigurationProperties("redis")
public class RedisCluster {
    private Integer port;
    private List<String> hosts;
    private List<Redis> redisList;

    @Override
    public String toString() {
        return "RedisCluster{" +
                "port=" + port +
                ", hosts=" + hosts +
                ", redisList=" + redisList +
                '}';
    }

    public List<Redis> getRedisList() {
        return redisList;
    }

    public void setRedisList(List<Redis> redisList) {
        this.redisList = redisList;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }
}
