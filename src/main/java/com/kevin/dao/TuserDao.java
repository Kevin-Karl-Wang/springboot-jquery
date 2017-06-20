package com.kevin.dao;

import com.kevin.entity.Tuser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userRepository")
public interface TuserDao {

    List<Tuser> findAll();

    List<Tuser> findUserByName(Tuser tuser);
}