"""
@Author: rishi
"""

# Import required modules
import QuickDS.implementations.linkedlist as llist
import QuickDS.implementations.binarysearchtree as bst


# Class to build InputFormatter
class InputFormatter:
    # Returns matrix from string
    @staticmethod
    def __matrix_from_string(inp, row_length, col_length):
        """
        :param inp: string
        :param row_length: row length of matrix
        :param col_length: column length of matrix
        :return: matrix
        """

        # Split string into char array
        inp = inp.split(",")

        # Declare 2d matrix
        matrix = [[0] * col_length for _ in range(row_length)]

        ind = 0  # Index variable to traverse inp array

        for i in range(row_length):
            for j in range(col_length):
                matrix[i][j] = int(inp[ind])
                ind += 1
        return matrix

    # Formats 1d int array
    @staticmethod
    def format_1d_int_list(inp):
        """
        :param inp: string with 1d int array
        :return: 1d list
        """
        inp = inp.replace("{", "").replace("}", "")
        inp = inp.replace("[", "").replace("]", "")
        inp = inp.split(",")
        # convert char list to int list
        return list(map(lambda a: int(a), inp))

    # Formats 1d char array
    @staticmethod
    def format_1d_char_list(inp):
        """
        :param inp: string with 1d char array
        :return: 1d list
        """
        inp = inp.replace("{", "").replace("}", "").replace("'", "")
        inp = inp.replace("[", "").replace("]", "")
        inp = inp.split(",")
        # convert char list to int list
        return list(map(lambda a: int(a), inp))

    # Formats 2d int array
    @staticmethod
    def format_2d_int_list(inp, row_length, col_length):
        """
        :param inp: string with 2d int array
        :param row_length: length of the 2d array rows
        :param col_length: length of the 2d array columns
        :return: 2d list
        """
        inp = inp.replace("{", "").replace("}", "")
        inp = inp.replace("[", "").replace("]", "")
        return InputFormatter.__matrix_from_string(inp, row_length, col_length)

    # Formats 2d char array
    @staticmethod
    def format_2d_char_list(inp, row_length, col_length):
        """
        :param inp: string with 2d int array
        :param row_length: length of the 2d array rows
        :param col_length: length of the 2d array columns
        :return: 2d list
        """
        inp = inp.replace("{", "").replace("}", "").replace("'", "")
        inp = inp.replace("[", "").replace("]", "")
        return InputFormatter.__matrix_from_string(inp, row_length, col_length)

    # Formats linked list
    @staticmethod
    def format_linked_list(inp):
        """
        :param inp: string with int array
        :return: head node of linked list
        """
        inp = InputFormatter.format_1d_int_list(inp)
        return llist.LinkedList().create_linked_list(inp)

    # Formats BST
    @staticmethod
    def format_bst(inp):
        """
        :param inp: input string
        :return: root node of the tree
        """
        inp = inp.replace("[", "").replace("]", "")
        inp = inp.replace("{", "").replace("}", "")
        if len(inp) == 0:
            return None
        return bst.BinarySearchTree().deserialize(inp)
