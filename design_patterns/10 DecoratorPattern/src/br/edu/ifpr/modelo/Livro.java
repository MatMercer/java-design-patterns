package br.edu.ifpr.modelo;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Livro extends ItemBibliotecaAbstract {
   private String titulo;
   private String autor;

   public Livro(String titulo, String autor, int exemplares) {
      this.titulo     = titulo;
      this.autor      = autor;
      this.exemplares = exemplares;
   } // public Livro(String, String, int)

   @Override
   public void mostrar() {
      System.out.println(getClass().getSimpleName() + ":\nTitulo " + titulo +
                         "\nAutor " + autor + "\nExemplares " + exemplares);
   }
} // public class Livro extends ItemBibliotecaAbstract
