package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import parser2.Parser;
import parser2.SimpleNode;

public class MainTest {
	public static void main(String args [])
	  {
	    FileInputStream fileStream=null;
	    try {
	    File file= new File("src/test/whileTest.txt");
	    fileStream= new FileInputStream(file);
	    } catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	   // Parser parser = new Parser(System.in);
		 try
	    {
		Parser parser= new Parser(fileStream);
	    SimpleNode n=parser.Start();
	    n.dump("");
	    parser.qtTable.printQTTable();
	    System.out.println("Thank you");
	    }
	    catch (Exception e)
	    {
	      System.out.println("Oops.");
	      System.out.println(e.getMessage());
	    }
	  }
	
	

/*	public static void main(String[] args) {
		
		
	    System.out.println("Reading from standard input...");
	    System.out.print("Enter an expression like \"1+(2+3)*var;\" :");
	    Parser parser = new Parser(System.in);
	    try
	    {
	      SimpleNode n = parser.Start();
	      n.dump("");
	      parser.qtTable.printQTTable();
	      System.out.println("Thank you.");
	    }
	    catch (Exception e)
	    {
	      System.out.println("Oops.");
	      System.out.println(e.getMessage());
	    }
	  

	}*/

}
