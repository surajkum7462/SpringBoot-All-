package com.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.entity.Emp;


@Repository
public class EmpDaoImpl implements EmpDao{
	
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int saveEmp(Emp emp) {
		int i=(Integer) hibernateTemplate.save(emp);
		return i;
	}

	@Override
	public Emp getEmpById(int id) {
	Emp emp=	hibernateTemplate.get(Emp.class, id);
	return emp;
	}

	@Override
	public List<Emp> getAll() {
		List<Emp> emp=hibernateTemplate.loadAll(Emp.class);
		return emp;
	}

	@Override
	@Transactional
	public void update(Emp emp) {
		hibernateTemplate.update(emp);
		
	}

	@Override
	@Transactional
	public void deleteEmp(int id) {
		
		Emp emp=hibernateTemplate.get(Emp.class, id);
		hibernateTemplate.delete(emp);
		
	}
	
	

}
