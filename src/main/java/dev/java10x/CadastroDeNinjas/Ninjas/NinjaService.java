package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository repository;


    public NinjaModel novoNinja(NinjaModel ninja) {
        // Regras de negócio aqui
        return repository.save(ninja);
    }

    public List<NinjaModel> findNinjas() {
        return repository.findAll();
    }

    public NinjaModel findNinjaById(Long id) {
        return repository.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Ninja não encontrado"));
    }

    public NinjaModel deleteNinjaById(Long id) {
        NinjaModel ninja = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Ninja não encontrado"));
        repository.deleteById(id);
        return ninja;
    }
}
