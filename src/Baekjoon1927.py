from queue import PriorityQueue
import sys

heap = PriorityQueue()     


# 0이 입력되면 최소힙을 출력! 다만 비어있다면 0을 출력 

N = int(sys.stdin.readline())

for i in range(N):
      a = int(sys.stdin.readline())
      if a == 0 and heap.empty():
            print(0)
      elif a == 0:
            print(heap.get())
      else:
            heap.put(a)
          