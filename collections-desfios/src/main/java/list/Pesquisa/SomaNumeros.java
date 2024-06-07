package main.java.list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero){

        numeros.add(numero);
    }

    public String calcularSoma(){
        int soma = 0;
        if(!numeros.isEmpty()){
            for (Integer i : numeros){
                soma += i;
            }
        }else{
            System.out.println("A lista de numeros está vazia!");
        }
        return "A soma dos numeros é: " + soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeros.isEmpty()){    
            for (Integer i : numeros){
                if(i >= maiorNumero){
                    maiorNumero = i;
                }
            }
        }else {
            System.out.println("Lista vazia!");
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){    
            for (Integer i : numeros){
                if(i <= menorNumero){
                    menorNumero = i;
                }
            }
        }else {
            System.out.println("Lista vazia!");
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else{
            System.out.println("a lista está vazia");
        }
    }
}
    



