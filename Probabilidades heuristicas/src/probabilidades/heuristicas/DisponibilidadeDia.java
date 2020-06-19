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

public class DisponibilidadeDia {

    public int dia;
  
    public DisponibilidadeDia( int _dia ){
        this.dia = _dia;
    }
    
    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    // será introduzido na tela uma classe na qual deixara com q o professor selecione os dias de disponibilidade 
    //para trabalhar, o usuario pode escolher de acordo com as opçoes que apareceram na tela, sendo que a cada vez 
    //que um dia e optada ele desaparecera na proxima tela e ficara apenas os dias que ele ainda pode selecionar, 
    //o sistema terminar quando optado por n ter mais nenhuma disponibilida a mais.
    public void MostrarDia(){
        setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 2 - Terça \n 3 - Quarta \n 4 - Quinta \n 5 - Sexta \n 6 - NDA")));
        System.out.println("Disponibilidade:");
    switch(getDia()){
        case 1:
            System.out.println("Segunda-Feira");
            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 3 - Quarta \n 4 - Quinta \n 5 - Sexta \n 6 - NDA")));
            
            switch(getDia()){
                case 2:
                    System.out.println("Terça-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 4 - Quinta \n 5 - Sexta \n 6 - NDA")));                    
                    
                    switch(getDia()){
                        case 3:
                            System.out.println("Quarta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }                                 
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 4:
                            System.out.println("Quinta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 5:
                            System.out.println("Sexta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 3:
                    System.out.println("Quarta-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 4 - Quinta \n 5 - Sexta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 2:
                            System.out.println("Terça-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 4:
                            System.out.println("Quinta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 5:
                            System.out.println("Sexta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 4:
                    System.out.println("Quinta-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade?  \n 2 - Terça \n 3 - Quarta \n 5 - Sexta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 2:
                            System.out.println("Terça-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                             break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade?  \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                             break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 3:
                            System.out.println("Quarta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 5:
                            System.out.println("Sexta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade?  \n 2 - Terça \n 3 - Quarta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade?  \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    }
                    break;
                case 5:
                    System.out.println("Sexta-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade?  \n 2 - Terça \n 3 - Quarta \n 4 - Quinta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 2:
                            System.out.println("Terça-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade?  \n 3 - Quarta \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 3:
                            System.out.println("Quarta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta  \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 4:
                            System.out.println("Quinta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 3 - Quarta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção Inexistente");
            }
            break;
        case 2:
            System.out.println("Terça-Feira");
            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 3 - Quarta \n 4 - Quinta \n 5 - Sexta \n 6 - NDA")));
            
            switch(getDia()){
                case 1:
                    System.out.println("Segunda-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 4 - Quinta \n 5 - Sexta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 3:System.out.println("Quarta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 4:
                            System.out.println("Quinta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 5:
                            System.out.println("Sexta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 3:
                    System.out.println("Quarta-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 4 - Quinta \n 5 - Sexta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 1:
                            System.out.println("Segunda-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 4:
                            System.out.println("Quinta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 5:
                            System.out.println("Sexta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 4:
                    System.out.println("Quinta-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 3 - Quarta \n 5 - Sexta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 1:
                            System.out.println("Segunda-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 3:
                            System.out.println("Quarta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade?  \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 5:
                            System.out.println("Sexta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 3 - Quarta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 5:
                    System.out.println("Sexta-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 3 - Quarta \n 4 - Quinta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 1:
                            System.out.println("Segunda-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 3:
                            System.out.println("Quarta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 4:
                            System.out.println("Quinta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 3 - Quarta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção Inexistente");
            }
            break;
        case 3:
            System.out.println("Quarta-Feira");
            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 2 - Terça \n 4 - Quinta \n 5 - Sexta \n 6 - NDA")));
            
            switch(getDia()){
                case 1:
                    System.out.println("Segunda-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 4 - Quinta \n 5 - Sexta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 2:
                            System.out.println("Terça-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 4:
                            System.out.println("Quinta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 5:
                            System.out.println("Sexta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 4 - Quinta  \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 2:
                    System.out.println("Terça-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 4 - Quinta \n 5 - Sexta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 1:
                            System.out.println("Segunda-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 4:
                            System.out.println("Quinta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 5:
                            System.out.println("Sexta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 4:
                    System.out.println("Quinta-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 2 - Terça \n 5 - Sexta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 1:
                            System.out.println("Segunda-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 2:
                            System.out.println("Terça-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 5:
                            System.out.println("Sexta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 2 - Terça \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 5:
                    System.out.println("Sexta-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 2 - Terça \n 4 - Quinta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 1:
                            System.out.println("Segunda-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade?  \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 2:
                            System.out.println("Terça-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 4:
                            System.out.println("Quinta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 2 - Terça \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção Inexistente");
            }
            break;
        case 4:
            System.out.println("Quinta-Feira");
            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 2 - Terça \n 3 - Quarta \n 5 - Sexta \n 6 - NDA")));
            
            switch(getDia()){
                case 1:
                    System.out.println("Segunda-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 3 - Quarta \n 5 - Sexta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 2:
                            System.out.println("Terça-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 3:
                            System.out.println("Quarta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 5:
                            System.out.println("Sexta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 3 - Quarta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 2:
                    System.out.println("Terça-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 3 - Quarta \n 5 - Sexta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 1:
                            System.out.println("Segunda-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 3:
                            System.out.println("Quarta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 5:
                            System.out.println("Sexta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 3 - Quarta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 3:
                    System.out.println("quarta-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 2 - Terça \n 5 - Sexta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 1:
                            System.out.println("Segunda-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 2:
                            System.out.println("Terça-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 5 - Sexta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 5 - Sexta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 5:
                                            System.out.println("Sexta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Sexta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 5:
                            System.out.println("Sexta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 2 - Terça \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 5:
                    System.out.println("Sexta-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 2 - Terça \n 3 - Quarta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 1:
                            System.out.println("Segunda-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 3 - Quarta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 2:
                            System.out.println("Terça-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 3 - Quarta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 3:
                            System.out.println("Quarta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 2 - Terça \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção Inexistente");
            }
            break;
        case 5:
            System.out.println("Sexta-Feira");
            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 2 - Terça \n 3 - Quarta \n 4 - Quinta \n 6 - NDA")));
            
            switch(getDia()){
                case 1:
                    System.out.println("Segunda-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 3 - Quarta \n 4 - Quinta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 2:
                            System.out.println("Terça-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 3:
                            System.out.println("Quarta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 4: 
                            System.out.println("Quinta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 3 - Quarta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 2:
                    System.out.println("Terça-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 3 - Quarta \n 4 - Quinta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 1:
                            System.out.println("Segunda-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 3:
                            System.out.println("Quarta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 4:
                            System.out.println("Quinta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 3 - Quarta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 3:
                    System.out.println("Quarta-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 2 - Terça \n 4 - Quinta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 1:
                            System.out.println("Segunda-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 2:
                            System.out.println("Terça-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 4 - Quinta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 4 - Quinta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 4:
                                            System.out.println("Quinta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 4:
                                    System.out.println("Quinta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 4:
                            System.out.println("Quinta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 2 - Terça \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 4:
                    System.out.println("Quinta-Feira");
                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 2 - Terça \n 3 - Quarta \n 6 - NDA")));
                    
                    switch(getDia()){
                        case 1:
                            System.out.println("Segunda-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 3 - Quarta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 2:
                            System.out.println("Terça-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 3 - Quarta \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 3 - Quarta \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 3:
                                            System.out.println("Quarta-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Quarta-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("Opção Inexistente");
                            }
                            break;
                        case 3:
                            System.out.println("Quarta-Feira");
                            setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 2 - Terça \n 6 - NDA")));
                            
                            switch(getDia()){
                                case 1:
                                    System.out.println("Segunda-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 2 - Terça \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 2:
                                            System.out.println("Terça-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Terça-Feira");
                                    setDia(Integer.parseInt(JOptionPane.showInputDialog("Quais os dias que possui disponibilidade? \n 1 - Segunda \n 6 - NDA")));
                                    
                                    switch(getDia()){
                                        case 1:
                                            System.out.println("Segunda-Feira");
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opção Inexistente");
                                    }
                                    break;
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Opção Inexistente");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção Inexistente");
            }
            break;
        case 6:
            break;
        default:
            System.out.println("Opção Inexistente");
    }
     
    }
    
    public String Imprimir(){
        return  "\n Disponibilidade : " + getDia();
        
    }
}        

