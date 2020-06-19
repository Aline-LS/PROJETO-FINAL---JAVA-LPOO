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

public class MenuProfessor {
    int menuprof;
    String nome;
    String curso;
    int codprof;
    int cargahoraria;
    String cpf;
    String qtdcursos;
    int idade;
    Professor objprof;
    
    public MenuProfessor(int _menuprof){
        this.menuprof = _menuprof;
    }

    
    public int MostrarMenuProfessor(){
        do{
            //apresentação do menu professor
        menuprof = Integer.parseInt(JOptionPane.showInputDialog("=====Menu Professor===== \n 1 - Adicionar Professor \n 2 - Listar Professores \n 3- Pesquisar Professor \n 4 - Remover Professor \n 5 - Voltar"));
        // condição das opções do menu
        
            
        switch(menuprof){
            case 1:
                //add novo professor ao arraylist
                //criar objeto da classe
                objprof = new Professor(nome, cargahoraria, curso, codprof, cpf, qtdcursos, idade);
                //guardando dados no ArrayList professores
                objprof.MostrarDados();    
                ListaArrays.adicionar(objprof);

                break;
            case 2:
                // ira listar todos os professores e seus dados que estao no arraylist
                System.out.println(ListaArrays.listar());
                JOptionPane.showMessageDialog(null, "=====Listagem de Professores===== \n" + ListaArrays.listar());

                break;
            case 3:
                // ira pesquisar um professor atraves do nome
                nome = JOptionPane.showInputDialog("Digite o nome do professor que deseja pesquisar");
                JOptionPane.showMessageDialog(null, "=====Professores===== \n" +ListaArrays.pesquisar(nome));
                JOptionPane.showMessageDialog(null, "=====Professor===== \n Existem " + ListaArrays.pesquisar(nome) + " Professor(s) com o nome " + nome);
                
                
                break;
            case 4:
                //ira remover um professor atraves do nome, sendo que se não tiver nenhum professor com o nome digitado entao retornara professor não encontrado
                nome = JOptionPane.showInputDialog("Digite o nome do professor que deseja remover");
                if( ! (ListaArrays.getListaProfessores().isEmpty())){
                    if(ListaArrays.remover(nome)){
                        JOptionPane.showMessageDialog(null, "=====Professor removido ===== \n");

                    }else{
                        JOptionPane.showMessageDialog(null, "=====Professor não encontrado ===== \n");
                        
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "=====Não existe professores na Lista ===== \n");
                    
                }
                break;
            case 5:
                // menu professor ira finalizar e retornara ao menu principal
                MenuPrincipal mop = new MenuPrincipal(1);
                mop.MostrarMenuPrincipal();
                break;
            default:
                // opção invalida caso o usuario digite uma opção que nao tem
                System.out.println("Opção inválida");
                JOptionPane.showMessageDialog(null,"opção inválida");
                break;
        }
        //comandos irao se repetir ate que seja digitado 5, na qual fechara o menu professor e retornara ao menu principal
    }while(menuprof != 5);

        return menuprof;

    
    
    }
}
