class Dad:
    pass
class son(Dad):
    dance=6
    def dance(self):
        return f"I dance {self.dance} number of times"
class Grandson(son):
    dance=9
    #def dance(self):
    #    return f" yo yo!"\
   #              f"I dance { self.dance} number of times in rocking style"
darry=Dad()
larry=son()
harry=Grandson()
print(harry.dance())
    