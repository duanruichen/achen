package chen.zsgc.service;

import chen.zsgc.dao.UserDao;
import chen.zsgc.pojo.User;
import chen.zsgc.utils.SessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * author:琛
 * date：2019/7/30 23:27
 * description:
 */
public class UserServiceImpl implements UserService {




    @Override
    public List<User> queryAll() {
        SqlSession sqlSession = SessionUtil.getSqlSessionIntance();

        UserDao userDao = sqlSession.getMapper(UserDao.class);

        try {
            return userDao.queryAll();

        } finally {
            sqlSession.close();
        }
    }

    @Override
    public Integer insertUser(User user) {
        SqlSession sqlSession = SessionUtil.getSqlSessionIntance();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        try {
            Integer integer = userDao.insertUser(user);
            sqlSession.commit();

            return integer;
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        }finally {
            sqlSession.close();
        }


    }

    @Override
    public User queryOne(Integer id) {
        SqlSession sqlSession = SessionUtil.getSqlSessionIntance();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        try {
            return userDao.queryOne(id);
        }finally {
            sqlSession.close();
        }


    }

    @Override
    public Integer updateUser(User user) {
        SqlSession sqlSession = SessionUtil.getSqlSessionIntance();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
       try {
           Integer updateUser = userDao.updateUser(user);
           sqlSession.commit();

           return updateUser;
       }catch (Exception e){
           e.printStackTrace();
           sqlSession.rollback();
           throw e;
       }finally {
           sqlSession.close();
       }

    }

    @Override
    public Integer deleteUser(Integer id) {
        SqlSession sqlSession = SessionUtil.getSqlSessionIntance();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        try {
            Integer deleteUser = userDao.deleteUser(id);
            sqlSession.commit();

            return deleteUser;
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            throw e;
        }finally {
            sqlSession.close();
        }

    }
}
