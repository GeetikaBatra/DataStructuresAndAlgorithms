class BinaryTreeNode(object):
    def __init__(self, data=None, left=None, right=None):

        self.data = data
        self.left = left
        self.right = right
    def get_data(self):
        return self.data

class BinaryTree():
    def create_tree(self):
        tree_q = list()
        root = int(input("Enter the root"))

        if root is None:
            raise Exception("Empty root")
            return

        root = BinaryTreeNode(data=root)
        tree_q.append(root)

        while(len(tree_q)>0):
            current_node = tree_q.pop(0)

            try:
                left_node = int(input("Enter the left node of {0}".format(current_node.data)))
            except:
                left_node = None
            if left_node is not None:
                left_node = BinaryTreeNode(left_node)
                current_node.left = left_node
                tree_q.append(left_node)
            try:
                right_node = int(input("Enter the right node of {0}".format(current_node.data)))
            except:
                right_node = None
            if right_node is not None:
                right_node = BinaryTreeNode(right_node)
                current_node.right = right_node
                tree_q.append(right_node)

        return root

    def print_tree(self, root):
        if root is None:
            print("Empty Tree")

        tree_q = [root]
        while(len(tree_q)>0):

            current_node = tree_q.pop(0)
            res_string ="{0}:".format(current_node.data)
            left_node = current_node.left
            right_node = current_node.right
            if left_node is not None:
                res_string  = res_string + " left : {0}".format(left_node.data)
                tree_q.append(left_node)
            if right_node is not None:
                tree_q.append(right_node)
                res_string  = res_string + " right : {0}".format(right_node.data)

            print(res_string)

if __name__ == '__main__':
    tree = BinaryTree()
    root = tree.create_tree()
    tree.print_tree(root)
   


