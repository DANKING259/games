package edu.czjtu.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.czjtu.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
//BaseMapper方法已经写好了增删改查的方法，UserMapper继承就好
@Mapper
public interface UserMapper extends BaseMapper<User> {
} 