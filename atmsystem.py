balance=1000
pin=1234
password=int(input("Enter your pin: "))
if password==pin:
    print("Welcome to ATM")
    print("1. Check Balance")
    print("2. Withdraw")
    print("3. Deposit")
    choice=int(input("Enter your choice: "))
    if choice==1:
        print("Your balance is:", balance)
    elif choice==2:
        amount=int(input("Enter amount to withdraw: "))
        if amount>balance:
            print("Insufficient balance")
        else:
            balance-=amount
            print("You have withdrawn:", amount)
            print("Your new balance is:", balance)
    elif choice==3:
        amount=int(input("Enter amount to deposit: "))
        balance+=amount
        print("You have deposited:", amount)
        print("Your new balance is:", balance)
    else:
        print("Invalid choice")
else:
    print("invalid pin")