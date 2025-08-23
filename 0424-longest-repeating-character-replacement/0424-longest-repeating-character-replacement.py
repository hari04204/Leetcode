class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        n = len(s)
        count = defaultdict(int)
        maxfreq, left, maxlen = 0,0,0
        for right in range(len(s)):
            count[s[right]]+=1
            maxfreq = max(maxfreq, count[s[right]])

            if (right-left)+1 - maxfreq > k:
                count[s[left]] -= 1
                left+=1
            maxlen = max(maxlen, right-left+1)
        return maxlen
