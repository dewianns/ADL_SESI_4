package com.adl.boothcamp;

import java.util.Scanner;

public class Ujian4 {
	
	public static void main(String[] args) {
		Ujian4 tgs = new Ujian4();
		tgs.nomor1();
		
	}

	
Scanner scan = new Scanner(System.in);
	
	public void nomor1() {
		char[][] arr = new char[15][15];
		for(int i = 0 ; i < 15 ; i++) {
			for(int j = 0 ; j < 15 ; j++) {
				if(i == 13 && j == 14) {
					arr[i][j] = ' ';
				}else if(i == 0 || i == 14 || j == 0 || j == 14) {
					arr[i][j] = '*';
				}else {
					arr[i][j] = ' ';
				}
			}
		}
		
		char simbol = '@';
		int kolom = 1;
		int baris = 1;
		arr[kolom][baris] = simbol;
		
		char input;
		do {
			for(int i = 0 ; i < 15 ; i++) {
				for(int j = 0 ; j < 15 ; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			System.out.print("Masukkan arah (a ke kiri, d ke kanan"
					+ ", w keatas, s kebawah)? ");
			input = scan.next().charAt(0);
			
			if(input == 'a') {
				if(arr[kolom][baris-1] == '*') {
					continue;
				}else {
					arr[kolom][baris] = ' ';
					baris--;
					arr[kolom][baris] = '@';
				}
			}
			else if(input == 's') {
				if(arr[kolom+1][baris] == '*') {
					continue;
				}else {
					arr[kolom][baris] = ' ';
					kolom++;
					arr[kolom][baris] = '@';
				}
			}
			else if(input == 'd') {
				if(arr[kolom][baris+1] == '*') {
					continue;
				}else {
					arr[kolom][baris] = ' ';
					baris++;
					arr[kolom][baris] = '@';
				}
			}
			else if(input == 'w') {
				if(arr[kolom-1][baris] == '*') {
					continue;
				}else {
					arr[kolom][baris] = ' ';
					kolom--;
					arr[kolom][baris] = '@';
				}
			}
		}while(arr[13][14] != '@');
		
		for(int i = 0 ; i < 15 ; i++) {
			for(int j = 0 ; j < 15 ; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("Anda menang");
	}
}

