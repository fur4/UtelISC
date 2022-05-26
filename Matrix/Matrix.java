
/**
 * Write a description of class Matrix here.
 *
 * @author Fur4
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Matrix
{
 public String respuesta="Indefinida"; 
 
 public void pausa (long tiempo){
    for (long i=0; i<tiempo*1000000; i++){
    }
}
    //end pausa
public void escriM(String cadena){
    int longitud=cadena.length();
    for (int a=0; a<longitud; a++){
        System.out.print(cadena.charAt(a));
        pausa(500);
    }
        System.out.println();
}
//end escriM
public void dialogo(){
    boolean bandera=false;
    escriM("Wake up, Neo...");
    System.out.print ("\f");
    escriM("The Matrix has you...");
    leeTeclado();
    System.out.print ("\f");
    escriM("Follow the white rabbit.");
    leeTeclado();
    System.out.print ("\f");
    escriM("Knock,Knock, Neo.");
    System.out.print ("\f");
    leeTeclado();
    escriM("Unfortunately no one can be told what the matrix is");
    escriM("You have to see it for yourself");
    System.out.print ("\f");
    escriM("This is your last chance, there is no turning back");
    System.out.print ("\f");
    escriM("You take the blue pill the story ends");
    escriM("You take the red pill you stay in wonderland");
    System.out.print ("\f");
    escriM("Type the color of the pill you will choose...");
    do{
    leeTeclado();
    switch (respuesta){
    case "BLUE":
        escriM("You wake up in your bed and believe whatever you want to believe");
        escriM("You should reconsider... try again");
        break;
    case "RED":
        escriM("I'll show you how deep the rabbit-hole goes");
        bandera=true;
        break;
        default:
            escriM("try again...");
                            //fin de switch
    }
}while(!bandera);//finm de dialogo
escriM("Remember...all I'm offering is the truth, nothing more.");
}
//end dialogo
public void leeTeclado(){
    Scanner lee= new Scanner (System.in);
    respuesta=lee.nextLine();
    respuesta=respuesta.replaceAll("\\s","");
    respuesta=respuesta.toUpperCase();
    
 
}
    //fin de la clase
}
