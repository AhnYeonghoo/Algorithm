import sys
a = int(sys.stdin.readline())
b = int(sys.stdin.readline())
c = int(sys.stdin.readline())
result = a * b * c
list_ = list(str(result))
for i in range(0,10):
    print(list_.count(f'{i}'))