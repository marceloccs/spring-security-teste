package br.com.mtools.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.mtools.mongodb.entidy.Student;


public interface StudentRepository extends MongoRepository<Student, String>{

}
