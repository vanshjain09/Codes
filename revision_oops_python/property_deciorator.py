class Company:
    name_company="bharat-pe"
    profit=300
    loss=100
#in this case netprofit of the company is varying
    @property
    def netprofit(self):
        return self.profit-self.loss
c1=Company()
print(c1.netprofit)
#the varying profit and loss can be taken as in constructur