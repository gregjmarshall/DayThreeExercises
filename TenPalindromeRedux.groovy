println "Please enter some text: "
String str = System.console().readLine()
char char1
def userEntry = []
for (int y = 0; y < str.length(); y++)
{
char1 = str.charAt(y)
if (char1.isLetter())
    {
    char1 = char1.toLowerCase()
    userEntry = userEntry + [char1]
    }
}
String newEntry = userEntry.join()
println newEntry
boolean palindrome = true
int x = 0
while (x < (newEntry.length()/2))
{
    if (x == (newEntry.length()/2))
    {
    break;
    }
        if (newEntry.charAt(x) != newEntry.charAt((newEntry.length()-1) - x))
        {
        palindrome = false
        }
x++;
}

if (palindrome)
{
println "Your text WAS a relaxed palindrome."
}
else
{
println "Your text was NOT a relaxed palindrome."
}