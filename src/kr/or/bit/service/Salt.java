package kr.or.bit.service;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Salt {
	
<<<<<<< HEAD
	
=======
	/*
>>>>>>> f6fa83a0eea4f294321c96fd8368998a4f885e8f
	public void addSalt(String id) {
		
		makeFile(id);
		
	}
<<<<<<< HEAD
	public String readSalt(String id) {
		
		return readFile(id);
		
	}
	
=======
	*/
	public String readSalt() {
		
		return readFile();
		
	}
	/**
	 * 아이디를 입력받고 키파일생성하는 함수
	 * @param id
	 */
	/*
>>>>>>> f6fa83a0eea4f294321c96fd8368998a4f885e8f
	private void makeFile(String id) {
		try {
			FileWriter fr = new FileWriter("C:\\Users\\user\\key\\"+id+".key.txt");
			double d = Math.random();
<<<<<<< HEAD
			String comp = "오늘도 화이팅"+d+"^^!";
=======
			String comp = "오늘도 즐거운 코딩"+d+"^^!";
>>>>>>> f6fa83a0eea4f294321c96fd8368998a4f885e8f
			fr.write(comp);
			fr.close();
			System.out.println("파일생성성공:"+id+".key.txt");
		} catch (Exception e) {
			System.out.println("파일생성실패:{id}.key.txt");
			e.printStackTrace();
		}
		
	}
<<<<<<< HEAD
	
	private  String readFile(String id) {
		String data = "";
		try {
			File f = new File("C:\\Users\\user\\key\\"+id+".key.txt");
=======
	*/
	
	
	/**
	 * 
	 * @param id 유저아이디
	 * @return
	 */
	private  String readFile() {
		String data = "";
		try {
			File f = new File("C:\\Users\\user\\key\\key.txt");
>>>>>>> f6fa83a0eea4f294321c96fd8368998a4f885e8f
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				data = sc.nextLine();
				System.out.println(data);
				return data;
			}
			
		} catch (Exception e) {
			System.out.println("파일읽기 실패");
			e.printStackTrace();
		}
		System.out.println("data:"+data);
		return data;
		
	}
	
}

	