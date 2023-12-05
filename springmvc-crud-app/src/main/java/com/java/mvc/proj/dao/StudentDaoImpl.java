package com.java.mvc.proj.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.mvc.proj.model.Student;


@Repository("studentDao")
@Transactional
public class StudentDaoImpl extends AbstractDao<Long, Student> implements StudentDao {

	@Override
	public Student getStudent(Long id) {
		return getByKey(id);
	}

	@Override
	public Long saveStudent(Student st) {
		persist(st);
		return st.getId();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Student> listAllStudents() {
		Criteria criteria = createEntityCriteria();
		return (List) criteria.list();
	}

	@Override
	public void updateStudent(Student st) {
		update(st);
	}

	@Override
	public void deleteStudent(Student st) {
		delete(st);
	}

}
