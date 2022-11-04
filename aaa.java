package aula411;

import javax.swing.JOptionPane;

public class aaa {
    public static void main(String[] args){
        Pilha pilha = new Pilha();
        int resp=0;
        do{
            String caractere = JOptionPane.showInputDialog("Digite um caracter");
            pilha.push(caractere.charAt(0));
            resp = JOptionPane.showConfirmDialog(null,"Cadastrar Outro?");
        }while(resp==0);

        System.out.print(lerPilhaChar(pilha));
    }
    public static String lerPilhaChar(Pilha pilha){
        String s = "";
        while(pilha.topo>-1)
            s += pilha.pop();
        return s;
    }
}
