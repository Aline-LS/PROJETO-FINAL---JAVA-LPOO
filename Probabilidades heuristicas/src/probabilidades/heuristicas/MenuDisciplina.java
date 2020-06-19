/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probabilidades.heuristicas;

import javax.swing.JOptionPane;

/**
 *
 * @author Aline
 */
public class MenuDisciplina {
    int menudisc;
    String disciplin;
    int cargahorariadisciplina;
    Disciplina objdisc;
    
    public MenuDisciplina(int _menudisc){
        this.menudisc = _menudisc;
    }
    
    public int MostrarMenuDisciplina(){
        do{
            //apresentação do menu disciplina
            menudisc = Integer.parseInt(JOptionPane.showInputDialog("=====Menu Disciplina===== \n 1 - Adicionar Disciplina \n 2 - Listar Disciplinas \n 3- Pesquisar Disciplina \n 4 - Remover Disciplina \n 5 - Voltar"));
            
            switch(menudisc){
                case 1:
                    //add novo professor a lista
                    objdisc = new Disciplina (disciplin, cargahorariadisciplina);
                    objdisc.MostrarDisciplina();
                    ListaArrays.adicionard(objdisc);
                    
                    break;
                case 2:
                    // ira listar todas as disciplinas e seus dados que contem no arraylist
                    System.out.println(ListaArrays.listard());
                    JOptionPane.showMessageDialog(null, "=====Listagem de Discilpinas===== \n" + ListaArrays.listard());
                   
                    break;
                case 3:
                    // pesquisara se ha uma disciplina de acordo com a escolha do usuario
                    disciplin = JOptionPane.showInputDialog("Digite o nome da disciplina que deseja pesquisar");
                    JOptionPane.showMessageDialog(null, "=====Disciplina===== \n" +ListaArrays.pesquisard(disciplin));
                    JOptionPane.showMessageDialog(null, "=====Disciplina===== \n Existem " + ListaArrays.pesquisard(disciplin) + " Disciplinas com o nome" + disciplin);
              
                    break;
                case 4:
                    //irá remover uma disciplina atraves do nome da disciplina
                    disciplin = JOptionPane.showInputDialog("Digite o nome do professor que deseja remover");
                        if( ! (ListaArrays.getListaDisciplinas().isEmpty())){
                            if(ListaArrays.removerd(disciplin)){
                                JOptionPane.showMessageDialog(null, "=====Disciplina removida ===== \n");

                            }else{
                            JOptionPane.showMessageDialog(null, "=====Disciplina não encontrada ===== \n");
                        
                            }

                        }else{
                            JOptionPane.showMessageDialog(null, "=====Não existe disciplinas na Lista ===== \n");
                    
                        }
                    
                    break;
                case 5:
                    //retorna ao menu principal
                    MenuPrincipal mop = new MenuPrincipal(1);
                    mop.MostrarMenuPrincipal();
                    
                    break;
                default:
                    // se o usuario difgitar uma opção que não tem aparecera opção invalida
                    System.out.println("Opção inválida");
                    JOptionPane.showMessageDialog(null,"opção inválida");
                    break;
            }
            
         // os comandos irão se petir ate que seja digitado 5, fazendo assim o menu disciplina fechar e retornar ao menu principal   
        }while(menudisc != 5);
        return menudisc;
        
    }
}
