class Solution:
    def isValid(self, s: str) -> bool:
        stk = []
        for char in s:
            if char=='(':
                stk.append(')')
            elif char=='[':
                stk.append(']')
            elif char=='{':
                stk.append('}')
            elif len(stk)>0 and char==stk[len(stk)-1]:
                stk.pop()
            else: return False
        return len(stk) == 0