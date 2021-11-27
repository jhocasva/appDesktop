import java.util.Date;

public class Libro {
    private	String titulo;
    private String autor;
    private Date fechaPublicacion;
    private  String editorial;
    private 	int numeroPaginas;

    public Libro(String tituloAPoner, String autorAPoner, Date fechaDePublicionAPoner,String editorialAPoner, int numeroPaginasAPoner  ){
        titulo = tituloAPoner;
        autor = autorAPoner;
        fechaPublicacion = fechaDePublicionAPoner;
        editorial = editorialAPoner;
        numeroPaginas = numeroPaginasAPoner;
    }

    public Libro(String tituloAPoner){
        titulo = tituloAPoner;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String tituloAPoner){
        titulo = tituloAPoner;
    }


    public String getAutor(){
        return autor;
    }

    public void setAutor(String nombreAPoner){
        autor = nombreAPoner;
    }

    public Date getFechaPublicacion(){
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaAPoner){
        fechaPublicacion= fechaAPoner;
    }

    public String getEditorial(){
        return editorial;
    }

    public void setEditorial(String editorialAPoner){
        editorial = editorialAPoner;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginaAPoner){
        numeroPaginas = numeroPaginaAPoner;
    }

    /*@Override
    public String toString(){
        String representacionLibro = "el libro " + titulo  + " fue escrito por " + autor +  " y tiene " + numeroPaginas + " paginas";
        return representacionLibro;
    }*/

    @Override
    public String toString() {
        return "Libro" +
                "  titulo='" + titulo + '\n' +
                "  autor='" + autor + '\n' +
                "  fechaPublicacion=" + fechaPublicacion + '\n' +
                "  editorial='" + editorial + '\n' +
                "  numeroPaginas=" + numeroPaginas;
    }


}