package org.spring.springboot.service;

import org.spring.springboot.dao.UserDao;
import org.spring.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Component
public class UserService {

    @Autowired
    private UserDao userDao;



    @Transactional
    public int saveUsers(Set<User> users) {
        return userDao.saveUsers(users);
    }

    @Transactional
    public void modifyEnterpriseIdByUserId(Set<User> users) {
        for(User u : users) {
            userDao.modifyEnterpriseId(u.getId(), u.getEp_id());
        }
    }
}
