package primaputraagusantara;

import java.util.Scanner;

public class Latihan02_PrimaPutraA 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String nama, npm;
		int banyak;
		
		System.out.println("Banyak Mahasiswa");
		banyak = input.nextInt();
		
		for(int i = 1; i<= banyak; i++)
		{
			System.out.println("Data Mahasiswa ke- " + i);
			System.out.print("Masukkan Nama : ");
			nama = input.next();
			
			System.out.print("Masukkan NPM : ");
			npm = input.next();
		}
		
	}
}
