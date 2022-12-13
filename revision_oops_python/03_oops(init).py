class MovieBooking:
    def __init__(self,name,movie):
        print("Welcome to Movie Booking!")
        self.name=name
        self.movie=movie
        #this init statement is printed without any calling
        #but basically init is a constructur
    def printdata(self):
        print(f"Name of person is {self.name} and movie's name is {self.movie}")
vansh=MovieBooking("Vansh Jain","KGF 2")

vansh.printdata()