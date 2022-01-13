import sys
N = int(sys.stdin.readline().strip())
lst = []

for _ in range(N):
  x = sys.stdin.readline().strip()

  # 만약 시작 단어가 push면
  if x.startswith("push"):
      # 마지막 인덱스인 숫자를 list에 추가
    lst.append(x.split()[-1])
  # 팝이라면
  elif x == 'pop':
      # 비어있다면
    if lst == []:
      print(-1)
    else:
      print(lst.pop())
  # 사이즈라면
  elif x == 'size':
    print(len(lst))
  # 엠프티라면
  elif x == 'empty':
    if lst == []:
      print(1)
    else:
      print(0)
  # 탑이라면
  elif x == 'top':
    if lst == []:
      print(-1)
    else:
        # list의 마지막 수 출력
      print(lst[-1])
