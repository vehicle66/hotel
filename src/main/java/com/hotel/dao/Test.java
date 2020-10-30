package com.hotel.dao;

import com.hotel.entities.Testa;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: cb
 * @Date: 2020/10/30 17:28
 * @Version 1.0
 */
@Mapper
public interface Test {
    public Testa select(Testa test);
}
