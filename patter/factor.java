/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desgin.patter;

/**
 *
 * @author ma7moud
 */
public class factor { public staff getstaff(String desired_member)
    {
      if(desired_member==null)
             return null;
          else if (desired_member.equalsIgnoreCase("DOCTOR"))
             return (staff) new doctor();

          else if (desired_member.equalsIgnoreCase("TEACHINGASSISTANT"))
              return (staff) new TeachingAssistant() {};
      return null;

    }
    
    
}
