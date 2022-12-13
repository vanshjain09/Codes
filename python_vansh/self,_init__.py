class sports:
    def __init__(self,no_players,no_matches):
        self.players=no_players
        self.matches=no_matches
    def display(self):
        return f"number of playes is {self.players},number of matches is {self.matches}"
cricket=sports(11,6)
print(cricket.players)
print(cricket.display())

