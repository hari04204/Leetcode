# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if not root:
            return []
        ans = []
        q = deque([root])
        ltr = True
        while q:
            size = len(q)
            lvl = deque()
            for _ in range(size):
                node = q.popleft()
                if ltr:
                    lvl.append(node.val)
                else:
                    lvl.appendleft(node.val)
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
            ans.append(list(lvl))
            ltr = not ltr
        return ans