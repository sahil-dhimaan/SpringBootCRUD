package com.example.demo.entity;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;;

@Entity
@Table(name ="EmployeInfo")
@Getter
@Setter
@ToString
public class Employee {
	
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
 
  private String Name;
  private String Dept;
  


}
