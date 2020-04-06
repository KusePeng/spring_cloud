package com.test.cloud.service.impl;

import java.util.List;

import com.test.cloud.entities.Dept;
import com.test.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.cloud.dao.DeptDao;

@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept)
	{
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		return dao.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		return dao.findAll();
	}

}
