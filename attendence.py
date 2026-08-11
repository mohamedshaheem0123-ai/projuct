total_days = float(input("Enter total days: "))
absent_days = float(input("Enter total leave: "))

present_days = total_days - absent_days
print("present days is :",present_days)
attendance_percentage = (present_days / total_days) * 100
print("Your attendance percentage is: {:.2f}%".format(attendance_percentage))

if attendance_percentage>=75:
    print("you are eligible for writing exam")
    print("congrajulation")
else:
    print("your attendance percentage is low")
    print("you are not eligible for writing exam")
    