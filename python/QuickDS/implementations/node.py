"""
@Author: rishi
"""


# Class to build Linked List nodes
class Node:
    # Constructor
    def __init__(self, val):
        self.__val = val
        self.__next = None

    # Getters ans Setters for Node class members
    def get_next(self):
        return self.__next

    def get_val(self):
        return self.__val

    def set_next(self, val):
        self.__next = Node(val)
