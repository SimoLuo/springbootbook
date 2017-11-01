package cn.ilimhumar.springbootbook.service;

import cn.ilimhumar.springbootbook.domain.User;

import java.util.List;

public interface UserService {

    /**
     * 查询全部用户
     * @return
     */
    List<User> findAll();

    /**
     * 新增用户
     * @param user
     * @return
     */
    User insertByUser(User user);


    /**
     * 更新用户
     * @param user
     * @return
     */
    User update(User user);

    /***
     * 删除 用户
     * @param id
     * @return
     */
    User delete(Long id);

    /**
     * 获取用户 ID 查询
     * @param id
     * @return
     */
    User findOne(Long id);





}
