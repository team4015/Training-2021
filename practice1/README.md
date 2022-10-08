# Practice1 - *Loops and Conditional Statements*

## Recap

Conditional statements are one of the most important elements of programming. They let you do things like repeat the same code over and over without having to rewrite it and direct the flow of code depending on the state of certain variables. There are a couple of conditional statements that you will need to program a robot. Let's outline a quick review of the main ones.

### While Loops
#### Syntax

```java
while (condition)
{
    // code
}
```

While loops are good for running the same code over and over until the value of a variable changes. The code in the loop will continuously continue executing from top to bottom until the condition in the brackets becomes false. But beware, if you aren't careful your code could get stuck in the loop forever if the condition the loops checkes never changes! If the condition in the brackets is false, the program will skip right over the loop.

### If Statements
#### Syntax

```java
if (condition)
{
    // code
}
```

If statements can check if the condition in the brackets is true or false. If it is true, the program will execute the code inside the curly brackets once and then move on to the next line after the if statement. If it is false, it will skip right over the code inside the curly brackets. If you want to run some lines of code only if the if statement returns false, you can use an if else statement.

```java
if (condition)
{
    // code if true
}
else
{
    // code if false
}
```

The code inside the else brackets will only run if the statement is false. Once it finishes executing, it will exit the statement and move onto the rest of the code.

### For Loops
#### Syntax

```java
for (initialization; condition; increment)
{
    // code
}
```

For loops are a bit tricky to get the hang of, but are one of the most important conditional statements. A for loop is a lot like a while loop. One useful feature of for loops is that you can control exactly how many times it will run. The initialization part can be used to make a variable to use as a counter. The condition can be used to check if the value of the counter has reached the wanted amount. The increment is used to increase the value of the counter. For example:

```java
for (int i = 0; i < 5; i++)
{
    // code
}
```

The first part makes a counter variable and sets it to 0. The next part checks if the counter has reached the wanted number. The last part increases the value of the counter by one each interation. This for loop is made to run 5 times. The first time, the code will run once and go back to check the condition when it's done. Since the counter value is one, the condition is true since 0 < 5. The increment then increases the counter to 1. The loops continues to run until i = 5. The condition is no longer true since 5 < 5 is not true. In this case, the loop will exit. In total, the loop will run 5 times.

This is only one way to use for loops. There are countless other ways to use them. They are not only counters. In time you will learn of their true power MWhahahaha! Though in all seriousness, they really are the most powerful conditional statements that I know about as of now so make sure you get good at them.

### The Fancy Stuff

There's a couple of extra things that have to do with loops that are good to know about. They are just extra things that you can still use loops without so don't worry if they seem complicated.

#### Break

`break;` can be used anywhere in a loop to immediately exit it. If you want to put a hard stop to the loop's code, using break will stop executing all code in the loop and will exit the loop before it can go any further.

#### Continue

`continue;` is a lot like break, except instead of making a hard exit, it will jump to the start of the loop immediately before the reaching then end of the code inside the curly brackets.  This is useful if you want to skip the bottom half of the loop code and only run the top half before jumping to the next iteration.  Note that in a `for` loop, the counter will still increment after using a `continue`.  There are some circumstances in which it is better to use continue instead of break, but this really just depends on your code and what you want your code to do.

#### Do While Loops

Do while loops are just like while loops, except the condition is checked at the end.

```java
do
{
    // code
}
while (condition);
```

Once again, there are certain times in which this is better to use than while loops, but that depends on your code and what you want it to do.

## Task

In order to test out using these loops and conditional statements, try writing a program that does the following in Main.java:

1. Program prints "Hello" 5 times, each on a new line. Use a while loop.
2. Program prints "World" 7 times, all on the same line. Use a for loop.
3. Program creates a variable with a random value from 0 to 1. Print this value.
4. Program prints "LOOPS" 3 times if the varible is odd, and 5 times if it is even.
5. Program prints "done" and ends.

TIP: There are many ways to produce a random value. The easiest way is to use `Math.random()`. This will give you a number from 0 to 1, but it does not store it. Think of it as if "Math.random()" gets replaced with a random number wherever it is written.

Try making this program. Don't worry if you are not able to get it to work. Bring your code in on Monday and we'll help you out. Be creative and try using more than just if statements. Try to use at least 1 while loop, 1 for loop, and if statements. Bonus points if you figure out how to use one of those fancy concepts. Have fun and don't feel bad to ask for help!

Hint: You can put one loop inside another loop. Good Luck.
