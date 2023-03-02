n,m = map(int,input().split())

l = [0]*n

for _ in range(m):
    i,j,k = map(int,input().split())
    for number in range(i,j+1):
        l[number-1] = k

print(*l)
