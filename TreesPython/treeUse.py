from tree import BinaryTree

class TreeUse(object):

    @classmethod
    def findheightrecursive(cls, root):
        if root is None:
            return 0
        max_height = 0

        left_height = self.findheightrecursive(root.left)
        right_height = self.findheightrecursive(root.right)

        max_height = max(left_height, right_height) + 1
        return max_height
    
    @classmethod
    def findHeightStack(cls, root):
        if root is None:
            return 0
        stack_ = [root]
        prev = None
        max_depth = 0
        while(len(stack_)>0):
            curr = stack_[-1]
            if((prev==None) or (prev.left==curr) or (prev.right==curr)):
                if curr.left is not None:
                    stack_.append(curr.left)
                elif curr.right is not None:
                    stack_.append(curr.right)
            elif curr.left == prev:
                if curr.right is not None:
                    stack_.append(curr.right)
            else:
                stack_.pop()
            prev = curr
            if(len(stack_)>max_depth):
                max_depth = len(stack_)
        return max_depth 

    @classmethod
    def findHeightQueue(cls, root):
        queue_ = [root, None]
        count_ = 0
        while(len(queue_)>0):
            curr = queue_.pop(0)
            if curr == None:
                count_ = count_ + 1
                if len(queue_) == 0 :
                    break
                queue_.append(None)
                continue
            if curr.left is not None:
                queue_.append(curr.left)
            if curr.right is not None:
                queue_.append(curr.right)
            
        return count_

    @classmethod
    def findMinDepth(cls, root):
        """The minimum depth is the number of nodes along the 
        shortest path from root node down to the nearest leaf node."""
        queue_ = [root, None]
        count_ = 0
        while(len(queue_)>0):
            curr = queue_.pop(0)
            if curr == None:
                count_ = count_ + 1
                if len(queue_) == 0:
                    break
                queue_.append(None)
                continue
            if curr.left is None and curr.right is None:
                return count_ + 1
            if curr.left is not None:
                queue_.append(curr.left)
            if curr.right is not None:
                queue_.append(curr.right)
            
        return count_
    
    @classmethod
    def findDeepestNode(cls, root):
        """The last node in quque is the deepest node"""
        queue_ = [root]
        count_ = 0
        while(len(queue_)>0):
            curr = queue_.pop(0)
            if curr.left is not None:
                queue_.append(curr.left)
            if curr.right is not None:
                queue_.append(curr.right)
            
        return curr
    @classmethod
    def findDeepestNodeprev(cls, root):
        """The last node in queue is the deepest node"""
        queue_ = [root]
        count_ = 0
        curr = None
        parent = None
        while(len(queue_)>0):
            curr = queue_.pop(0)
            if curr.left is not None:
                queue_.append(curr.left)
                parent = curr

            if curr.right is not None:
                queue_.append(curr.right)
                parent = curr
            if len(queue_) == 0:
                if parent.left == curr:
                    parent.left = None
                if parent.right == curr:
                    parent.right = None
                break
        return curr

    @classmethod
    def findNode(cls, data, root):
        if root is None:
            return None
        queue_ = [root]
        parent = None
        while True:
            curr = queue_.pop(0)
            if curr.left is not None:
                if curr.left.data  == data:
                    return curr, curr.left
                queue_.append(curr.left)
            if curr.right is not None:
                if curr.right.data  == data:
                    return curr, curr.right
                queue_.append(curr.right)
                parent = curr
        
        return parent, curr

    @classmethod
    def deleteNode(cls, data, root):
        data_node = None
        if data is not None:
            prev_node, data_node = TreeUse.findNode(data, root)
        deepest_node = TreeUse.findDeepestNodeprev(root)
        if deepest_node == data_node:
            return root
        if deepest_node is not None and data_node is not None:

            deepest_node.left = data_node.left
            deepest_node.right = data_node.right
            if prev_node is not None:
                if prev_node.left == data_node:
                    prev_node.left = deepest_node
                else:
                    prev_node.right = deepest_node
            else:
                root = deepest_node
            data_node.left = None
            data_node.right = None
        
        return root
        
    @classmethod
    def numberOfLeaves(cls, root):
        queue_ = [root]
        count_ = 0
        while(len(queue_)>0):
            curr = queue_.pop(0)
            if curr.left is not None:
                queue_.append(curr.left)
            if curr.right is not None:
                queue_.append(curr.right)
            
            if curr.left is None and curr.right is None:
                count_ += 1
        return count_
    @classmethod
    def numberOfFullNodes(cls, root):
        if root is None:
            return 0
        queue_ = [root]
        count_ = 0
        while(len(queue_)>0):
            curr = queue_.pop(0)
            if curr.left is not None:
                queue_.append(curr.left)
            if curr.right is not None:
                queue_.append(curr.right)
            
            if curr.left is not None and curr.right is not None:
                count_ += 1
        return count_
        
    @classmethod
    def numberOfHalfNodes(cls, root):
        if root is None:
            return 0
        queue_ = [root]
        count_ = 0
        while(len(queue_)>0):
            curr = queue_.pop(0)
            if curr.left is not None:
                queue_.append(curr.left)
            if curr.right is not None:
                queue_.append(curr.right)
            
            if curr.left is not None and curr.right is not None:
                count_ += 1
        return count_

    def checkStructureIndentical(self, root1, root2):
        if root1 is None and root2 is None:
            return True
        if root1 is None or root2 is None:
            return False

        left_check = self.checkStructureIndentical(root1.left, root2.left)
        right_check = self.checkStructureIndentical(root1.right, root2.right)

        if (not left_check) or (not right_check):
            return False
        
        return True
    
    def diameter(self, root):
        if root is None:
            return 0,0
        
        left_diameter, left_height = self.diameter(root.left)
        right_diameter, right_height = self.diameter(root.right)

        current_diameter = left_height + right_height + 1

        height = max(left_height, right_height) + 1

        max_diameter = max(left_diameter, right_diameter)
        max_diameter = max(max_diameter, current_diameter)

        return max_diameter, height

if __name__ == '__main__':
    tree = BinaryTree()
    root = tree.create_tree()
    # root2 = tree.create_tree()
    # tree.print_tree(root)
    # print(TreeUse.findheightrecursive(root))
    # print(TreeUse.findHeightStack(root))
    # print(TreeUse.findHeightQueue(root))
    # print(TreeUse.findMinDepth(root))
    # print(TreeUse.findDeepestNode(root))
    # root = TreeUse.deleteNode(3, root)
    # tree.print_tree(root)
    # print(TreeUse.numberOfLeaves(root))
    # print(TreeUse.numberOfFullNodes(root))
    treeUse = TreeUse()
    # print(treeUse.checkStructureIndentical(root1, root2))
    print(treeUse.diameter(root))