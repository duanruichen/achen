package chen.zsgc.controller;

import chen.zsgc.pojo.User;
import chen.zsgc.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * author:琛
 * date：2019/7/30 23:22
 * description:
 */
public class UserServlet  extends HttpServlet {
    //先new出来service的实现类然后实现类中进行业务逻辑


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserServiceImpl userService = new UserServiceImpl();

        List<User> users =userService.queryAll();
        //返回过去数据
        req.setAttribute("User",users);
        //跳转到这个界面
        req.getRequestDispatcher("/user.jsp").forward(req,resp);


    }
}
