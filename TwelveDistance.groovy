public class Point
{
double xCoOrd;
double yCoOrd;
}
Point pointOne = new Point();
Point pointTwo = new Point();
Point pointThree = new Point();

println "Please enter the X coordinate of point one: "
String s = System.console().readLine()
pointOne.xCoOrd = Double.parseDouble(s)
println "Please enter the Y coordinate of point one: "
s = System.console().readLine()
pointOne.yCoOrd = Double.parseDouble(s)
println "Please enter the X coordinate of point two: "
s = System.console().readLine()
pointTwo.xCoOrd = Double.parseDouble(s)
println "Please enter the Y coordinate of point two: "
s = System.console().readLine()
pointTwo.yCoOrd = Double.parseDouble(s)
println "Please enter the X coordinate of point three: "
s = System.console().readLine()
pointThree.xCoOrd = Double.parseDouble(s)
println "Please enter the Y coordinate of point three: "
s = System.console().readLine()
pointThree.yCoOrd = Double.parseDouble(s)
square = { it * it }
double distP1P2 = Math.sqrt(square(pointTwo.xCoOrd - pointOne.xCoOrd) + square(pointTwo.yCoOrd - pointOne.yCoOrd))
double distP1P3 = Math.sqrt(square(pointThree.xCoOrd - pointOne.xCoOrd) + square(pointThree.yCoOrd - pointOne.yCoOrd))
double distP2P3 = Math.sqrt(square(pointThree.xCoOrd - pointTwo.xCoOrd) + square(pointThree.yCoOrd - pointTwo.yCoOrd))

if ((distP1P2 > distP1P3) && (distP1P2 > distP2P3))
{
println "Points 1 and 2 are furthest apart."
}
    else if ((distP1P3 > distP1P2) && (distP1P3 > distP2P3))
    {
    println "Points 1 and 3 are furthest apart."
    }
        else if ((distP2P3 > distP1P2) && (distP2P3 > distP1P3))
        {
        println "Points 2 and 3 are furthest apart."
        }
        