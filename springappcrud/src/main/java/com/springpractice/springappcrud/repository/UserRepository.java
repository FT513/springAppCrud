package com.springpractice.springappcrud.repository;

import com.springpractice.springappcrud.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findById(Long id);

List<User> findAll();

User findUserByUsername(String username);

User findUserById(long id);


User save(User user);

void delete(User user);




}
