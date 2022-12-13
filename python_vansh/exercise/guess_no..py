import random
a=random.randint(1, 100)
print("Choose a number between 1 and 100\n")
ntry=1
while(1):
 b=int(input())
 if ntry>9:
    print("you exceed the limit!GAME OVER\n")
    break
 if b>a:
      print("Smaller number please\n")
      ntry+=1
      
 elif b<a:
    print("higher number please\n")
    ntry+=1
    
 elif b>100 or b<1:
    print("invalid choice")
    break
 elif b==a:
      print("you guess the number in",ntry,"attempts")
      break
 