package com.gaurav.java.serilization;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FscmVoTest {
public static void main(String[] args) throws Exception {
	FileInputStream fileInputStream = new FileInputStream("D:\\gaurav_workspace\\core_java\\fscm.ser");
	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	FscmVo fscmVo2 = (FscmVo) objectInputStream.readObject();
	
	System.out.println(fscmVo2);
}
}
