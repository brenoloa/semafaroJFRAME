
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Sistema {
    private Semafaro s1;
    private boolean aberto = false;
    public Sistema(Semafaro s1) {
        this.s1 = s1;
        JFrame tela = new JFrame("Central de Controle");
        tela.setSize(350, 100);
        tela.setResizable(false);
        tela.setDefaultCloseOperation(tela.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);


        JButton botao1 = new JButton("FECHAR SINAL");

        JButton botao2 = new JButton("ABRIR SINAL");

        botao1.setBounds(10, 0, 150, 50);
        botao2.setBounds(170, 0, 150, 50);

        tela.add(botao1);
        tela.add(botao2);

        botao1.addActionListener(this::fechar);
        botao2.addActionListener(this::abrir);

        tela.setVisible(true);

    }

    private void fechar(ActionEvent e){
        if (this.aberto == true){
            this.aberto = false;
            s1.apagarVerde();
            s1.amarelo();
            Timer timer = new Timer(5000, (ActionEvent evt) -> {
                s1.vermelho();
                s1.apagarAmarelo();
            });
            timer.setRepeats(false); 
            timer.start(); 
            
        }
        
        
    }

    private void abrir(ActionEvent e) {
        if (this.aberto == false){
            this.aberto = true;

            s1.apagarVermelho();
            s1.verde();
        }

    }


}
