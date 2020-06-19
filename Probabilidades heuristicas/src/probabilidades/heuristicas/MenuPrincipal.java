/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probabilidades.heuristicas;

/**
 *
 * @author Aline
 */
import javax.swing.JOptionPane;
public class MenuPrincipal {
    
    int menu;
    
    public MenuPrincipal(int _menu){
        this.menu = _menu;
    }
    
    public int MostrarMenuPrincipal(){
        do{
            // menu principal apresentará 5 opção que o usuário pode escolher, sendo que quando o numero 5 é digitado o sistema finaliza
        menu = Integer.parseInt(JOptionPane.showInputDialog("=====Menu Principal===== \n 1 - Introdução ao Sistema \n 2 - Professores \n 3- Disciplinas \n 4 - Probabilidades \n 5 - Sair"));
        //condição da opções
        switch(menu){
            case 1:
                // pequena explicação do sistema e apos lido o usuário retorna ao menu principal
                JOptionPane.showMessageDialog(null,"Este é um sistema na qual faz cadastramento de Professores e Disciplinas, fazendo com que o usuário possa cadastrar, listar, pesquisar e remover.");
                MenuPrincipal mop = new MenuPrincipal(1);
                mop.MostrarMenuPrincipal();                
                break;
            case 2:
                //chamar menu do professor
                MenuProfessor mpr = new MenuProfessor(0);
                mpr.MostrarMenuProfessor();
                break;
            case 3:
                //chama menu disciplina
                MenuDisciplina md = new MenuDisciplina(3);
                md.MostrarMenuDisciplina();
                break;
            case 4:
                break;
            case 5:
                //finaliza sistema
                JOptionPane.showMessageDialog(null, "Sistema Finalizado");
                System.out.println("Sistema Finalizado");
                break;
            default:
                //informara que foi digitado uma opçãoo que não esta dentro das condições
                System.out.println("Opção inválida");
                JOptionPane.showMessageDialog(null,"opção inválida");
        }
        }while(menu != 5);

        return menu;

    }
    
}
