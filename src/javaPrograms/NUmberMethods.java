package javaPrograms;

public class NUmberMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Converting int to String
		
				int i = 10;
				
				System.out.println(i+100);   // 110
				
				// I want ==> concatination  ==> 10100
				// Convert the interger variable into a String valiable
				
				//toString() is a static method
				// Classname.methodname  ==> Integer.toString()
				
				String s=Integer.toString(i);
				
				System.out.println(s+100);   // 10100


			//	valueOf() method ==>presnt in both  String and Integer class
				
				//convert String to int
				String s1="100";
				
				int i1 =Integer.valueOf(s1);
				
				
				System.out.println(i1+100);  //200
				
				
				// convert an int to String
				
				int x=10;
				
			String s2	=String.valueOf(x);
				
			System.out.println(s2+100);  //10100	
			


			  //CompareTo() 
			// used to compare 2 numbers , and output is going to be int value
			// 1 ==> if number1 > number2
			//0 --> if number1 = number2
			// -1 ==> if number1<number2

			String s3="selenium";
			
			s3.compareTo("batch");
				
			//int i=10;
			
			Integer ix=10;
			
			System.out.println(ix.compareTo(100));  // -1
				
			System.out.println(ix.compareTo(5))	;  //1
			
			System.out.println(ix.compareTo(10));  //0



		      //  equals()
				
				// but will compare only if 2 numbers are equal or not
				// output is going true or false
				
			
				
				Integer x1=10;
				Integer y1=20;
				
				boolean result=x1.equals(y1);  
				
				System.out.println(result);
				
				System.out.println(x1.equals(10));   // true	
		
		
	//Method3: 	abs()   // abs() method is a static method and is avialble in Math class

				
	//We will call this methods ===>	//Classname.methodname()		
				
				
	System.out.println(Math.abs(-10));  // output is going to be a +ve integer			
				
	double d1=Math.abs(-10.7567);	// output is going to be a +ve decimal value		
				
		System.out.println(d1);
		
	// Method4	: round()
		
	// it will round of the decimal value to its nearest integer	
		
		System.out.println(Math.round(10.234));  // 10
				
		
		long x4=Math.round(10.765);  //11	
		
		System.out.println(x4);
		
		
		// min(), max(), random();
		
		Math.min(10, 20); //return the small of 2 values
		
		System.out.println(Math.max(30, 40)); //return the bigger number of 2 values
		
		System.out.println(Math.random());
		
		
		
		
		
		
		
	
				
				
				
				
				
				
				
				


	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
