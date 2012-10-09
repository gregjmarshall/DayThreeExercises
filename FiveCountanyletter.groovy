println "Please enter some text: "
int letterCount = 0
String str = System.console().readLine()
println "Please enter (in lower case) the letter you would like to count: "
String leTTer = System.console().readLine()
for (int y = 0; y < str.length(); y++)
{
    if (str.charAt(y) == leTTer)
    {
    letterCount++
    }
}
println "Your text contained " + letterCount + " examples of the letter '" + leTTer + "'."

