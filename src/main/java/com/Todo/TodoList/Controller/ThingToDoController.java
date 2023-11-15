package com.Todo.TodoList.Controller;

import com.Todo.TodoList.Entity.ThingToDo;
import com.Todo.TodoList.Repository.ThingToDoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("")
public class ThingToDoController {
private final ThingToDoRepository thingToDoRepository;

public ThingToDoController(ThingToDoRepository thingToDoRepository) {
    this.thingToDoRepository = thingToDoRepository;
}


@PostMapping("/thingToDo")
@ResponseStatus(HttpStatus.CREATED)
public ThingToDo create(@RequestBody ThingToDo newThingToDo){return thingToDoRepository.save(newThingToDo);}

@GetMapping("/thingstodo")
@ResponseStatus(HttpStatus.OK)
public List<ThingToDo> getThingsToDo(){return thingToDoRepository.findAll();}

@GetMapping("/thingsToDo/{id}")
@ResponseStatus(HttpStatus.FOUND)
public Optional<ThingToDo> GetListingById(@PathVariable Long id){return thingToDoRepository.findById(id);}

@PutMapping("/thingsToDo/{id}")
@ResponseStatus(HttpStatus.ACCEPTED)
public ThingToDo update(@PathVariable Long id, @RequestBody ThingToDo thingToDo)
{
    try {
        thingToDo.setId(id);
    } catch (Exception e){
        System.out.println(e);
    }
    return thingToDoRepository.save(thingToDo);
}

@DeleteMapping("/thingstodo/{id}")
@ResponseStatus(HttpStatus.ACCEPTED)
public void delete(@PathVariable Long id){thingToDoRepository.deleteById(id);}
}
