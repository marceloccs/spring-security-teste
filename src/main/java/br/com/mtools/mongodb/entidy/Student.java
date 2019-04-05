package br.com.mtools.mongodb.entidy;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document
@Setter
@Getter
@ToString
public class Student {
	
	@Id
	private String id;
	private String name;
	private int age;

}
