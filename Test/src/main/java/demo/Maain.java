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
		   cat.age = 14;
		   System.out.println(cat.name);
		   
		 //use var kw
		   var cattie = new Cat();
		   cattie.name = "Tommy";
		   System.out.println(cattie.age);
		   
		   // object can store anything
		   // Object o = new Cat();
		   //System.out.println(o.toString());
		   
		   // call method
		   cat.sayMeow();
		   cattie.sayMeow();
		   
	   }

}
