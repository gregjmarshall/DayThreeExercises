println "Please enter some text: "
String str = System.console().readLine()
for (int y = 0; y < str.length(); y++)
{
    if (str.charAt(y) == " ")
    {
    println " "
    }
        else 
        {
        print str.charAt(y);
        }
}

