//Evan White

import java.util.Scanner;
public class DebugStatements {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("\nInput a grade: ");
		double grade = kb.nextDouble();   kb.nextLine();
		char letterGrade = 'F';
		
		//version 1
		if(grade >= 89.5)
		{
			letterGrade = 'A';
		}
		if(grade >= 79.5 && grade < 89.5)  
		{
			letterGrade = 'B';
		}
		if(grade >= 69.5 && grade < 79.5)
			letterGrade = 'C';

		System.out.println("Version 1 ==> Grade : " + grade + " ===>> " + letterGrade);
		
		kb.nextLine();   //pause
		
		//version 2   
		
		if(grade >= 89.5)                  letterGrade = 'A';
		if(grade >= 79.5 && grade < 89.5)  letterGrade = 'B';
		if(grade >= 69.5 && grade < 79.5)  letterGrade = 'C';

		System.out.println("version 2 ==> Grade : " + grade + " ===>> " + letterGrade);

		kb.nextLine();   //pause
		
		//version 3   
		
		if(grade >= 89.5)  
			letterGrade = 'A';
			
		else if(grade >= 79.5)
			letterGrade = 'B';
		
		else if(grade >= 69.5)  
			letterGrade = 'C';
		
		else	
			letterGrade = 'F';

		System.out.println("version 3 ==> Grade : " + grade + " ===>> " + letterGrade);
		
		kb.close();
	}

}

/*
Input a grade: 95
Version 1 ==> Grade : 95.0 ===>> A

version 2 ==> Grade : 95.0 ===>> A

version 3 ==> Grade : 95.0 ===>> A

*/
