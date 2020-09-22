"""
@Author: rishi
"""

from python.implementations.inputformatter.inputformatter import InputFormatter
# Import required modules
from python.implementations.linkedlist.linkedlist import LinkedList
from python.implementations.list.list import List

# Main functions for linked list class
linkedlist_obj = LinkedList()


# Create linked list from array
def create_linked_list(array):
    """
    :param array: list of integers
    :return: head node of linked list
    """
    return linkedlist_obj.create_linked_list(array)


# Create random linked list
def create_random_linked_list(length=10):
    """
    :param length: length of the linked list and range of the items in linked list
    :return: head of linked list
    """
    return linkedlist_obj.create_random_linked_list(length)


# Print linked list
def pretty_print(head):
    """
    :param head: head node of the linked list to be printed
    """
    linkedlist_obj.pretty_print(head)


# Main functions for list class
list_obj = List()


# Creates random list
def create_random_list(length=10):
    """
    :param length: length of the list and range of the items in list
    :return: random list
    """
    return list_obj.create_random_list(length)


# Creates 2d random list
def create_random_2d_list(length=10):
    """
    :param length: length of the list and range of the items in list
    :return: random 2d list
    """
    return list_obj.create_random_2d_list(length)


# Main functions for list class
input_formatter_obj = InputFormatter()


# Formats 1d char array
def format_1d_char_list(inp):
    """
    :param inp: string with 1d char array
    :return: 1d list
    """
    return input_formatter_obj.format_1d_char_list(inp)


# Formats 1d int array
def format_1d_int_list(inp):
    """
    :param inp: string with 1d int array
    :return: 1d list
    """
    return input_formatter_obj.format_1d_int_list(inp)


# Formats 2d int array
def format_2d_int_list(inp, row_length, col_length):
    """
    :param inp: string with 2d int array
    :param row_length: length of the 2d array rows
    :param col_length: length of the 2d array columns
    :return: 2d list
    """
    return input_formatter_obj.format_2d_int_list(inp, row_length, col_length)


# Formats 2d char array
def format_2d_char_list(inp, row_length, col_length):
    """
    :param inp: string with 2d int array
    :param row_length: length of the 2d array rows
    :param col_length: length of the 2d array columns
    :return:
    """
    return input_formatter_obj.format_2d_char_list(inp, row_length, col_length)


# Formats linked list
def format_linked_list(inp):
    """
    :param inp: string with int array
    :return: head node of linked list
    """
    return input_formatter_obj.format_linked_list(inp)
