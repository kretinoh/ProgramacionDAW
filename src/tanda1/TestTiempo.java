package tanda1;

import java.util.Scanner;

public class TestTiempo {

  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  System.out.println("Vamos a crear el Tiempo1\nIntroduce las horas,minutos y segundos: ");
  int horas = s.nextInt();
  int minutos = s.nextInt();
  int segundos = s.nextInt();
  
  Tiempo t1 = new Tiempo(horas,minutos,segundos);
  Tiempo t2 = new Tiempo(5,20,15);
  
  System.out.println("Tiempo 1 > " + t1.toString());
  System.out.println("Tiempo 2 > " + t2 + "\n");
  
//  Sumarle otro objeto
  Tiempo suma = t1.sumarTiempo(t2);
  System.out.println(t1 + " + " + t2 + " = " + suma);
  
//  Restarle un tiempo
  Tiempo resta = t1.restarTiempo(t2);
  System.out.println(t1 + " - " + t2 + " = " + resta);
  
//  Sumar segundos
  System.out.print(t1 + " + 23 segundos =");
  t1.sumarSegundos(23);
  System.out.println(t1);
  
//  Sumar minutos
  System.out.print(t1 + " + 5 minutos  = ");
  t1.sumarMinutos(5);
  System.out.println(t1);
  
//  Sumar horas
  System.out.println(t1 + " 5 horas = ");
  t1.sumarHoras(5);
  System.out.println(t1);
  
//  Restar segundos
  System.out.print(t1 +" - 23 segundos =");
  t1.restarSegundos(23);
  System.out.println(t1);
  
  
//  Restar minutos
  System.out.print(t1 + " - 5 minutos = ");
  t1.restarMinutos(5);
  System.out.println(t1);
  
//  Restar horas
  System.out.print(t1 + " - 2 horas = ");
  t1.restarHoras(2);
  System.out.println(t1);
  }
}
