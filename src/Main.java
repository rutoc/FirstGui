import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Panel infoPessoais = new Panel();
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // mostra o Frame
        frame.setTitle("Teste");

        frame.add(infoPessoais);

        JLabel loginLabel = new JLabel("Login");
        loginLabel.setBounds(10,10,20,30);

        JTextField loginField = new JTextField(20);
        loginField.setBounds(10,100,20,20);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(10,10,20,30);

        JPasswordField passField = new JPasswordField(20);
        passField.setBounds(10,100,20,20);
        infoPessoais.add(passField);

        JButton loginButton = new JButton("Entrar");

        JLabel loginStatus = new JLabel("Insira as informações de Login");

        ActionListener clicarBotao = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        };

        infoPessoais.add(loginLabel);
        infoPessoais.add(loginField);
        infoPessoais.add(passLabel);
        infoPessoais.add(loginButton);
        infoPessoais.add(loginStatus);
    }
}
