
class bankaccount:
    def __init__(self,balance):
        self.balance=balance
        
    def deposit(self,amount):
        self.balance+=amount
        
    def withdraw(self,amount):
        self.balance-=amount
        
    acc=bankaccount(1000)
    acc.deposit(500)
    acc.withdraw(200)
    
    print(acc.balance)