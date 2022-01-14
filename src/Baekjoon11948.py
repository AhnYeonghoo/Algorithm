# 물화생지 중 3과목
list_1 = []
a = int(input())
b = int(input())
c = int(input())
d = int(input())
list_1.append(a)
list_1.append(b)
list_1.append(c)
list_1.append(d)
list_1.sort(reverse = True)
result_1 = []
# 역사 지리 중 1과목
list_2 = []
e = int(input())
f = int(input())
list_2.append(e)
list_2.append(f)
list_2.sort(reverse = True)
result_2 = []
result_2.append(list_2[0])
for i in range(3):
  result_1.append(list_1[i])

sum = 0
result_1.append(list_2[0])
for i in range(len(result_1)):
  sum += result_1[i]

print(sum)
