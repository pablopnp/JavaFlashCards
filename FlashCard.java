package javaflashcards;

import java.util.Random;
import java.util.Scanner;

public class FlashCard {

	public static void main(String [] flashcard) {
		
		int start = 0;
		int dice = 0;
		
		Random r = new Random();
		dice = r.nextInt(50) + 1;
		
		String termDefinition[] = {"Indicates that the details of a class, a method, or an interface are given elsewhere in the code.", "Tests the truth of a condition that the programmer believes is true.", "Indicates that a value is either true or false.", "Jumps out of a loop or switch.", "Indicates that a value is an 8-bit whole number.", "Introduces one of several possible paths of execution in a switch statement.", "Introduces statements that are executed when something interrupts the flow of execution in a try clause.", "Indicates that a value is a character (a single letter, digit, punctuation symbol, and so on) stored in 16 bits of memory.", "Introduces a class — a blueprint for an object.", "You can’t use this word in a Java program. The word has no meaning but, because it’s a keyword, you can’t create a variable named const.", "Forces the abrupt end of the current loop iteration and begins another iteration.", "Introduces a path of execution to take when no case is a match in a switch statement.", "Causes the computer to repeat some statements over and over again (for instance, as long as the computer keeps getting unacceptable results).", "Indicates that a value is a 64-bit number with one or more digits after the decimal point.", "Introduces statements that are executed when the condition in an if statement isn’t true.", "Creates a newly defined type — a group of values that a variable can have.", "Creates a subclass — a class that reuses functionality from a previously defined class.", "Indicates that a variable’s value cannot be changed, that a class’s functionality cannot be extended, or that a method cannot be overridden.", "Introduces the last will and testament of the statements in a try clause.", "Indicates that a value is a 32-bit number with one or more digits after the decimal point.", "Gets the computer to repeat some statements over and over again (for instance, a certain number of times).", "You can’t use this word in a Java program. The word has no meaning. Because it’s a keyword, you can’t create a variable named goto.", "Tests to see whether a condition is true. If it’s true, the computer executes certain statements; otherwise, the computer executes other statements.", "Indicates that a class provides bodies for methods whose headers are declared in an interface.", "Enables the programmer to abbreviate the names of classes defined in a package.", "Tests to see whether a certain object comes from a certain class.", "Indicates that a value is a 32-bit whole number.", "Introduces an interface. An interface is like a class but, for the most part, an interface’s methods have no bodies.", "Indicates that a value is a 64-bit whole number.", "Enables the programmer to use code that was written in a language other than Java.", "Creates an object from an existing class.", "Puts the code into a package — a collection of logically related definitions.", "Indicates that a variable or method can be used only within a certain class.", "Indicates that a variable or method can be used in subclasses from another package.", "Indicates that a variable, class, or method can be used by any other Java code.", "Ends execution of a method and possibly returns a value to the calling code.", "Indicates that a value is a 16-bit whole number.", "Indicates that a variable or method belongs to a class, rather than to any object created from the class.", "Limits the computer’s ability to represent extra large or extra small numbers when the computer does intermediate calculations on float and double values.", "Refers to the superclass of the code in which the word super appears.", "Tells the computer to follow one of many possible paths of execution (one of many possible cases), depending on the value of an expression.", "Keeps two threads from interfering with one another.", "A self-reference — refers to the object in which the word this appears.", "Creates a new exception object and indicates that an exceptional situation (usually something unwanted) has occurred.", "Indicates that a method or constructor may pass the buck when an exception is thrown.", "Indicates that, if and when an object is serialized, a variable’s value doesn’t need to be stored.", "Introduces statements that are watched (during runtime) for things that can go wrong.", "Indicates that a method doesn’t return a value.", "Imposes strict rules on the use of a variable by more than one thread at a time.", "Repeats some statements over and over again (as long as a condition is still true)."};
		
		// Variable declarations;
		
		String varAbstract;
		String varAssert;
		String varBoolean;
		String varBreak;
		String varByte;
		String varCase;
		String varCatch;
		String varChar;
		String varClass;
		String varConst;
		String varContinue;
		String varDefault;
		String varDo;
		String varDouble;
		String varElse;
		String varEnum;
		String varExtends;
		String varFinal;
		String varFinally;
		String varFloat;
		String varFor;
		String varGoto;
		String varIf;
		String varImplements;
		String varImport;
		String varInstanceof;
		String varInt;
		String varInterface;
		String varLong;
		String varNative;
		String varNew;
		String varPackage;
		String varPrivate;
		String varProtected;
		String varPublic;
		String varReturn;
		String varShort;
		String varStatic;
		String varStrictfp;
		String varSuper;
		String varSwitch;
		String varSynchronized;
		String varThis;
		String varThrow;
		String varThrows;
		String varTransient;
		String varTry;
		String varVoid;
		String varVolatile;
		String varWhile;
		
		// Variable definitions;

		varAbstract = "Indicates that the details of a class, a method, or an interface are given elsewhere in the code.";
		varAssert = "Tests the truth of a condition that the programmer believes is true.";
		varBoolean = "Indicates that a value is either true or false.";
		varBreak = "Jumps out of a loop or switch.";
		varByte = "Indicates that a value is an 8-bit whole number.";
		varCase = "Introduces one of several possible paths of execution in a switch statement.";
		varCatch = "Introduces statements that are executed when something interrupts the flow of execution in a try clause.";
		varChar = "Indicates that a value is a character (a single letter, digit, punctuation symbol, and so on) stored in 16 bits of memory.";
		varClass = "Introduces a class — a blueprint for an object.";
		varConst = "You can’t use this word in a Java program. The word has no meaning but, because it’s a keyword, you can’t create a variable named const.";
		varContinue = "Forces the abrupt end of the current loop iteration and begins another iteration.";
		varDefault = "Introduces a path of execution to take when no case is a match in a switch statement.";
		varDo = "Causes the computer to repeat some statements over and over again (for instance, as long as the computer keeps getting unacceptable results).";
		varDouble = "Indicates that a value is a 64-bit number with one or more digits after the decimal point.";
		varElse = "Introduces statements that are executed when the condition in an if statement isn’t true.";
		varEnum = "Creates a newly defined type — a group of values that a variable can have.";
		varExtends = "Creates a subclass — a class that reuses functionality from a previously defined class.";
		varFinal = "Indicates that a variable’s value cannot be changed, that a class’s functionality cannot be extended, or that a method cannot be overridden.";
		varFinally = "Introduces the last will and testament of the statements in a try clause.";
		varFloat = "Indicates that a value is a 32-bit number with one or more digits after the decimal point.";
		varFor = "Gets the computer to repeat some statements over and over again (for instance, a certain number of times).";
		varGoto = "You can’t use this word in a Java program. The word has no meaning. Because it’s a keyword, you can’t create a variable named goto.";
		varIf = "Tests to see whether a condition is true. If it’s true, the computer executes certain statements; otherwise, the computer executes other statements.";
		varImplements = "Indicates that a class provides bodies for methods whose headers are declared in an interface.";
		varImport = "Enables the programmer to abbreviate the names of classes defined in a package.";
		varInstanceof = "Tests to see whether a certain object comes from a certain class.";
		varInt = "Indicates that a value is a 32-bit whole number.";
		varInterface = "Introduces an interface. An interface is like a class but, for the most part, an interface’s methods have no bodies.";
		varLong = "Indicates that a value is a 64-bit whole number.";
		varNative = "Enables the programmer to use code that was written in a language other than Java.";
		varNew = "Creates an object from an existing class.";
		varPackage = "Puts the code into a package — a collection of logically related definitions.";
		varPrivate = "Indicates that a variable or method can be used only within a certain class.";
		varProtected = "Indicates that a variable or method can be used in subclasses from another package.";
		varPublic = "Indicates that a variable, class, or method can be used by any other Java code.";
		varReturn = "Ends execution of a method and possibly returns a value to the calling code.";
		varShort = "Indicates that a value is a 16-bit whole number.";
		varStatic = "Indicates that a variable or method belongs to a class, rather than to any object created from the class.";
		varStrictfp = "Limits the computer’s ability to represent extra large or extra small numbers when the computer does intermediate calculations on float and double values.";
		varSuper = "Refers to the superclass of the code in which the word super appears.";
		varSwitch = "Tells the computer to follow one of many possible paths of execution (one of many possible cases), depending on the value of an expression.";
		varSynchronized = "Keeps two threads from interfering with one another.";
		varThis = "A self-reference — refers to the object in which the word this appears.";
		varThrow = "Creates a new exception object and indicates that an exceptional situation (usually something unwanted) has occurred.";
		varThrows = "Indicates that a method or constructor may pass the buck when an exception is thrown.";
		varTransient = "Indicates that, if and when an object is serialized, a variable’s value doesn’t need to be stored.";
		varTry = "Introduces statements that are watched (during runtime) for things that can go wrong.";
		varVoid = "Indicates that a method doesn’t return a value.";
		varVolatile = "Imposes strict rules on the use of a variable by more than one thread at a time.";
		varWhile = "Repeats some statements over and over again (as long as a condition is still true).";
		
		 
		System.out.println("What Keyword matches the following definition: " + "\n");
		
		System.out.println(termDefinition[dice]);
		
		Scanner keywordAnswer = new Scanner(System.in);
		String wordMatch = keywordAnswer.nextLine();
		
		if (keywordAnswer.hasNext()){
			System.out.println("Wrong Answer!");
		}else{
			System.out.println("YAY!");
		}
		 
		
		
		
	}

}
