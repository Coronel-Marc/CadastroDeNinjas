package dev.java10x.CadastroDeNinjas.Ninjas;

import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping(value = "/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService service;

    @GetMapping
    public List<NinjaModel> findAll() {

        return service.findNinjas();
    }

    @GetMapping(value = "/{id}")
    public NinjaModel findById(@PathVariable Long id) {

        return service.findNinjaById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public NinjaModel insert(@RequestBody @Validated NinjaModel ninja) {

        return service.novoNinja(ninja);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public NinjaModel deleteById(@PathVariable Long id) {
        return service.deleteNinjaById(id);
    }


}
