import sys
# 일반적인 입력받기
a = input() # class: str
a = int(input()) # class:int

# 속도 향상을 위한 빠른 입력받기
a = sys.stdin.readline() # class : str
a = int(sys.stdin.readline()) # class : int

# 입력을 리스트로 받기 (map 사용)

a = map(int, input()) # class:int인 list 생성
a = map(int, sys.stdin.readline()) # class:int인 list 생성
