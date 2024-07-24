/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telasGraficas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author vanessalagomachado
 */
public class BemVindo {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        
        janela.setSize(400, 400);
        janela.setTitle("Bem-vindo(a) a GUI em Java");
        janela.setLayout(new FlowLayout());
                
                
        // Criação de componentes 
        JLabel lblNome = new JLabel("Nome: ");
        JTextField txtNome = new JTextField(20);
        JButton btnEnviar = new JButton("Enviar");
        
        
       // Adição de componentes  na Janela
        janela.add(lblNome);
        janela.add(txtNome);
        janela.add(btnEnviar);
        
        // Evento de Clique do botão
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   JOptionPane.showMessageDialog(janela, 
                           "Bem-vindo(a) "+txtNome.getText());

            }
        });
        
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
