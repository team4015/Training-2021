# Practice 0 - *Hello World*

### Program Structure

Every Java program **must** start contain the following code in order to run:

```
class Main
{
	public static void main(String [] args)
	{
		// Write your code here!
	}
}
```

Don't worry too much about what this code means.  We will explain it later!  There are a few main takeaways from this code:

1. The name of the class **must** match the name of your Java file.  In this case, the class name is `Main`, and therefore we must write our code in a file named `Main.java`.
3. The line `// Write your code here!` is a "comment".  You can use comments to leave yourself notes in the code, and whatever you write will **not** affect the program!  Just make sure that you start every comment with `//`.
2. Your Java program will **always** start executing inside the `main()` method, which is where the comment is located.  You can write any amount of code within the inner set of curly brackets `{ }`.

### Task
Start by writing the code above inside the file named `Main.java`.  Your next task is to make your program print the message:

```
Hello World!
```

This is a right of passage for all new programmers!  In order to print a message to the screen, you will need to use the following piece of code:

```
System.out.println("Put your message here");
```

Try using this code to compelte the task.  Feel free to try printing different messages if you like!

### Compilation

After writing your code, you will need to compile it by running the compiler.  The Java compiler can be installed by downloading the JDK from Oracle's website.  You can use the compiler by running the `javac` command from your terminal.  You will need to tell the compiler what the name of your Java source code file is.  In this case, we would run the following command:

```
javac Main.java
```

The compiler will check your code for mistakes and syntax errors.  If you do not see any error messages, then your code is good to go!  You can run you program in the JVM using the `java` command.  We will need to tell the JVM the name of our main class, which is `Main`.  Therefore, our command would be:

```
java Main
```

You should now see your message printed in the terminal!
