package com.example.foglio.Controller;


import com.example.foglio.Model.Entity.Libro;
import com.example.foglio.Service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LibroController {

    @Autowired
    LibroService libroSer;

    @GetMapping("/libri")
    public List<Libro> getAll(){
        return libroSer.getAll();
    }

    @GetMapping("/libri/{id}")
    public Libro getById(@PathVariable int id){
        return libroSer.getById(id);
    }

    @GetMapping("/libri/name/{id}")
    public String getByID(@PathVariable int id){
        return libroSer.getById(id).getTitolo();
    }

    @PostMapping("/libri/inserisci")
    public void  inserisciLibro(@RequestBody Libro lbr){
        libroSer.insert(lbr);
    }

    @DeleteMapping("/libri/elimina/{id}")
    public void deleteLibro(@PathVariable int id){
        libroSer.deleteById(id);
    }
}
