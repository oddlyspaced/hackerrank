n = int(input())
names = []
marks = []
for i in range(n):
    names.append(input())
    marks.append(float(input()))

# sort here

first_names = []
first_marks = []

for m in marks:
    if m not in first_marks:
        first_marks.append(m)
        del(marks[marks.index(m)])

for m in marks:
    if m not in first_marks:
        first_marks.append(m)
        del(marks[marks.index(m)])
        break


print(first_marks)

print(names[0])
print(names[1])