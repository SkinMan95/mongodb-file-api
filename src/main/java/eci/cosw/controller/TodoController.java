package eci.cosw.controller;

import eci.cosw.data.model.Todo;
import eci.cosw.data.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("todo")
public class TodoController {

    TodoController() {

    }

    @Autowired
    TodoService todoService;

    @PostMapping("/todo")
    public ResponseEntity<?> addNewTodo(@RequestBody Todo newTodo) {
        try {
            this.todoService.addTodo(newTodo);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.FORBIDDEN);
        }
    }

    @GetMapping("/todo")
    public List<Todo> getTodoList() {
        return this.todoService.getTodoList();
    }
}
