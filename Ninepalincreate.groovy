println "Please enter some text: "
String userEntry = System.console().readLine()
def palindrome = []
palindrome = palindrome + [userEntry]
for (int i = 0; i < userEntry.length();i++)
    {
    palindrome = palindrome + [userEntry.charAt((userEntry.length()-1)-i)]    
    }
newWord = palindrome.join()
println "A palindrome made from your entry would be: " + newWord



