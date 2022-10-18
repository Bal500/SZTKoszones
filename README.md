# SzoftvertesztGyak

I started off by creating a test scenario without any names, to get 'Hello, my friend.' as output.
When I was done with that, I inserted my first and only proper input 'Dincso'. I quickly wrote the code needed to give back a porper answer for that input.
It worked out pretty easily since I only had to make a tiny piece of code in order to succeed as I only needed an if-statement which checked whether the
number of names were exactly 1. Then I started putting some more effort into getting that 'if-statement' handle the shouters as well. The light of brilliance quickly
kicked my head and I came up with the idea of checking whether the 2nd character of a name is a capital letter. To achieve checking that, I used the 'charAt()' function
which was very easy to implement, also it looks quite simple and genuine.

After I was done with all that kind of stuff, I implemented the next function, to handle multiple inputs. I used an 'if-statement' again, to check if number of
inputs are greater the 1. I made 2 global variables named 'simpleStart' and 'capitalStart'. I got to use my brilliant and genuine idea again to check the 2nd letter
of each name to greet them the way they are intended to. 

The next step was to handle multiple and mixed inputs. I got over this problem rather quickly since I already made some progress for this problem in my previous step, by
being able to sort the names by shouting and 'normal' names. From this point on I just had to complement this piece of code into my original writings.

So at this point the first problems started to raise. Even though I have successfully splitted up the names when they were divided by commas, for some reason
I couldn't just send the splitted names back from my 'for loop' properly and it just kept sending back the splitted names and the original input string no matter what.
After getting over this problem, after a good amount of swear words, I rewrote my code at a couple of places since I stored these splitted names in a separate list which
I then connected to another list where I stored the normally entered names.
