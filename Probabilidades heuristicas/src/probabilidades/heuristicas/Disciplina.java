/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probabilidades.heuristicas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aline
 */
public class Disciplina {

    public String disciplin;
    public int cargahorariadisciplina;

    public Disciplina(String _disciplin, int _cargahorariadisciplina){
        this.cargahorariadisciplina = _cargahorariadisciplina;
        this.disciplin = _disciplin;
    }

    Disciplina(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * @return the disciplin
     */
    public String getDisciplin() {
        return disciplin;
    }

    /**
     * @param disciplin the disciplin to set
     */
    public void setDisciplin(String disciplin) {
        this.disciplin = disciplin;
    }

    /**
     * @return the cargahorariadisciplina
     */
    public int getCargahorariadisciplina() {
        return cargahorariadisciplina;
    }

    /**
     * @param cargahorariadisciplina the cargahorariadisciplina to set
     */
    public void setCargahorariadisciplina(int cargahorariadisciplina) {
        this.cargahorariadisciplina = cargahorariadisciplina;
    }
    
    public String MostrarDisciplina() {
        // será feita um pedido para inserir dados de discinplina e sua cargahoraria
        setDisciplin(JOptionPane.showInputDialog("Digite a Disciplina desejada deste curso:" + getDisciplin()));
        setCargahorariadisciplina(Integer.parseInt(JOptionPane.showInputDialog("Carga Horaria:" + getCargahorariadisciplina())));
        return null;
        
    }
    //ira imprimir todos os dados contidos na lista
    public String Imprimir(){
        return "Disciplina:" + getDisciplin()+ "\n Carga horaria:" +getCargahorariadisciplina();
        
    }
    

}