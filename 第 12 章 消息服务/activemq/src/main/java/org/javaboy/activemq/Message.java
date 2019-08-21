package org.javaboy.activemq;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-08-21 10:31
 */
public class Message implements Serializable {
    private String content;
    private Date sendDate;

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", sendDate=" + sendDate +
                '}';
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
}
