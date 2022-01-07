//   For better understanding refer to Kunal Kushwaha notes
// notes link
// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/tree/main/lectures

import java.util.*;


// It is a java class
// variables declared using string are its reference to the string objects
// refer to kunal notes for detailed explanation

// Strings are immutable(for security reasons)


// Why immutability?

//  for security reason 
//  for detailed description refer to kunal notes
class string{

    public static boolean palin(String str){
       int s=0;
       int e=str.length()-1;
    
        while(s<=e)
        {
            if(str.charAt(s)!=str.charAt(e))
return false;
s++;
e--;
        }
        return true;
    }
    public static void main(String[] args)
    {

        //------------------/ How reference works in string class objects
        // String a = "Kunal";
        // System.out.println(a); //Here a points to the "Kunal" string
        // a="Kushwaha"; //Now a is pointing to the "Kushwaha" string
        // // Hence strings are immutable 
        // // but we can set the pointer to the other location
        // System.out.println(a);

// ------------->>> == checks whether both are pointing to the same object

// String a = "Kunal";
// String b = "Kunal";
// System.out.println(a==b);//-----True

// Here one object has been created "Kunal" and both a and b are pointing to Kunal string 

// By default java creates a single object of "Kunal" and both a and b are pointing to "Kunal" string

// But we can force java to create two different "Kunal" objects
// String a = new String("Kunal");
// String b = new String("Kunal");
// System.out.println(a==b); //----False




// ------------>If you only wants to compare the String values use .equals method
// == is a comparitor and .equals is a method 

// placeholders in java Strings
// using printf(known as pretty printing)   







// ------------->   String concatination
// note== when a number is added with a string then the number gets converted into string and gets concatinated with the string
// "" represents string 
// '' represents character
// when we add character with number then it gives ASCII value
// System.out.println("a" + "b");
// System.out.println("a" + 'b');
// System.out.println('a' + 'b');
// System.out.println("a" + 1.23);
// System.out.println('a' + 3);
// System.out.println((char)('a' + 3));


// System.out.println("a" + 3); 
// This will be considered as "a" + "3"
//  { integer(primitive) will get converted to Integer(class) and will call its toString method}

// System.out.println("a" + new ArrayList<>()); //to use ArrayList you need to use java.util package
// now arraylist will give us the string array which is empty right now
//  + can be used to with any of the primitive datatypes
//  and with one of the objects as strings

// the statement given below will give an error as we can not use two objects
// System.out.println(new Integer(56) + new ArrayList<>()); //to use ArrayList you need to use java.util package
// System.out.println(new Integer(56) + "" + new ArrayList<>()); //to use ArrayList you need to use java.util package

// + operator is overloaded by giving us additional functionality with string


// String performance

// String builder
// difference between string and string builder is that
// it is mutable 
// when we are making changes in any string builder variable then it is not pointing to the new string object but it is making changes in the same object and by doing so it is saving the space in heap

// Stringbuilder got its own methods to perform some operations
// StringBuilder str = new StringBuilder();
// str.append("abc") ;
// System.out.println(str);
// str.reverse();
// System.out.println(str);
// There are many more methods present in StringBuilder class


// program for a palindrome String
// String s = "ab1cba";
// System.out.println(palin(s));


 }
}