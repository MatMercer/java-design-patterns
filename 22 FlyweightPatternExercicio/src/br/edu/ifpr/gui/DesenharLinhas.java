package br.edu.ifpr.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Romualdo Rubens de Freitas
 */
public class DesenharLinhas extends JFrame {
  private static final Color colors[] = { Color.black,     Color.blue,
                                          Color.cyan,      Color.darkGray,
                                          Color.gray,      Color.green,
                                          Color.lightGray, Color.magenta,
                                          Color.orange,    Color.pink,
                                          Color.red,       Color.white,
                                          Color.yellow
                                        };
   private static final int FRAME_WIDTH     = 400,
                            FRAME_HEIGHT    = 400,
                            NUMBER_OF_LINES = 10000;
   public DesenharLinhas() {
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

      Container contentPane = getContentPane();
      contentPane.setLayout(new BorderLayout());
      
      JButton       button = new JButton("Desenhar linhas");
      final JPanel  panel  = new JPanel();
      contentPane.add(panel,BorderLayout.CENTER);
      contentPane.add(button,BorderLayout.SOUTH);
      setBounds(20,20,FRAME_WIDTH,FRAME_HEIGHT);      
      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent event) {
            Graphics g = panel.getGraphics();
            for(int i = 0; i < NUMBER_OF_LINES; i++) {
               // Substitua as as duas linahs de código a seguir pela
               // implementação do padrão de projetos Flyweight.
               // Sugestão: utilize o padrão de projetos Factory para criar
               // uma coleção de linhas mapeadas por sua cor, ou seja, antes
               // de instanciar um novo objeto linha, verifique se um objeto
               // com a cor especificada já não existe na coleção. Caso exista,
               // basta retorná-lo, caso contrário, crie um novo objeto,
               // armazene-o na coleção com base na sua cor e retorne-o.
               g.setColor(getRandomColor());
               g.drawLine(getRandomX(),getRandomY(), 
                          getRandomX(),getRandomY());
            } // for(int i = 0; i < NUMBER_OF_LINES; i++)
         } // public void actionPerformed(ActionEvent)
      });
   } // public DesenharLinhas()

   private int getRandomX() { return (int)(Math.random() * FRAME_WIDTH); }
   private int getRandomY() { return (int)(Math.random() * FRAME_HEIGHT); }
   private Color getRandomColor() {
      return colors[(int)(Math.random() * colors.length)];
   } // private Color getRandomColor()
} // public class DesenharLinhas extends JFrame
