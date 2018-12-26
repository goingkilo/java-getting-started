package com.example.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class EntryController {

    @Autowired
    EntryRepository repository;

    @GetMapping("/todos")
    public ModelAndView all() {

        ModelAndView v = new ModelAndView("items");
        List<Entry> l = repository.findAll();
        v.addObject("donkeys", l);
        return v;
    }

    @GetMapping("/todos/.json")
    public List<Entry> alljson() {

        List<Entry> l = repository.findAll();
        return l;
    }

    @GetMapping("/todos/{id}")
    public ModelAndView get(@PathVariable Long id){
        ModelAndView mv = new ModelAndView("item");

        Optional<Entry> l = repository
                .findById(id);
        mv.addObject( "item", l.get());
        return mv;
    }

    @PostMapping("/todos")
    public String newEmployee(@ModelAttribute Entry newEntry) {

        repository.save( newEntry);
        return "OK done";
    }

    @PutMapping("/todos/{id})")
    public void put(){

    }

    @DeleteMapping("/todos/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }


}