"""
@Author: rishi
"""

# Import required modules
import collections

from QuickDS.implementations.list import List
from QuickDS.implementations.treenode import TreeNode


# Build BST class
class BinarySearchTree:
    # Constructor
    def __init__(self):
        self.__root = None

    # Getters and Setters for root
    def get_root(self):
        return self.__root

    def set_root(self, root):
        self.__root = root

    # Check for root node is none
    def is_root(self):
        return self.__root is None

    # Insert a Node into BST
    def __insert(self, val):
        """
        :param val: value of the nodw to be inserted
        """
        if self.__root is None:
            self.__root = TreeNode(val)
        else:
            self.__root.insert_node(val)

    # Creates Random BST
    def create_random_binary_search_tree(self, length=10):
        """
        :param length: length of the array
        :return: root node of the random bst
        """
        # Create random array of given length
        arr = sorted(List.create_random_list(length))
        # Convert array to bst
        return self.convert_sorted_list_to_bst(arr, 0, length - 1)

    # Create sorted list to bst
    def convert_sorted_list_to_bst(self, arr, lower_bound, upper_bound):
        """
        :param arr: sorted list
        :param lower_bound: starting index value
        :param upper_bound: Ending index value
        :return: root node of the bst created
        """
        # Check whether lower_bound is less than upper_bound
        if upper_bound < lower_bound:
            return None
        else:
            # find middle index
            middle = lower_bound + (upper_bound - lower_bound) // 2

            # Create Node with middle index
            root = TreeNode(arr[middle])

            # Recurse to create nodes in left and right sub tree
            root.set_left(self.convert_sorted_list_to_bst(arr, lower_bound, middle - 1))
            root.set_right(self.convert_sorted_list_to_bst(arr, middle + 1, upper_bound))

            # Return root node of the tree
            return root

    # Convert BST to encoded string
    @staticmethod
    def serialize(root):
        """
        :param root: root node of the tree
        :return: encoded string
        """

        # If root is none return empty string
        if not root:
            return ''

        # Create a queue[FIFO] to store values
        q = collections.deque([root])
        res = []

        while q:
            node = q.popleft()
            # Add node value to array
            if node:
                res.append(str(node.get_val()))
                q.append(node.get_left())
                q.append(node.get_right())
            if not node:
                res.append('null')
        # Convert array to string and return
        return ','.join(res)

    # Convert encoded string to BST
    @staticmethod
    def deserialize(data):
        """
        :param data: serialized string
        :return: root node to bst
        """

        # If data is empty return none
        if not data:
            return None

        index = 1
        tem = data.split(',')
        root = TreeNode(tem[0])

        # Create queue to store values
        q = collections.deque([root])

        while q:
            node = q.popleft()

            # Add values to BST
            if tem[index] != 'null':
                node.set_left(TreeNode(tem[index]))
                q.append(node.get_left())
            index += 1
            if tem[index] != 'null':
                node.set_right(TreeNode(tem[index]))
                q.append(node.get_right())
            index += 1
        return root

    # Prints the bst in inorder(left_subtree->root->right_subtree)
    def inorder(self, root):
        """
        :param root: root node of the bst to be printed
        """

        # If root is not None
        if root:
            # Recurse left subtree
            self.inorder(root.get_left())
            # Print root value
            print(root.get_val(), end=" ")
            # Recurse right subtree
            self.inorder(root.get_right())

    # Prints the bst to view the tree
    def pretty_print(self, prefix, root, is_left):
        if root is not None:
            print(prefix + ("|-- " if is_left else "\\-- ") + str(root.get_val()))
            self.pretty_print(prefix + ("|   " if is_left else "    "), root.get_left(), True)
            self.pretty_print(prefix + ("|   " if is_left else "    "), root.get_right(), False)
