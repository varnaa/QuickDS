"""
@Author: rishi
"""


class Node:
    def __init__(self, val):
        self.val = val
        self.next = None


class linkedList:
    def __init__(self):
        self.head = None

    def __insertNode(self, val: object) -> object:
        """
        :param val: value of the Node to be created
        :return: Bool value
        """

        # if head Node is none then create the head Node with the value
        if self.head is None:
            self.head = Node(val)
            # Return success
            return True

        try:
            # create a copy of head Node
            temp = self.head

            # traverse the available linked list
            while temp.next is not None:
                temp = temp.next

            # Add Node at the end of linked list
            temp.next = Node(val)

            # Return success
            return True

        except:
            # return Failure
            return False

    # Creates a linked list with the values in array
    def createLinkedList(self, array: object) -> object:
        """
        :param array: iterable that specifies the values of linked list to be created
        :return: On success returns head node of linked list
        """
        # Traverse the array
        for i in array:
            if not self.__insertNode(i):
                # Return failure
                return False

        # Return success
        return self.head
