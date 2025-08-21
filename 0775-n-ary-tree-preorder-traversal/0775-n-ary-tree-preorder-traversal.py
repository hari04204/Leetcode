"""
# Definition for a Node.
class Node:
    def __init__(self, val: Optional[int] = None, children: Optional[List['Node']] = None):
        self.val = val
        self.children = children
"""

class Solution:
    def preorder(self, root: 'Node') -> List[int]:
        if not root:
            return []
        stk, res = [root],[]
        while stk:
            node = stk.pop()
            res.append(node.val)
            if node.children:
                stk.extend(reversed(node.children))
        return res