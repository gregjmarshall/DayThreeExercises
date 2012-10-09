
println "Please enter some text: "
def usedLetters = []
boolean finished = false
String str = System.console().readLine()
while (!finished)
{    
    int letterCount = 0
    println "Please enter (in lower case) the letter you would like to count: "
    String leTTer = System.console().readLine()
        if (usedLetters.contains(leTTer))
        {
        finished = true
        break;
        }
    usedLetters = usedLetters + [leTTer]
        for (int y = 0; y < str.length(); y++)
        {
            if (str.charAt(y) == leTTer)
            {
            letterCount++
            }
        }
    println "Your text contained " + letterCount + " examples of the letter '" + leTTer + "'."
}

println "Same letter entered twice. Closing program."

