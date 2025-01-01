class Solution:
    def maxScore(self, s: str) -> int:
        maxs = 0
        score = 0
        scorel = s.count("1")
        for i in range(len(s)-1):
            if s[i]=="0":
                score+=1
            else: scorel-=1
            maxs = max(maxs, score+scorel)
        return maxs