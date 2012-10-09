
println "Please enter some text: "
int eCount = 0
String str = System.console().readLine()
for (int y = 0; y < str.length(); y++)
{
    if (str.charAt(y) == "e")
    {
    eCount++
    }
}
println "Your text contained " + eCount + " examples of the letter 'e'."

