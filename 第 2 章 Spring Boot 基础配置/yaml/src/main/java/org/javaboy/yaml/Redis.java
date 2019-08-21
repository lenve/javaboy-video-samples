package org.javaboy.yaml;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-18 7:42
 */
public class Redis {
    private Integer port;
    private String host;

    public Integer getPort() {
        return port;
    }

    @Override
    public String toString() {
        return "Redis{" +
                "port=" + port +
                ", host='" + host + '\'' +
                '}';
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
