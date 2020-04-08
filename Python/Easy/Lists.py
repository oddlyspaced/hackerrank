n = int(input())
ls = []
for i in range(n):
    s = input()
    tok = s.split(" ")
    if s.startswith("insert"):
        ls.insert(int(tok[1]), int(tok[2]))
    elif s.startswith("print"):
        print(ls)
    elif s.startswith("remove"):
        del(ls[ls.index(int(tok[1]))])
    elif s.startswith("append"):
        ls.append(int(tok[1]))
    elif s.startswith("sort"):
        ls = sorted(ls)
    elif s.startswith("pop"):
        ls.pop()
    elif s.startswith("reverse"):
        ls.reverse()

