package dev.java10x.CadastroDeNinjas.Ninjas;

import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ninjas")
public class NinjaController {

    @Autowired
    private NinjaRepository repository;

    @GetMapping
    public List<NinjaModel> findAll() {

        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public NinjaModel findById(@PathVariable Long id) {

        return repository.findById(id).get();
    }

    @PostMapping
    public NinjaModel insert(@RequestBody NinjaModel ninja) {
        NinjaModel result = repository.save(ninja);

        return result;
    }



}
