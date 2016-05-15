package me.south10.blog.domain.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by spring on 2016-05-14.
 */
@Getter
@Setter
@Entity
public class Hello {
	@Id
	@GeneratedValue
	int id;
    String name;
}
