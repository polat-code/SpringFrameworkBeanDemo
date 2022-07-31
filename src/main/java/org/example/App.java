package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        /*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Nurse doctor = context.getBean(Nurse.class);
        //Staff doctor = (Nurse) context.getBean("nurse");
        doctor.assist();
        // System.out.println(doctor.getQualification());
         */

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MSBB");
        System.out.println(doctor);

        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);




    }
}
