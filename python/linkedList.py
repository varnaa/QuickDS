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


class LinkedList:
    # Constructor
    def __init__(self):
        self.__head = None

    # Getter for head node
    def get_head(self):
        return self.__head

    # Creates and inserts node into the linked list
    def insert_node(self, val):
        """
        :param val: value of the Node to be created
        """

        # if head Node is none then create the head Node with the value
        if self.__head is None:
            self.__head = Node(val)

        else:
            # create a copy of head Node
            temp = self.__head

            # traverse the available linked list
            while temp.get_next() is not None:
                temp = temp.get_next()

            # Add Node at the end of linked list
            temp.set_next(val)


# Prints the linked list
def print_linked_list(headnode):
    """
    :param headnode: Head Node of linked list class instance
    """

    __str = ""
    head = headnode

    while head is not None:
        __str += str(head.get_val())
        head = head.get_next()
    print(__str)


# Creates a linked list with the values in array
def create_linked_list(array):
    """
    :param array: iterable that specifies the values of linked list to be created
    :return: On success returns head node of linked list
    """

    # Create an linked list object
    obj = LinkedList()

    # Traverse the array
    for i in array:
        obj.insert_node(i)

    # Return success
    head = obj.get_head()
    print_linked_list(head)
    return head
