package org.javaboy.websocket1.bean;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-14 13:59
 */
public class Chat {
    private String from;
    private String content;
    private String to;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
