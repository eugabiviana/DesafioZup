package com.desafiozup.loteria.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SorteioController {

	Scanner kb = new Scanner (System.in);
	Random sorteio = new Random();
	List<Integer> numerosSorteados = new ArrayList();	
	
    final int LIMITE=6;
    int[] vetor = new int [6];  
    int y=0; 
    int numeroSorteado=0; 
    
    for(y=0;y<LIMITE;y++)
    {
        numeroSorteado=sorteio.nextInt(60)+1;
        System.out.print(" "+numeroSorteado);        
        
    }
    
	}
}
