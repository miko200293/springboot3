package com.miko.boot3.ssm.mapper;

import com.miko.boot3.ssm.bean.TUser;
import org.apache.ibatis.annotations.Param;
//所有参数都需要用@param进行签名，然后用特定名字去sql中取值。
public interface UserMapper {

     /**
      * 1、每个方法都在Mapper文件中有一个sql标签对应。
      * 2、所有参数都应该用@Param进行签名，以后使用指定的名字在SQL中取值
      * @param id
      * @return
      */
     TUser getUserById(@Param("id") Long id);
}