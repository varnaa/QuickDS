"""
@Author: rishi
"""


class TreeNode:
    def __init__(self, val):
        self.__val = val
        self.__left = None
        self.__right = None

    def get_val(self):
        return self.__val

    def get_left(self):
        return self.__left

    def get_right(self):
        return self.__right

    def set_val(self, val):
        self.__val = val

    def set_left(self, left):
        self.__left = left

    def set_right(self, right):
        self.__right = right

    def insert_node(self, val):
        # Check for root node is none
        if self is None:
            self = TreeNode(val)
            return
        else:
            if val == self.__val:
                return
            # Check val is less than root.val
            elif val < self.__val:
                if self.__left:
                    self.__left.insert_node(val)
                else:
                    self.__left = TreeNode(val)
                    return
            else:
                if self.__right:
                    self.__right.insert_node(val)
                else:
                    self.__right = TreeNode(val)
                    return
