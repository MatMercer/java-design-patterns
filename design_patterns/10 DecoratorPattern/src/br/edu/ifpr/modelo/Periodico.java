package br.edu.ifpr.modelo;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class Periodico extends ItemBibliotecaAbstract {
   private String titulo;
   private String editora;
   private int    volume;
   private int    edicao;

   public Periodico(String titulo, String editora, int volume, int edicao,
                    int exemplares) {
      this.titulo     = titulo;
      this.editora    = editora;
      this.volume     = volume;
      this.edicao     = edicao;
      this.exemplares = exemplares;
   } // public Periodico(String, String, int)

   @Override
   public void mostrar() {
      System.out.println(getClass().getSimpleName() + ":\nTitulo " + titulo +
                         "\nEditora " + editora + "\nVolume " + volume +
                         "\nEdicao " + edicao + "\nExemplares " + exemplares);
   }
} // public class Periodico extends ItemBibliotecaAbstract
