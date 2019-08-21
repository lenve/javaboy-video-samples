package org.javaboy.mail;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.context.IContext;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailApplicationTests {

    @Autowired
    JavaMailSender javaMailSender;

    @Test
    public void contextLoads() {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setSubject("这是测试邮件主题");
        msg.setText("这是测试邮件内容");
        msg.setFrom("1510161612@qq.com");
        msg.setSentDate(new Date());
        msg.setTo("584991843@qq.com");
        javaMailSender.send(msg);
    }

    @Test
    public void test1() throws MessagingException {
        MimeMessage msg = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(msg, true);
        helper.setSubject("这是测试邮件主题(带附件)");
        helper.setText("这是测试邮件内容(带附件)");
        helper.setFrom("1510161612@qq.com");
        helper.setSentDate(new Date());
        helper.setTo("584991843@qq.com");
        helper.addAttachment("javaboy.png", new File("D:\\javaboy-code-samples\\javaboy.png"));
        javaMailSender.send(msg);
    }

    @Test
    public void test2() throws MessagingException {
        MimeMessage msg = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(msg, true);
        helper.setSubject("这是测试邮件主题(带图片)");
        helper.setText("这是测试邮件内容(带图片)，这是第一张图片：<img src='cid:p01'/>，这是第二张图片：<img src='cid:p02'/>", true);
        helper.setFrom("1510161612@qq.com");
        helper.setSentDate(new Date());
        helper.setTo("584991843@qq.com");
        helper.addInline("p01", new FileSystemResource(new File("D:\\javaboy-code-samples\\javaboy.png")));
        helper.addInline("p02", new FileSystemResource(new File("D:\\javaboy-code-samples\\javaboy2.png")));
        javaMailSender.send(msg);
    }

    @Autowired
    TemplateEngine templateEngine;

    @Test
    public void test3() throws MessagingException {
        MimeMessage msg = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(msg, true);
        helper.setSubject("这是测试邮件主题(thymeleaf)");
        Context context = new Context();
        context.setVariable("username", "javaboy");
        context.setVariable("position", "Java工程师");
        context.setVariable("dep", "产品研发部");
        context.setVariable("salary", 999999);
        context.setVariable("joblevel", "高级工程师");
        String process = templateEngine.process("mail.html", context);
        helper.setText(process, true);
        helper.setFrom("1510161612@qq.com");
        helper.setSentDate(new Date());
        helper.setTo("584991843@qq.com");
        javaMailSender.send(msg);
    }

    @Test
    public void test4() throws MessagingException, IOException, TemplateException {
        MimeMessage msg = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(msg, true);
        helper.setSubject("这是测试邮件主题(freemarker)");
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_28);
        configuration.setClassLoaderForTemplateLoading(this.getClass().getClassLoader(),"templates");
        Template template = configuration.getTemplate("mail.ftl");
        Map<String, Object> map = new HashMap<>();
        map.put("username", "javaboy");
        map.put("position", "Java工程师");
        map.put("dep", "产品研发部");
        map.put("salary", 999999);
        map.put("joblevel", "高级工程师");
        StringWriter out = new StringWriter();
        template.process(map, out);
        helper.setText(out.toString(), true);
        helper.setFrom("1510161612@qq.com");
        helper.setSentDate(new Date());
        helper.setTo("584991843@qq.com");
        javaMailSender.send(msg);
    }

}
