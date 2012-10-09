println "Please enter an expression - e.g. '5*10' or '25/5'"
String x = System.console().readLine()
String charPos = x.charAt(0)
int y = 0
def firstNum = []
def secondNum = []
String operATor = null
while (charPos.isNumber() == true)
{
y++;
firstNum = firstNum + [charPos]
charPos = x.charAt(y)
}

if (!charPos.isNumber())
{
operATor = charPos
y++;
charPos = x.charAt(y)
}

while (charPos.isNumber() == true)
{
y++;
secondNum = secondNum + [charPos]
    if (y >= x.length())
    {
    break;
    }
    else 
    {
    charPos = x.charAt(y)
    }
}

String str1 = firstNum.join()
int num1 = Integer.parseInt(str1)
String str2 = secondNum.join()
int num2 = Integer.parseInt(str2)

if (operATor == "+")
{
println "The result is: " + (num1 + num2)
}
    else if (operATor == "-")
    {
    println "The result is: " + (num1 - num2)
    }
        else if (operATor == "*")
        {
        println "The result is: " + (num1 * num2)
        }
            else if (operATor == "/")
            {
            println "The result is: " + (num1 / num2)
            }
