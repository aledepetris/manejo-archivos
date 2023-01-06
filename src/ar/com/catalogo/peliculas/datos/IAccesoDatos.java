package ar.com.catalogo.peliculas.datos;

import ar.com.catalogo.peliculas.domain.Pelicula;
import ar.com.catalogo.peliculas.excepciones.AccesoDatosException;
import ar.com.catalogo.peliculas.excepciones.EscrituraDatosException;
import ar.com.catalogo.peliculas.excepciones.LecturaDatosException;

import java.util.List;

public interface IAccesoDatos {

    boolean existe(String nombreArchivo) throws AccesoDatosException;

    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosException;

    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosException;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosException;

    void crear(String nombreRecurso) throws AccesoDatosException;

    void borrar(String nombreRecurso) throws AccesoDatosException;

}
