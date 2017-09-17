package com.musejam.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.musejam.app.model.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Long> {

    public User findUserByEmail(@Param("email") String email);

    public User findUserByPassword(@Param("password") String password);

    public User findUserByAuthToken(String authToken);

    public Iterable<User> findByAuthToken(@Param("authToken") String authToken);

    public User findByEmailAndPassword(String email, String password);

}
