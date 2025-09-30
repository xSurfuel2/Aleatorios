package Aleatorios;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        int[] array = new int[50]; //Cantidad de numeros que muestra
        Random rand = new Random();

        // Generar números aleatorios y guardarlos en el array
        for (int i = 0; i < array.length; i++)
        {
            array[i] = rand.nextInt(101); //Rango de numeros (de 0 a 100)
            System.out.print(array[i] + " ");
        }
    }
}