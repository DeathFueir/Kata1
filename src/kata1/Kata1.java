
package kata1;

import java.util.Date;


public class Kata1 {
    
    
    public static void main(String[] args) {
        Person a = new Person("Sergio",new Date(96/05/29));
        System.out.println("Este individuo llamado "+a.getName()+" y tiene "+a.getAge()+" años.");
    }
}
