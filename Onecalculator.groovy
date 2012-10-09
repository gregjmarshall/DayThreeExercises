println "Welcome to Calculator. Please enter your first number: "
String str = System.console().readLine()
double x = Double.parseDouble(str)
println "Thank you. Please enter your second number: "
str = System.console().readLine()
double y = Double.parseDouble(str)
println "Please choose 1 to perform addition, 2 for subtraction, 3 for multiplication and 4 for division. "
str = System.console().readLine()
int userChoice = Integer.parseInt(str)
switch (userChoice)
{
case 1: println "The result is " + (x + y) + "."
break;
case 2: println "The result is " + (x - y) + "."
break;
case 3: println "The result is " + (x * y) + "."
break;
case 4: println "The result is " + (x / y) + "."
break;
default: println "That is not an acceptable command."
break;
}
