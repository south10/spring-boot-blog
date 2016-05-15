package me.south10.blog.infrastructure.dao;

import me.south10.blog.domain.model.entity.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by spring on 2016-05-14.
 */
public interface HelloDao extends JpaRepository<Hello, Integer>{
}
