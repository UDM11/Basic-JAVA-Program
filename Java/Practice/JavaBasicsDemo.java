public class JavaBasicsDemo{
	public static void main(String[] args){
	
	//Data types and variables
	int age = 25;
	double salary = 55000.50;
	System.out.println("Age: " + age);
	System.out.println("Salary: " + salary);
	char grade = 'A';
	Boolean isEmployed = true;
	System.out.println("Grade: " + grade);
	System.out.println("Is Employed: " + isEmployed);
	String name = "Alice";

	//operators
	int a = 10;
	int b = 5;
	int sum = a+b;
	int diff = a-b;
	int pro = a*b;
	int quo = a/b;
	int remainder = a%b;
	Boolean isEqual = (a==b);
	Boolean logical = (a>b) && (b>0);
	System.out.println("Sum: " + sum);
	System.out.println("Difference: " + diff);
	System.out.println("Product: " + pro);
	System.out.println("Quotient: " + quo);
	System.out.println("Remainder: " + remainder);
	System.out.println("Is Equal: " + isEqual);
	System.out.println("Logical AND: " + logical);

	//arrays
	int[] numbers = {10, 20, 30, 40, 50};
	System.out.println("Array elements: ");
	for(int i = 0; i<numbers.length; i++){
		System.out.println(numbers[i]);
	}

	//control statements
	System.out.println("\nControl sructures: ");
	if(age>=18){
		System.out.println(name + " is an adult.");
	}else{
		System.out.println(name + " is not an adult.");
	}

	//switch
	switch(grade){
		case 'A' -> System.out.println("Excellent!");
		case 'B' -> System.out.println("Good");
		default -> System.out.println("Needs improvements");
	}

	//for loop
	System.out.println("for loop from 1 to 5:");
	for(int i = 1; i<=5; i++){
		System.out.println(i + "");
	}

	//while loop
	System.out.println("\nWhile loop example:");
	int counter = 0;
	while(counter<3){
		System.out.println("Counter: " + counter);
		counter++;
	}

	//do-while loop
	System.out.println("Do-while loop example: ");
	int j = 0;
	do{
		System.out.println("j: " +j);
		j++;
	}while(j<3);
	}
}