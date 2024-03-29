package com.xqkj.siwencat.controller;

import com.xqkj.siwencat.dao.UserMapper;
import com.xqkj.siwencat.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserMapper userService;

    /**
     * 查询全部
     * @return
     */
    @RequestMapping("/listAll")
    public Object selectAll(){
        return userService.selectAll();
    }

    /**
     * 查询单个
     * @param id
     * @return
     */
    @RequestMapping("/user")
    public Object selectByPrimaryKey(@RequestParam(value = "id",defaultValue = "1")int id){
        return userService.selectByPrimaryKey(id);
    }

    /**
     * 添加数据
     * @param user
     * @return
     */
    @RequestMapping("/insert")
    public int insert (User user){
        return userService.insert(user);
    }

    /**
     * 删除
     * @return
     */
    @RequestMapping("/remove")
    public int remove(int id){
        return userService.deleteByPrimaryKey(id);
    }

    /**
     * 修改
     * @param user
     * @return
     */
    @RequestMapping("/update")
    public int update(User user){
        return userService.updateByPrimaryKey(user);
    }
}
