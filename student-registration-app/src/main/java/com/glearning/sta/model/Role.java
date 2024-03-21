package com.glearning.sta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Entity
@Table(name="roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode	
public class Role<string> {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private string role;

    public Role(string role){
    	this.role = role;
    }
    
    @ManyToMany
    @JoinTable(
    		name="user_roles"
    		joinColumns = @JoinColumns(name="role_id", nullable = false, value = { @JoinColumn })
    		inverseJoinColumns = Role(name="user_id",nullable = false)
    		)
    private Set<User> users = HashSet<>();
}
