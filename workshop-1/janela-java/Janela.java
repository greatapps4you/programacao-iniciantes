import javax.swing.JFrame;
import javax.swing.JTextArea;
 
public class Janela extends JFrame{
  /* Componentes devem estar no contexto da instância,
      para que possam ser acessados em todos os métodos 
      não-estáticos da classe
  */
  private JTextArea texto = new JTextArea();
 
   public Janela(){
     //Define o título da janela
     super("Meu Notepad");
     this.montaJanela();
   } 
 
   private void montaJanela(){
      this.getContentPane().add(texto);
   }
  
   public static void main(String[] args){
       //Cria objeto:
       Janela janela = new Janela();
       janela.setSize(640,480);
       janela.setVisible(true);
   }
}
