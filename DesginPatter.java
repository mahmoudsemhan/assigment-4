
package desgin.patter;

import java.util.Scanner;

/**
 *
 * @author ma7moud
 */
public class DesginPatter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.println("enter desierd member");
        String str=input.nextLine();
        factor f = new factor ();
        staff s=f.getstaff(str);
         s.getsalary();
         s.serdata("mahmoud", 8, 29, 8000);
           s.getyearsOFwork();
           s.printDATA();
        
    }
    
}
