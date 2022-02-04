# 문자열은 내부적으로 리스트로 작동하기 때문에 인덱싱 및
# 슬라이싱 모두 가능하다.
a = "Hello World"
print(a)
print(a[3])
print(a[0:6])
a = "Don`t you know \"Python\"?" # 이스케이프 문자로 쌍따옴표를
# 문자열에 삽입할 수 있다.
print(a)

# String expression
a = "Hello"
b = "World"
print(a + " " + b)
a = "String"
print(a * 3)
print(b + b + b)