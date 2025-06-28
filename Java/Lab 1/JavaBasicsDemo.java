class JavaBasicsDemo{
	public static void main(String[] args){
		int age = 25;
		double salary = 55000.50;
		char grade = 'A';
		boolean isEmployed = true;
		String name = "Alice";

		int a = 10;
		int b = 5;
		int sum = a+b;
		int diff = a-b;
		int pro = a*b;
		int qui = a/b;
		int rem = a%b;
		boolean isEqual = (a==b);
		boolean logical = (a>b)&&(b>0);
		
		int[] numbers = {10, 20, 30, 40,50};
		
		System.out.println("Array Elements");
		for(int i=0; i<numbers.length; i++){
			System.out.println(numbers[i]);
		}

		System.out.println("\nControl Structures");
		
		if(age>=18){
			System.out.println(name + "is an adult.");
		}else{
			System.out.println(name + "is not an adult.");
		}

		switch(grade){
			case 'A':
				System.out.println("Excellent");
			case 'B':
				System.out.println("Good");
			default:
				System.out.println("Needs improvements");
		}

		System.out.println("For loop from 1 to 5: ");
		for(int i = 1; i<=5; i++){
			System.out.print(i + "\n");
		}

		System.out.println("\nWhile loop example: ");
		int counter = 0;
		while(counter<3){
			System.out.println("Counter: " + counter);
			counter++;
		}

		System.out.println("Do-while loop example: ");
		int j = 0;
		do{
			System.out.println("j: " +j);
			j++;
		}while(j<3);
	}
}
