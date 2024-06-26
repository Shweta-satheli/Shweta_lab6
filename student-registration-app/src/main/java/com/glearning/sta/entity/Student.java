package com.glearning.sta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "first_name", nullable = false)
		private String firstName;
		
		@Column(name = "last_name")
		private String lastName;
		
		@Column(name = "course")
		private String course;
		
		@Column(name = "country")
		private String country;

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Student(Long id, String firstName, String lastName, String course, String country) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.course = course;
			this.country = country;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}
		
		


}

}
