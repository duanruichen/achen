package chen.zsgc.service;

import chen.zsgc.pojo.User;

import java.util.List;

/**
 * author:琛
 * date：2019/7/30 23:25
 * description:
 */
public interface UserService {
    //增删改出
    public List<User> queryAll();
    public Integer insertUser(User user);
    public User queryOne(Integer id);
    public Integer updateUser(User user);
    public Integer deleteUser(Integer id);
}
