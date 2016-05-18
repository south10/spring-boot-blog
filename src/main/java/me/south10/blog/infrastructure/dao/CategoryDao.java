package me.south10.blog.infrastructure.dao;

import me.south10.blog.domain.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by south10 on 2016-05-18.
 */
public interface CategoryDao extends JpaRepository<Category,Integer>{
}
