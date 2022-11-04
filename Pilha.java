package aula411;

import javax.swing.JOptionPane;

public class Pilha{
    int tam = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho"));
    public char elementos[] = new char[tam];
    int topo = -1;
    
    public void push(char elemento){
        topo++;
        elementos[topo] = elemento;
    }

    public char pop(){
        char elemento = elementos[topo];
        topo--;
        return elemento;
    }
}