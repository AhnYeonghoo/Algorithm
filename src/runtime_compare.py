import time
from random import randint

#배열에 10000개 정수 삽입
array = []
for _ in range(10000):
    array.append(randint(1, 100))

start_time = time.time()

#선택 정렬
for i in range(len(array)):
    min_index = i  # 가장 작은 원소의 인덱스
    for j in range(i + 1, len(array)):
        if array[min_index] > array[j]:
            min_index = j
    array[min_index], array[i] = array[i], array[min_index]

end_time = time.time()
print(f"선택정렬 프로그램 수행시간: {end_time - start_time} ")

array = []
for _ in range(10000):
    array.append(randint(1, 100))

start_time = time.time()
array.sort()  # 파이썬 기본 정렬 라이브러리 사용
end_time = time.time()
print(f"파이썬 기본 정렬 라이브러리 수행시간: {end_time - start_time}")
