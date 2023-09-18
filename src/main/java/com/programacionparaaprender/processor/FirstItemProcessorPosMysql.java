package com.programacionparaaprender.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.programacionparaaprender.postgresql.entity.Student;

@Component
public class FirstItemProcessorPosMysql implements ItemProcessor<Student, com.programacionparaaprender.mysql.entity.Student> {

	@Override
	public com.programacionparaaprender.mysql.entity.Student process(Student item) throws Exception {
		
		System.out.println(item.getId());
		
		com.programacionparaaprender.mysql.entity.Student student = new 
				com.programacionparaaprender.mysql.entity.Student();
		
		student.setId(item.getId());
		student.setFirstName(item.getFirstName());
		student.setLastName(item.getLastName());
		student.setEmail(item.getEmail());
		student.setDeptId(item.getDeptId());
		student.setIsActive(item.getIsActive() != null ? 
				Boolean.valueOf(item.getIsActive()) : false);
		
		return student;
		
	}

}
