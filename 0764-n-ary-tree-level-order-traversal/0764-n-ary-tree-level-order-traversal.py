"""
# Definition for a Node.
class Node:
    def __init__(self, val: Optional[int] = None, children: Optional[List['Node']] = None):
        self.val = val
        self.children = children
"""

class Solution:
    def levelOrder(self, root: 'Node') -> List[List[int]]:
        if not root:
            return []
        res = []
        q = [root]
        while q:
            s = len(q)
            lst = []
            for _ in range(s):
                node = q.pop(0)
                lst.append(node.val)
                for n in node.children:
                    q.append(n)
            res.append(lst)
        return res