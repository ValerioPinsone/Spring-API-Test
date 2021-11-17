package com.example.foglio.Service;

import com.example.foglio.Model.Entity.Libro;
import com.example.foglio.Repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    LibroRepository libroRep;

    //Metodo che ritorna la lista di tutti i libri
    public List<Libro> getAll(){ return libroRep.findAll(); }

    //Metodo che permette di trovare un libro in funzione del suo id
    public Libro getById(int p){ return libroRep.findById(p).orElse(new Libro());}

    //Metodo che permette di inserire un nuovo libro
    public void insert(Libro l){
        libroRep.save(l);
    }

    //mod
    public void delete(int l){
        libroRep.delete(libroRep.getById(l));
    }


}
