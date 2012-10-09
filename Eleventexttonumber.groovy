println "Please enter a number: "
String userEntry = System.console().readLine()
def numList = []
for (int y = 0; y < userEntry.length();y++)
{   
    String character = userEntry.charAt(y)
    if (character.isNumber() == true)
       {
       numList = numList + [userEntry.charAt(y)]
       }
}
String finalNum = numList.join()
int halfNum = Integer.parseInt(finalNum)
println "Half of your number is " + (halfNum/2) + "."
       