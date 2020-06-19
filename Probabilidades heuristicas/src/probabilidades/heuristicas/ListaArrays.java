/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probabilidades.heuristicas;

import java.util.ArrayList;

/**
 *
 * @author Aline
 */
public class ListaArrays {
    //lista de professores -> todo novo professor cadastrado sera inserido na lista
    private static ArrayList<Professor> ListaProfessores = new ArrayList<>();
    
    //metodo get
    public static ArrayList<Professor> getListaProfessores(){
        return ListaProfessores;
    }
    // add um professor a lista
    static public void adicionar(Professor p){
        ListaProfessores.add(p);
    }
    
    //listar os dados de todos os objetos da lista
    static public String listar(){
        String saida = "";
        
        for(Professor p : ListaProfessores){
            int i = 1;
            saida += "\n====== PROFESSOR Nº " + (i++) + "=====\n";
            saida += p.Imprimir() + "\n";
        }
        return saida;
    }
    
    //metodo para pesquisar por nome
    static public int pesquisar(String nome){
        int qtd = 0;
        
        for(Professor p : ListaProfessores){
            System.out.println(p.getNome()+"-"+nome);
            if(p.getNome().equalsIgnoreCase(nome)){
                qtd++;
            }
        }
        
        return qtd;
    }

    
    // remover um professor pelo nome
    static public boolean remover(String nome){
        for(Professor p : ListaProfessores){
            if(p.getNome().equalsIgnoreCase(nome)){
                ListaProfessores.remove(p);
                return true;
            }
        }
        return false;
    }
    
    
    
    // lista de disciplina -> sera listado todos as novas disciplinas que forem cadastrados
    private static ArrayList<Disciplina> ListaDisciplinas = new ArrayList<>();
    
    public static ArrayList<Disciplina> getListaDisciplinas(){
        return ListaDisciplinas;
    }
    
    //Add uma disciplina na lista
    static public void adicionard(Disciplina d){
        ListaDisciplinas.add(d);
    }
    
    //Listar disciplinas
    static public String listard(){
        String saida = "";
        
        for(Disciplina d : ListaDisciplinas){
            int i = 1;
            saida += "\n====== DISCIPLINAS Nº " + (i++) + "=====\n";
            saida += d.Imprimir() + "\n";
        }
        return saida;
    }
    
        //metodo para pesquisar por disciplina
    static public int pesquisard(String disciplin){
        int qtd = 0;
        
        for(Disciplina d : ListaDisciplinas){
            System.out.println(d.getDisciplin()+"-"+disciplin);
            if(d.getDisciplin().equalsIgnoreCase(disciplin)){
                qtd++;
            }
        }
        
        return qtd;
    }
    
    // remover um professor pelo nome
    static public boolean removerd(String disciplin){
        for(Disciplina d : ListaDisciplinas){
            if(d.getDisciplin().equalsIgnoreCase(disciplin)){
                ListaDisciplinas.remove(d);
                return true;
            }
        }
        return false;
    }
    
    
    
}
