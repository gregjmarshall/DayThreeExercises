public class gridPoint
{
double xCoOrd;
double yCoOrd;
}
gridPoint pointOne = new Point();
gridPoint pointTwo = new Point();
gridPoint pointThree = new Point();

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

double distP1P2 = Math.sqrt(pointTwo.xCoOrd - pointOne.xCoOrd) + (pointTwo.yCoOrd - pointOne.yCoOrd)
double distP1P3 = Math.sqrt(pointThree.xCoOrd - pointOne.xCoOrd) + (pointThree.yCoOrd - pointOne.yCoOrd)
double distP2P3 = Math.sqrt(pointThree.xCoOrd - pointTwo.xCoOrd) + (pointThree.yCoOrd - pointTwo.yCoOrd)

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
        