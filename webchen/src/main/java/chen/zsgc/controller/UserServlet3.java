package chen.zsgc.controller;

import chen.zsgc.pojo.User;
import chen.zsgc.service.UserService;
import chen.zsgc.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * author:琛
 * date：2019/7/31 20:40
 * description:
 * 查找的servlet
 */
public class UserServlet3  extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码格式
        req.setCharacterEncoding("utf-8");
        //接收请求参数
        Integer id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        boolean gender = Boolean.parseBoolean(req.getParameter("gender"));
        String  birthStr = req.getParameter("birth");
        Date birth = null;
        try {
            birth = new SimpleDateFormat("yyyy-MM-dd").parse(birthStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //业务处理
        userService.updateUser(new User(id,name,gender,birth));
        //跳转
        req.getRequestDispatcher("/all").forward(req,resp);


    }
}
