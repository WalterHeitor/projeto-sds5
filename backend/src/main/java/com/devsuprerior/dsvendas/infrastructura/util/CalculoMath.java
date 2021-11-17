package com.devsuprerior.dsvendas.infrastructura.util;


import org.junit.jupiter.api.Test;

public class CalculoMath {
    public void calcular(Matematica matematica){
        System.out.println(matematica.operar(10, 10));
    }

    @Test
    public void ponteiroFuncional(){
        Runnable r1 = () -> System.out.println("rodando uma tread");
        Runnable r2 = () -> {
            for (int i = 0; i < 5; i++){
                System.out.println("o numero e: "+i);
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r2);
        t2.start();
        new Thread(() -> System.out.println("outra thread")).start();
    }

    @Test
    public void calculo(){
        calcular(((valor1, valor2) -> valor1 + valor2));
        calcular(((valor1, valor2) -> valor1 - valor2));
        calcular(((valor1, valor2) -> valor1 * valor2));
    }
    @Test
    public void calculo2(){
        calcular((valor1, valor2) -> {
            System.out.println("executando o corpo do lambida - adição");
            return valor1 + valor2;
        });

        calcular((valor1, valor2) -> {
            System.out.println("executando o corpo do lambida - subitração");
            return valor1 - valor2;
        });
    }
}
