package br.com.mtools.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mtools.mongodb.entidy.Student;
import br.com.mtools.mongodb.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public List<Student> listStudent() {
		return this.studentRepository.findAll();
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable String id) {
		return this.studentRepository.findOne(id);
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
	public boolean deleteStudent(@PathVariable String id) {
		try {
			this.studentRepository.delete(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public Student save(@RequestBody Student student) {
		return this.studentRepository.save(student);
	}
}
