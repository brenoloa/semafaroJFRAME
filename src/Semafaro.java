import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Semafaro {
    JButton vermelho;
    JButton amarelo;
    JButton verde;
    public Semafaro() {
        JFrame tela = new JFrame();
        tela.setSize(140, 640);
        tela.setResizable(false);
        tela.setDefaultCloseOperation(tela.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        vermelho = new JButton();
        amarelo = new JButton();

        verde = new JButton();
  
        vermelho.setBounds(0, 0, 140, 200);
        amarelo.setBounds(0, 200, 140, 200);
        verde.setBounds(0, 400, 140, 200);
        
        vermelho.setBackground(new Color(255, 0, 0));
        verde.setBackground(new Color(201, 212, 204));
        amarelo.setBackground(new Color(201, 212, 204));
        
        
        tela.add(verde);
        tela.add(amarelo);
        tela.add(vermelho);
        
        tela.setVisible(true);
    }

    public void amarelo(){
        amarelo.setBackground(new Color(255, 170, 0));
    }

    public void vermelho(){
        vermelho.setBackground(new Color(255, 0, 0));
    }
    
    public void verde(){
        verde.setBackground(new Color(0, 255, 0));
    }

    public void apagarVerde(){
        verde.setBackground(new Color(201, 212, 204));

    }
    public void apagarVermelho(){
        vermelho.setBackground(new Color(201, 212, 204));

    }
    public void apagarAmarelo(){
        amarelo.setBackground(new Color(201, 212, 204));

    }
}
