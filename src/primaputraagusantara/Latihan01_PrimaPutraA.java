package primaputraagusantara;

import java.util.Scanner;

public class Latihan01_PrimaPutraA 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int looping;
		
		System.out.print("Masukkan Jumlah Pengulangan");
		looping = input.nextInt();
		
		for(int i = 1; i <= looping; i++)
		{
			System.out.println(i + ". Universitas MDP");
		}
		
		for(int j = 50; j >= 1; j--)
		{
			System.out.println(j + ". Universitas MDP");
		}
		
		
		
	}
}
