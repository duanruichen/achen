package chen.zsgc.controller;

import chen.zsgc.pojo.User;
import chen.zsgc.service.UserService;
import chen.zsgc.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * author:琛
 * date：2019/7/31 20:28
 * description:
 * 更新界面
 * 没有查找
 */
public class UserServlet2 extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收请求参数
        Integer id = Integer.parseInt(req.getParameter("id"));
        User user = userService.queryOne(id);
        //传递数据
        req.setAttribute("user",user);
        //跳转表单页面
        req.getRequestDispatcher("/users.jsp").forward(req,resp);

    }
}
