package me.south10.blog.domain.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by south10 on 2016-05-18.
 */
@Data
@Entity
public class Category {
    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    private String name;

    private Date regDate;

    private int postCount;

    private int publicPostCount;
}
