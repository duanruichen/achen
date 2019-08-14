package chen.zsgc.dao;

import chen.zsgc.pojo.User;

import java.util.List;

/**
 * author:琛
 * date：2019/7/30 22:27
 * description:
 */
public interface UserDao  {
//    数据库操作查询一个多个
    public List<User> queryAll();
    public Integer insertUser(User user);
    public User queryOne(Integer id);
    public Integer updateUser(User user);
    public Integer deleteUser(Integer id);
}
