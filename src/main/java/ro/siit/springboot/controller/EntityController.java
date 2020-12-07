package ro.siit.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.siit.springboot.model.Entitate;

import java.util.UUID;

@RestController
@RequestMapping("/entity")
public class EntityController {
    @GetMapping("/{id}")
    public Entitate getEntity (@PathVariable UUID id){
        Entitate e = new Entitate();
        e.setName("First entity > - " + id);
        return e;
    }
}
