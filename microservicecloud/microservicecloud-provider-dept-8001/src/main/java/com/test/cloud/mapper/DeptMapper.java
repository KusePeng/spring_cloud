package com.test.cloud.mapper;

import com.test.cloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @author: XP
 * @create: 2020/3/28
 */
@Mapper
public interface DeptMapper
{
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}

