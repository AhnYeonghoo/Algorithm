import math
import sys
a, b = map(int,input().split())
count = ""

# 3이면 111임
# 4이면 1111이고

gcd = math.gcd(a,b)
for _ in range(gcd):
  count += "1"

print(count)
