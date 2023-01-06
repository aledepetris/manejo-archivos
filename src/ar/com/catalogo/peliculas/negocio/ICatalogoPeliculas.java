package ar.com.catalogo.peliculas.negocio;

public interface ICatalogoPeliculas {

    String NOMBRE_RECURSO = "peliculas.txt";

    void agregarPelicula(String nombrePelicula);

    void listarPeliculas();

    void buscarPelicula(String buscar);

    void iniciarCatalogoPeliculas();

}
