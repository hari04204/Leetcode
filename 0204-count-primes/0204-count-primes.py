class Solution:
    def countPrimes(self, n: int) -> int:
        if n<2: return 0
        lst = [True]*n
        lst[0] = False
        lst[1] = False

        for i in range(2,n):
            if lst[i] == True:
                for j in range(i*i,n,i):
                    lst[j] = False
        return sum(lst)