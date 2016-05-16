package me.south10.blog.domain.model.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	LocalDateTime regDate;
}
