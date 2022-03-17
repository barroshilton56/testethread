package crud;

import javax.swing.JFrame;

public class GUI {
 public static void main(String[] args) {
  Tela tela = new Tela();
  
  tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  tela.setSize(400,100);
  tela.setLocationRelativeTo(null);
  tela.setVisible(true);
 }
}
