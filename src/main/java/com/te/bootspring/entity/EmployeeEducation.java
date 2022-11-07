package com.te.bootspring.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
@Table(name="EmployeeEducationInfo")
public class EmployeeEducation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eduId;
	private String qualification;
	private String street;
	private String country;
	@ManyToOne(cascade= CascadeType.ALL)
	@JsonBackReference
	private Employee employeePrimaryInfo;

}
