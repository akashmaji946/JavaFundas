package demo;

public class Maain {

	   public static void main(String[] args) {
		   // identifier rules need to be followed
		   int age  = 10;
		   
		   String name = "Katrina";
		   
		   // keywords: built into the language by itself
		   System.out.println(age + " " + name);
		   System.out.println("Hello World");
		   
		   //instantiation
		   Cat cat = new Cat();
		   System.out.println(cat.name);
		   
		 //use var kw
		   var cattie = new Cat();
		   System.out.println(cattie.age);
		   
		   Object o = new Cat();
		   System.out.println(o.toString());
		   
	   }

}
