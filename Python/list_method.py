# 리스트 생성
a = [1, 4, 3]
print(f"기본 리스트: {a}")

# 마지막 인덱스에 요소 삽입하는 append(), 시간복잡도: O(1)
a.append(2)
print(f"마지막 요소를 삽입한 리스트: {a}")

# 오름차순 및 내림차순 정렬 sort(), 시간복잡도: O(NlogN)
a.sort() # 오름차순, default=False
print(f"오름차순 정렬한 리스트: {a}")
a.sort(reverse=True) # 내림차순
print(f"내림차순 정렬한 리스트: {a}")

# 원소들 뒤집기 sort(reverse=True)와 비슷..?
a.reverse()
print(f"원소 뒤집기 수행한 리스트: {a}")

# 원하는 인덱스에 원소를 삽입 insert(), 시간복잡도: O(N)
a.insert(1, 1.5)
print(f"원하는 인덱스에 요소 삽입한 리스트: {a}")

# 특정한 값을 가지는 데이터의 개수를 센다 count(), 시간복잡도: O(N)
print(f"원소가 3인 데이터 개수 센 결과: {a.count(3)}")

# 특정한 값을 가지는 원소 삭제 remove, 시간복잡도: O(N)
# 원소가 여러개면 하나만 제거
a.remove(1)
print(f"첫 번째 원소 제거한 리스트: {a}")

# 파이썬에선 특정한 원소를 갖는 모든 원소를 제거하는 remove_all()이 없기
# 때문에 일종의 스킬이 필요하다. 

a = [1, 2, 3, 4, 5, 6, 7, 8, 5, 5]
remove_set = {6, 7, 8} # 제거하고 싶은 원소를 set 자료형에 저장
# 리스트 컴프리헨션 사용
result = [i for i in a if i not in remove_set]
print(result)



