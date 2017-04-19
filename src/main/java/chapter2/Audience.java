package chapter2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by dzbe1116 on 4/17/2017.
 */

@Aspect
public class Audience {
//    @Pointcut(
//            "execution(* chapter2.Performer.perform(..))")
//    public void performance() {
//    }

    @Before("execution(* chapter2.Performer.perform())")
    public void takeSeats() { // Перед выступлением
        System.out.println("The audience is taking their seats.");
    }
    @Before("execution(* chapter2.Performer.perform())") // Перед выступлением
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }
    @AfterReturning("execution(* chapter2.Performer.perform())") // После успешного выступления
    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }
    @AfterThrowing("execution(* chapter2.Performer.perform())")
    public void demandRefund() { // После неудачного выступления
        System.out.println("Boo! We want our money back!");
    }
}
