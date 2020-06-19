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

//import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Professor {

    
    public String nome;
    public int cargahoraria;
    public int codprof;
    public String curso;
    public String cpf;
    public String qtdcursos;
    public int idade;

    
    public Professor( String _nome, int _cargahoraria, String _curso, int _codprof, String _cpf, String _qtdcursos, int _idade ){
        this.nome = _nome;
        this.cargahoraria = _cargahoraria;
        this.curso = _curso;
        this.codprof = _codprof;
        this.cpf = _cpf;
        this.qtdcursos = _qtdcursos;
        this.idade = _idade;

    }
/**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cargahoraria
     */
    public int getCargahoraria() {
        return cargahoraria;
    }

    /**
     * @param cargahoraria the cargahoraria to set
     */
    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    /**
     * @return the codprof
     */
    public int getCodprof() {
        return codprof;
    }

    /**
     * @param codprof the codprof to set
     */
    public void setCodprof(int codprof) {
        this.codprof = codprof;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the qtdcursos
     */
    public String getQtdcursos() {
        return qtdcursos;
    }

    /**
     * @param qtdcursos the qtdcursos to set
     */
    public void setQtdcursos(String qtdcursos) {
        this.qtdcursos = qtdcursos;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }


        
    
    public String MostrarDados(){
    
        //sera pedido para que insira os dados do novo professor
        setNome(JOptionPane.showInputDialog("Digite o nome do professor(a)"));
            System.out.println("Nome Professor(a): " + getNome());

        setCargahoraria(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária do professor " + getNome())));
            System.out.println("Carga Horária: " +getCargahoraria()+ "Hs");

        setCurso(JOptionPane.showInputDialog("Digite o curso na qual este professor dará aula."));
            System.out.println("Curso: " +getCurso());
        
        setCodprof(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do professor")));
            System.out.println("Código do Professor:" + getCodprof());
            
        setCpf (JOptionPane.showInputDialog("Digite o CPF" + getCpf()));
            System.out.println("CPF:" + getCpf());
            
        setQtdcursos(JOptionPane.showInputDialog("Quantos cursos ja fez?" + getQtdcursos()));
            System.out.println("Quantidade de cursos:" + getQtdcursos());
            
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a idade?" + getIdade())));
            System.out.println("Idade:" + getIdade());
        
        DisponibilidadeDia teste = new DisponibilidadeDia( 1 );
        teste.MostrarDia();
        
        
        return null;

    }
    //sera impresso todos os dados do professores quando for pedido e estiverem contidos na lista
    public String Imprimir(){
        return "Nome:" + getNome()+ "\n Carga horaria:" +getCargahoraria() + 
                "\n Curso:" +getCurso()+ "\n Codigo professor:" + getCodprof() +
                "\n CPF:" + getCpf() + "\n Quantidade de cursos:" + getQtdcursos() + 
                "\n Idade:" + getIdade();
        
    }

    
}
