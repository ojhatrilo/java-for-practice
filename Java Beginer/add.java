class add{
	public static void main(String[] args){
	String name = "Deppika";
	int age = 21;
	String c = name+age;
	
	System.out.println(c);
	
}
}


//To check JDK installed
//Command 'java -version' in cmd(command prompt)

//To compile java programe
// Command 'javac <file name>' is used to compile java in cmd(command prompt)

//To run java programe java with filename
//Command 'java <file name>' is used to compile java in cmd(command prompt)


//Why do we add class name at the first 
//file name and the class name should be same while compiling
//If it is not same it will show the error

//1.Public
//It is an Access modifier, which specifies from where and who can access the method. 
//Making the main() method public makes it globally available. 
//It is made public so that JVM can invoke it from outside the class as it is not present in the current class.

//2.Static
//It is a keyword that is when associated with a method, making it a class-related method. 
//The main() method is static so that JVM can invoke it without instantiating the class. 
//This also saves the unnecessary wastage of memory
// which would have been used by the object declared only for calling the main() method by the JVM.

//3.Void
//It is a keyword and is used to specify that a method doesn’t return anything.
//As the main() method doesn’t return anything, its return type is void. 

//4.Main
//It is the name of the Java main method. 
//It is the identifier that the JVM looks for as the starting point of the java program. 
//It’s not a keyword.

//String args()
//It stores Java command-line arguments and is an array of type java.lang.String class

