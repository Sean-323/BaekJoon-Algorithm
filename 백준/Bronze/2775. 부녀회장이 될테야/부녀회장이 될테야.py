num = int(input())

for _ in range(num):
    k = int(input())
    n = int(input())

    people = [i for i in range(1, n + 1)]

    for _ in range(k):
        for j in range(1, n):
            people[j] += people[j - 1]
    
    print(people[-1])