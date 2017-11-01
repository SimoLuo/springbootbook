package cn.ilimhumar.springbootbook.service.impl;

import cn.ilimhumar.springbootbook.domain.User;
import cn.ilimhumar.springbootbook.domain.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cn.ilimhumar.springbootbook.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);


    @Autowired
    UserRepository userRepository ;

    /**
     * 查询全部用户
     * @return
     */
    @Override
    public List<User> findAll(){

        return userRepository.findAll();
    }

    /**
     * 新增用户
     * @param user
     * @return
     */
    @Override
    public User insertByUser(User user){
       LOGGER.info("新增用户:" +user.toString());
       return userRepository.save(user);
    }

    /**
     * 更新用户
     * @param user
     * @return
     */
    @Override
    public User update(User user){
        LOGGER.info("更新用户:  " + user.toString());
        return userRepository.save(user);
    }

    /***
     * 删除 用户
     * @param id
     * @return
     */
    @Override
    public User delete(Long id) {
        User user = userRepository.findOne(id);
        userRepository.delete(user);

        LOGGER.info("删除用户：" + user.toString());
        return user;
    }

    /**
     * 获取用户 ID 查询
     * @param id
     * @return
     */
    @Override
    public User findOne(Long id) {
        LOGGER.info("获取用户 ID ：" + id);
        return userRepository.findOne(id);
    }

}
