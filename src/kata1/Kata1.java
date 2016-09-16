/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Kata1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person a = new Person("Sergio",new Date(96/05/29));
        System.out.println("Este individuo llamado "+a.getName()+" y tiene "+a.getAge()+" años.");
    }
}
