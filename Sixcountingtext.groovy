println "Please enter some text: "
String lookFor = System.console().readLine()
println "Please enter the longer text you would like to search: "
String longText = System.console().readLine()
int textCount = 0
boolean apparent = true
for (int x = 0;x < longText.length();x++)
{
    apparent = true;
    for (int y = 0;y < lookFor.length(); y++)
    {
        if (longText.length() <= (x+y))
        {
        break;
        }
        if (longText.charAt(x+y) != lookFor.charAt(y))
        {
        apparent = false
        }
    }
if (apparent == true)
{
textCount++;
}
}
println "Your text appeared " + textCount + " times."