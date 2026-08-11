mark1, mark2 = map(int, input("Enter your mark1 and mark2: ").split())
print("Your mark1:", mark1)
print("Your mark2:", mark2)
total=mark1+mark2
print("your total mark:",total)
avg = (mark1 + mark2) / 2
print("Your average:", avg)

if avg >= 90:
    print("Grade O")
elif avg >= 80:
    print("Grade A")
elif avg >= 70:
    print("Grade B")
elif avg >= 60:
    print("Grade C")
else:
    print("Rewrite the exam")
