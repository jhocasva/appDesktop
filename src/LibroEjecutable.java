import java.util.Date;

public class LibroEjecutable {
    public static void main (String[] args){
        Libro libro1 = new Libro("cien años","gabo",new Date(), "norma", 89);
        /*libro1.setTitulo("cien años de soledad");
        libro1.setAutor("gabo");
        libro1.setNumeroPaginas(456);*/

        System.out.println(libro1);

        Libro libro2 = new Libro("la peste");

        //libro2.setTitulo("la peste");
        //libro2.setAutor("Julio cortazar");
        //libro2.setNumeroPaginas(238);

        System.out.println(libro2);

        //Libro libro3 = new Libro("1984");
        //System.out.println(libro3);


    }
}
