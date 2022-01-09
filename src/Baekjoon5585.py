import sys
a = int(sys.stdin.readline())
a = 1000 - a
coin_list = [500, 100, 50, 10, 5, 1]
count = 0
for coin in coin_list:
    if a > coin:
        count += a // coin
        a %= coin
print(count)