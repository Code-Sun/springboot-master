package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.User;

import java.util.List;
import java.util.Set;

public interface UserDao {

    List<User> getAll();

    User getOne(long id);

    int saveUsers(@Param("users") Set<User> users);

    int modifyEnterpriseId(@Param("uid") long userId, @Param("eid") long enterpriseId);
}
