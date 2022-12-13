import random
list=["s","p","sc"]
comp=random.choice(list)
print("Enter your choice (s for stone,p for paper,sc for scissor)\n")
player=input()
if comp==player:
    print("Match is drawn !Thanks for playing\n")
elif comp=='s' and player=='p' or comp=='p' and player=='sc' or comp=='sc' and player=='s':
     print("CONRATS!You are Winner")
else :
    print("You Lose the Game")
    print("Computer choice is:",comp)