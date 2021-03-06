package me.south10.blog.infrastructure.dao;

import me.south10.blog.domain.model.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by spring on 2016-05-15.
 */
public interface PostDao extends JpaRepository<Post, Integer> {
    public Page<Post> findByCategoryId(int categoryId, Pageable pageable);
}
