package com.kevin.dao;

import com.kevin.entity.Tuser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public interface TuserDao {

    List<Tuser> login(Tuser tuser);

    void register(Tuser tuser);
}