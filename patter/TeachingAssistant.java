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
public abstract class TeachingAssistant implements staff{
     String name;
    int id;
    int age;
    double salary;

    public double getsalary()
    {
       return salary;
    }

    @Override
    public void getyearsOFwork() 
    {
        System.out.println("years of work is 23");
    }

    @Override
    public void printDATA()
    {

        System.out.println(" TeachingAssistant name is  "     + name);
        System.out.println(" TeachingAssistant id is  "  +    id);
        System.out.println(" TeachingAssistant  age  is "  +     age);
        System.out.println(" TeachingAssistant salary is  "  + salary);

    }


    @Override
    public void serdata(String name, int id, int age, double salary)
    {
        this.name=name;
        this.id=id;
        this.age=age;
        this.salary=salary;
    }

}
    

