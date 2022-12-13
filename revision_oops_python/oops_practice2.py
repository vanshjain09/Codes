class Train:
    n_tickets=50
    def __init__(self,name,fare,seats):
        self.name=name 
        self.fare=fare
        self.seats=seats
    def getstatus(self):
        print(f"The name of the train is {self.name}")
        print(f"The number of seats available in the train is {self.seats}")
    def fairinfo(self):
        print(f"The fair of the train is {self.fare}")
    def booking(self):
        if (self.seats>0):
            print(f"Your seat has been booked! and your seat number is {self.seats}")
            self.seats=self.seats-1
        else:
            print("The train is fully occupied")
    def cancel(self,bookingnumber):
        self.seats=[]
        self.seats.append(bookingnumber)
        print("your ticket is cancelled")

        
delhiexpress=Train("Delhi-Express", 50, 500)       
delhiexpress.getstatus()
delhiexpress.fairinfo()
delhiexpress.booking()
delhiexpress.cancel(500)
delhiexpress.getstatus()

