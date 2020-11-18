"""
@Author: rishi
"""
# Import required modules
import random

from .node import Node


# Build linked list class
class LinkedList:
    # Constructor
    def __init__(self):
        self.__head = None

    # Getter for head node
    def get_head(self):
        return self.__head

    # Check whether the linked list is empty
    def is_empty(self):
        return self.get_head() is None

    # Creates and inserts node into the linked list
    def insert_node(self, val):
        """
        :param val: value of the Node to be created
        """

        # if head Node is none then create the head Node with the value
        if self.is_empty():
            self.__head = Node(val)

        else:
            # create a copy of head Node
            temp = self.get_head()

            # traverse the available linked list
            while temp.get_next() is not None:
                temp = temp.get_next()

            # Add Node at the end of linked list
            temp.set_next(val)

    # Prints the linked list
    @staticmethod
    def pretty_print(headnode):
        """
        :param headnode: Head Node of linked list class instance
        """

        __str = ""
        head = headnode

        while head is not None:
            __str += str(head.get_val()) + "->"
            head = head.get_next()
        __str += "None"
        print(__str)

    # Creates a linked list with the values in array
    def create_linked_list(self, array):
        """
        :param array: iterable that specifies the values of linked list to be created
        :return: On success returns head node of linked list
        """

        # Traverse the array
        for i in array:
            self.insert_node(i)

        # Return success
        head = self.get_head()
        return head

    # Creates random linked list
    @staticmethod
    def create_random_linked_list(length=10):
        """
        :param length: length and range of the linked list
        :return: head node of the linked list

        """
        obj = LinkedList()
        for i in range(length):
            obj.insert_node(random.randint(1, length))
        return obj.get_head()
