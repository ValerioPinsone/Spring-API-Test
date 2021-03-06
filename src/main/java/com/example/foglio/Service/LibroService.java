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

    //Metodo che permette di eliminare un libro in funzione del suo id
    public void deleteById(int n){
        libroRep.delete(libroRep.getById(n));
    }

    //Metodo che permette di sostituire un libro in funzione del suo id
    public void replaceById(int n){
        //da implementare
    }




}
