println "Please enter some text: "
userEntry = System.console().readLine()
boolean palindrome = true
println userEntry.length() / 2
int y = 0
while (y < (userEntry.length()/2))
{
    if (y == (userEntry.length()/2))
    {
    break;
    }
    if (userEntry.charAt(y) != userEntry.charAt((userEntry.length()-1) - y))
    {
    palindrome = false
    }
y++;
}

if (palindrome)
{
println "Your text WAS a strict palindrome."
}
else
{
println "Your text was NOT a strict palindrome."
}