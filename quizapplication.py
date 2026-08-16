

questions = [
    {
        "question": "Which language is used for AI and Data Science?",
        "options": ["A. Python", "B. HTML", "C. CSS", "D. SQL"],
        "answer": "A"
    },
    {
        "question": "Which keyword is used to define a function in Python?",
        "options": ["A. function", "B. def", "C. fun", "D. define"],
        "answer": "B"
    },
    {
        "question": "Which symbol is used for comments in Python?",
        "options": ["A. //", "B. /*", "C. #", "D. --"],
        "answer": "C"
    },
    {
        "question": "Which data type stores multiple values in Python?",
        "options": ["A. int", "B. list", "C. float", "D. bool"],
        "answer": "B"
    },
    {
        "question": "What is the extension of a Python file?",
        "options": ["A. .java", "B. .html", "C. .py", "D. .cpp"],
        "answer": "C"
    }
]

score = 0

print("=" * 40)
print("       PYTHON QUIZ APPLICATION")
print("=" * 40)

for i, question in enumerate(questions, 1):

    print("\nQuestion", i)
    print(question["question"])

    for option in question["options"]:
        print(option)

    answer = input("Enter your answer (A/B/C/D): ").upper()

    if answer == question["answer"]:
        print("Correct! ")
        score += 1
    else:
        print("Wrong! ")
        print("Correct answer:", question["answer"])

print("\n" + "=" * 40)
print("             QUIZ RESULT")
print("=" * 40)

print("Total Questions:", len(questions))
print("Correct Answers:", score)
print("Wrong Answers:", len(questions) - score)
print("Your Score:", score, "/", len(questions))

if score == len(questions):
    print("Excellent! ")
elif score >= 3:
    print("Good Job! ")
else:
    print("Keep Practicing! ")