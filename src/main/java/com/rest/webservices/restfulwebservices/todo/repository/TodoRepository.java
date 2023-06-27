package com.rest.webservices.restfulwebservices.todo.repository;

import com.rest.webservices.restfulwebservices.todo.pojo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

    List<Todo> findByUsername(String username);
}
