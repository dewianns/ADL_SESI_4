package com.adl.boothcamp;

import java.util.Scanner;

public class Github {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] myarray; //deklarasi variable hanya size array nya saja tanpa isi
		//myarray = new int[10]; //deklarasi dengan isi dari array
		Github gth = new Github();
		gth.insertData();
		//int myarray1[] = {3,4,2,5,1,6,7,8,9};
		//myarray[0] = 1;
		//myarray[4] = 1;
		//System.out.println("\n\nprint array secara manual");
		//for (int i = 0; i < myarray.length; i++) {
		//	System.out.println(myarray[i]+" ");
		//}
		
		//System.out.println();
		//for (int angka : myarray1) {
		//	System.out.println(angka+" ");
		//}
		
		//System.out.println("========== Address Sebelum Reference ==========");
		//System.out.println(myarray);
		//System.out.println(myarray1);
		//myarray = myarray1;
		//System.out.println("========== Address Setelah Reference ==========");
		//System.out.println(myarray);
		//System.out.println(myarray1);
	}
	public static void latihan1() {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for (int i = 0; i < input; i++) {
			for(int j = 0; j < input; j++) {
				if(i == 0 || i == input-1 || j==0 | j == input-1) {
					System.out.print("*");
				}else if (j==(input/2)&& i==(input/2)){
					System.out.print("x");
				}else {
					System.out.print(" ");
				}
			}
				System.out.println();
		}
	}

	public static void latihan2() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Masukkan jumlah barang = ");
		int jumlah = scan.nextInt();
		String [] arr = new String[jumlah];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Masukkan barang index ke "+i+" = ");
			arr[i] = scan.next();
		}
		
		for (String namaBarang : arr) {
			System.out.println(namaBarang);
		}
	}

	//public static void latihan3() {
		//Scanner scan = new Scanner(System.in);
		
		//System.out.println("Jumlah data : ");
		//int data =  scan.nextInt();
		//Int [] arr = new String[data];
		
	//}

	public void insertData() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Masukkan banyak data : ");
		
		int jmlData = scan.nextInt();
		 ModelData[] data = new ModelData[jmlData];
		 
		 for (int i = 0; i < jmlData; i++) {
			 data[i] = new ModelData();
			 System.out.println("Masukkan nama anda : ");
			 String nama = scan.next();
			 data[i].setNama(nama);
			 
			 System.out.println("Masukkan alamat anda : ");
			 String alamat = scan.next();
			 data[i].setAlamat(alamat);
		 }
		 
		 //cara for each
		 for (ModelData modelData : data) {
			 System.out.println("==============================");
			 System.out.println("Nama :" + modelData.getNama());
			 System.out.println("Alamat :" + modelData.getAlamat());
			 System.out.println("==============================");
		 }
		 
		 //cara for next
		 for (int i = 0; i < jmlData; i++) {
			 System.out.println("==============================");
			 System.out.println("Nama :" + data[i].getNama());
			 System.out.println("Alamat :" + data[i].getAlamat());
			 System.out.println("==============================");
		 }
	}
}
