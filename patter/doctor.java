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
public class doctor implements staff {
     String name;
    int id;
    int age;
    double salary;

    @Override
    public double getsalary()
    {
        return salary;
    }

    @Override
    public void getyearsOFwork() 
    {
        System.out.println("years of work is 15 ");
    }

    @Override
    public void serdata(String n, int id, int age, double sala) 
    {
       this.name=n;
        this.id=id;
        this.age=age;
        this.salary=sala;

    }

    @Override
    public void printDATA()
    {
        System.out.println("doctor_name is "  + name);
        System.out.println("doctor_id is "  + id);
        System.out.println("doctor_age is "  + age);
        System.out.println("doctor_salary is "  + salary);
    }


}
    

