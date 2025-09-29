package org.example;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        int[] array = new int[50];
        Random rand = new Random();

        // Generar números aleatorios y guardarlos en el array
        for (int i = 0; i < array.length; i++)
        {
            array[i] = rand.nextInt(100);
            System.out.println(array[i]);

        }



    }
}