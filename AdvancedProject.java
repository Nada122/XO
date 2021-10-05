/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package advanced.project;

/**
 *
 * @author Nada
 */
public class AdvancedProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Game frame= new Game();
       frame.setSize(800,700);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(Game.EXIT_ON_CLOSE);
    }
    
}
