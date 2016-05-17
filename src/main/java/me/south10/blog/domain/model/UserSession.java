package me.south10.blog.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by south10 on 2016-05-17.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserSession {
    String providerUserId;
    String imageUrl;
    String displayName;
}

