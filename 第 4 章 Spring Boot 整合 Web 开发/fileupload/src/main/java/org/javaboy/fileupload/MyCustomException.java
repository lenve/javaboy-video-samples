package org.javaboy.fileupload;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-07-24 10:06
 */
@ControllerAdvice
public class MyCustomException {
//    @ExceptionHandler(MaxUploadSizeExceededException.class)
//    public void myexception(MaxUploadSizeExceededException e, HttpServletResponse resp) throws IOException {
//        resp.setContentType("text/html;charset=utf-8");
//        PrintWriter out = resp.getWriter();
//        out.write("上传文件大小超出限制!");
//        out.flush();
//        out.close();
//    }
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ModelAndView myexception(MaxUploadSizeExceededException e) throws IOException {
        ModelAndView mv = new ModelAndView("myerror");
        mv.addObject("error", "上传文件大小超出限制！");
        return mv;
    }
}
