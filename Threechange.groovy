println "Please enter the cost of the item - e.g. 12.25 = (Twelve pounds and twenty five pence): "
String cost = System.console().readLine()
Double cost1 = Double.parseDouble(cost)
println "Please enter the money tendered - e.g. 20.00 = (Twenty Pounds and Zero Pence): "
String tender = System.console().readLine()
Double tender1= Double.parseDouble(tender)
Double change = tender1 - cost1
int changeint = change
Double changepence = 100*(change - changeint)
change = change*100
int fifties = 0
int twenties = 0
int tens = 0
int fives = 0
int twos = 0
int ones = 0
int fiftyps = 0
int twentyps = 0
int tenps = 0
int fiveps = 0
int twops = 0
int oneps = 0
if (change >= 5000)
    {
    fifties = change / 5000;
    change = change - (fifties*5000)
    }
if (change >= 2000)
    {
    twenties = change / 2000
    change = change - (twenties * 2000)
    }
if (change >= 1000)
    {
    tens = change / 1000
    change = change - (tens * 1000)
    }
if (change >= 500)
    {
    fives = change / 500
    change = change - (fives * 500)
    }
if (change >= 200)
    {
    twos = change / 200
    change = change - (twos*200)
    }
if (change >= 100)
    {
    ones = change / 100
    change = change - (ones*100)
    }

if (changepence >= 50)
    {
    fiftyps = changepence / 50
    changepence = changepence - (fiftyps * 50)
    }

if (changepence >= 20)
    {
    twentyps = changepence / 20
    changepence = changepence - (twentyps * 20)
    }

if (changepence >= 10)
    {
    tenps = changepence / 10
    changepence = changepence - (tenps * 10)
    }
if (changepence >= 5)
    {
    fiveps = changepence / 5
    changepence = changepence - (fiveps * 5)
    }
if (changepence >= 2)
    {
    twops = changepence / 2
    changepence = changepence - (twops * 2)
    }
if (changepence >= 1)
    {
    oneps = changepence / 1
    changepence = changepence - (oneps * 1)
    }
println "You need " + fifties + " fifty pound notes,  " + twenties + " twenty pound notes, " + tens + " ten pound notes " + fives + " five pound notes " + twos + " two pound coins, and " + ones + " one pound coins. You also need " +fiftyps+ " 50 pence pieces, " +twentyps+ " 20 pence pieces, "+tenps+ " 10 pence pieces, "+fiveps+" 5 pence pieces, "+twops+" 2 pence pieces, and " +oneps+ " 1 pence pieces."