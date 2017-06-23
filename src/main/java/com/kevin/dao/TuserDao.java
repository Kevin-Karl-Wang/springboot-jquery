package com.kevin.dao;

import com.kevin.entity.Tuser;
import org.springframework.stereotype.Repository;

@Repository("userdao")
public interface TuserDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(Tuser record);

    int insertSelective(Tuser record);

    Tuser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Tuser record);

    int updateByPrimaryKey(Tuser record);
}