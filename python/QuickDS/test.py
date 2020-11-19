"""
@Author: rishi
"""

from QuickDS import *

# Test Linked list class
print("------LinkedList------")
array = [1, 2, 3, 4, 5]
pretty_print_llist(create_linked_list(array))
pretty_print_llist(create_random_linked_list(20))

# Test List class
print("------List------")
print(create_random_list(20))
print(create_random_2d_list(5, 5))

# Test inputformatter class
print("------InputFormatter------")
print(format_1d_int_list("{1, 2, 3}"))
print(format_1d_char_list("{'1', '2', '3'}"))
print(format_2d_int_list("{{1, 2, 3}, {4, 5, 6}}", 2, 3))
print(format_2d_char_list("{{'1', '2', '3'}, {'4', '5', '6'}}", 2, 3))
pretty_print_llist(format_linked_list("{1, 2, 3}"))
pretty_print_bst(format_bst("[3,1,4,null,2,null,5,null,null,null,null]"))

# Test BinarySearchTree class
print("------BST------")
r1 = convert_sorted_list_to_bst([1, 2, 3, 4, 5])
st = serialize(r1)
print(st)
r2 = deserialize(st)
r3 = create_random_binary_search_tree()
pretty_print_bst(r1)
pretty_print_bst(r3)
print_bst(r2)
