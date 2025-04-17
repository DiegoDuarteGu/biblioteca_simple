package com.example.Biblioteca.Services;
import com.example.Biblioteca.Model.Libro;
import com.example.Biblioteca.Repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros(){
        return libroRepository.obteneLibros();
    }

    public Libro saveLibro(Libro libro){
        return libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id){
        return libroRepository.buscarPorId(id);
    }

    public updateLibro(Libro libro){
        return libroRepository.actualizar(libro);
        
    }

}
