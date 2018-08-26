package cn.mzayy.blog.sso.service;

import cn.mzayy.blog.Mapper.UserMapper;
import cn.mzayy.bolg.redis.service.JedisClient;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.Resource;
@Service(version="1.0.0")
public class UserServiceImpl implements  UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void register() {
        userMapper.register("","s");
    }

    @Override
    public void deleteUser() {
        userMapper.deleteUser(1);
    }

    @Override
    public void modifyUser() {
        userMapper.modifyUser(1);
    }

    @Override
    public void login() {

    }
}
