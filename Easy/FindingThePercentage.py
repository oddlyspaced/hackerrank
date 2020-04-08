n = int(input())
marks = []
names = []

for i in range(n):
    inp = input().split(" ")
    names.append(inp[0])
    marks.append((float(inp[1]) + float(inp[2]) + float(inp[3]))/3)

print('%.2f'%(marks[names.index(input())]))