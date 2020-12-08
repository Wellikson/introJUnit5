package com.mycompany.introjunit5;

import java.util.Objects;

/**
 *
 * @author wellikson
 */
public class MathUtil {
    
    public static int mdc(int a, int b){
        //PROPRIEDADE 7
        a = Math.abs(a);
        b = Math.abs(b);
        
        //PROPRIEDADE 6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        
        //PROPRIEDADE 1
        if(b > 0 && a % b == 0){
            return b;
        }
        
        //PROPRIEDADE 3
        if(b == 0){
            return Math.abs(a);
        }
           
        return mdc(a-b,b);
    }
    public static int mdc(int ...valores){
        Objects.requireNonNull(valores, "O parametro valores nao pode ser nulo para calcular o MDC");
        if(valores.length==0){
            throw new IllegalArgumentException("E preciso indicar ao menis um valor para calcular o MDC");
        }
        int a = valores[0];
        for (int b : valores) {
            a= mdc(a,b);
        }
        return a;
    }
   
}
