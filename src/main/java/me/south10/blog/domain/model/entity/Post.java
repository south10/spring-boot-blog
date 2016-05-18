package me.south10.blog.domain.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by spring on 2016-05-15.
 */
@Getter
@Setter
@Entity
public class Post {
	@Id
	@GeneratedValue
	int id;

	String userId;
	String name;

	@NotNull
	@Size(min = 1, max = 255)
	@Column(nullable = false)
	String title;

	@Size(max = 255)
	String subtitle;

	@NotNull
	@Size(min = 1, max = 100000000)
	@Column(length = 100000000)
	String content;

	String _csrf;

	LocalDateTime regDate;

	@Min(value = 1)
	private int categoryId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryId", insertable = false, updatable = false)
	private Category category;
}
