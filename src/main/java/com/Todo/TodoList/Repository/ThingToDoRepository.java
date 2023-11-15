package com.Todo.TodoList.Repository;

import com.Todo.TodoList.Entity.ThingToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThingToDoRepository extends JpaRepository<ThingToDo, Long> {
}
