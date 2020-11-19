"""
@Author: rishi
"""
# Import required modules
import random as rd


# Build List class
class List:
    # Creates random list
    @staticmethod
    def create_random_list(length=10):
        """
        :param length: length of the list
        :return: list of random numbers
        """
        return [rd.randint(0, length) for _ in range(length)]

    # Create random 2d list
    @staticmethod
    def create_random_2d_list(row_length=4, col_length=4):
        """
        :param row_length: row length of the list
        :param col_length: col length of the list
        :return: 2d list of random numbers
        """
        return [[rd.randint(0, 10) for _ in range(row_length)] for _ in range(col_length)]
