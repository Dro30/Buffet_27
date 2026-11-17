import random
joke = random.randrange(0,10)
question = input("Would you like to hear a  good joke? (y/n): ")
jokes = ["Do you want to hear a construction joke? Sorry, I'm still working on it. " ,"Why does the chicken cross the road? To get his eggs duh", "Why can't you trust atoms? • Because they make up everything!" , "Why did the scarecrow win an award? Because he was outstanding in his field." , "What do you call a sleeping bull?", "What do you call a magic dog? A labracadabrador!" , "What do you call an alligator wearing a vest? An investigator!" , "What did one ocean say to the other ocean? Nothing, it just waved." , "Why do cows wear bells?" , "What do you call a fake noodle? • An impasta!" ]
if question == "y":
    print(jokes[joke])
else:
    print("I'll see u later!")
