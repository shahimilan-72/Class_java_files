package Day2;

//This is class
public class IdentifierDemo {

    public static void main(String[] args) {
        //this is variable
        String anyDemo;

        //this is constant
        final double value_Of_Pi = 3.14;
        System.out.println(" Hi! Everyone");
        sayHello();
    }

    public static void sayHello() {
        System.out.println("This is Milan!");
    }

}


//this is singe line comment
/*
this is multi line comment
 */
//comments
//Identifier: the name given ot
//1.class
//2.variables
//3.methods
//4.constants

//rules: should follow if not gives error
//1. no digits and special symbol at first place while declaring variable( can use any other places)
//2. no whitespace,tabs
//3. no keyword as identifier ( no int, super...)
//4. can use underscore (_) and dollar sign($) any where

//convention: don't give error but follow for standard purpose.
//---beginning of any word in class should be capitalized ( ClassOne)
//---variable and method should be declared in camel case ( anyDemo )
//--package name is written in small letter. Multiple word in package name is separated by dot (.) milan.shahi

/*White space consists mostly of the space character that you produce by
hitting the space bar on your keyboard and that is commonly used to separate words in sentences.
*/
