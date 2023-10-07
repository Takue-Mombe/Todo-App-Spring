package com.todoapp.todoapp.Controller;

import com.todoapp.todoapp.Repository.HomeRepository;
import com.todoapp.todoapp.entity.home;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController

@CrossOrigin(origins = "http://localhost:5817")
@RequestMapping(value = "/home")
public class homecontroller {

    @Autowired
    private HomeRepository homerepo;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:5817")
    public List<home>findAll(){
        return homerepo.findAll();
    }
    @PostMapping
    @CrossOrigin(origins = "http://localhost:5817")
    public home save(@Valid @NotNull @RequestBody home Home){return homerepo.save(Home);}
    @PutMapping
    @CrossOrigin(origins = "http://localhost:5817")
    public home update(@Valid @NotNull @RequestBody  home Home){return homerepo.save(Home);}
    @DeleteMapping(value = "{id}")
    @CrossOrigin(origins = "http://localhost:5817")
    public home delete(@PathVariable Long id){homerepo.deleteById(id);return null;}

}
