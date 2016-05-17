package me.south10.blog.application.aop;

import me.south10.blog.domain.model.UserSession;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionData;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by south10 on 2016-05-17.
 */
public class UserSessionInterceptor extends HandlerInterceptorAdapter{
    private ConnectionRepository connectionRepository;

    public UserSessionInterceptor(ConnectionRepository connectionRepository) {
        this.connectionRepository = connectionRepository;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Connection<Facebook> connection = connectionRepository.findPrimaryConnection(Facebook.class);

        if(connection!=null){
            ConnectionData data = connection.createData();
            request.setAttribute("user", new UserSession(data.getProviderUserId(), data.getImageUrl(), data.getDisplayName()));
        }

        return true;
    }
}
