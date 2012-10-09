

class Rectangle
{
gridPoint upperLeft = new gridPoint();
gridPoint lowerRight = new gridPoint();
}

println "Please enter the X coordinate of the top left corner of your rectangle: "
String s = System.console().readLine()
upperLeft.xCoOrd = Double.parseDouble(s);
println "Please enter the Y coordinate of the top left corner of your rectangle: "
s = System.console().readLine()
upperLeft.yCoOrd = Double.parseDouble(s);
println "Please enter the X coordinate of the bottom right corner of your rectangle: "
s = System.console().readLine()
lowerRight.xCoOrd = Double.parseDouble(s);
println "Please enter the Y coordinate of the bottom right corner of your rectangle: "
s = System.console().readLine()
lowerRight.yCoOrd = Double.parseDouble(s);
double cornerToCorner = Math.sqrt(upperLeft.xCoOrd - lowerRight.xCoOrd) + (upperLeft.yCoOrd - lowerRight.yCoOrd)
double side1 = Math.sin45(cornerToCorner)
double side2 = Math.cos45(cornerToCorner)
double areaRec = side1*side2
double perimeter = (side1 * 2) + (side2 * 2)
println "The area of the rectangle will be "+areaRec+" and the perimeter of the rectangle will be "+perimeter+"."