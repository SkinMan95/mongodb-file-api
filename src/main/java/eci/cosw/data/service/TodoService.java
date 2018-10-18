package eci.cosw.data.service;

import eci.cosw.data.model.Todo;

import java.util.List;

public interface TodoService {
    public List<Todo> getTodoList();

    public Todo addTodo(Todo todo);
}
