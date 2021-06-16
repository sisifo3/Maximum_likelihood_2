package theone;
import java.io.*;  
import java.util.Scanner;  

//Desktop/Ingoodwetrust/libros/ADHD_dataset_2/var_st_entropy_AP_RP_Control_ADHD_V2_0.csv

public class ReadCSVExample1 {
	public static void main(String[] args) throws Exception  
	{  
	//parsing a CSV file into Scanner class constructor  
	Scanner sc = new Scanner(new File("/home/sisifo/Desktop/Ingoodwetrust/libros/ADHD_dataset_2/var_st_entropy_AP_RP_Control_ADHD_V2_0.csv"));  
	sc.useDelimiter(",");   //sets the delimiter pattern  
	while (sc.hasNext())  //returns a boolean value  
	{  
	System.out.print(sc.next());  //find and returns the next complete token from this scanner  
	}   
	sc.close();  //closes the scanner  
	}  
}
