"""
@Author: rishi
"""

import python.main as main_

# Test Linked list class
print("------LinkedList------")
array = [1, 2, 3, 4, 5]
main_.pretty_print(main_.create_linked_list(array))
main_.pretty_print(main_.create_random_linked_list(20))

# Test List class
print("------List------")
print(main_.create_random_list(20))
print(main_.create_random_2d_list(5))

# Test inputformatter class
print("------InputFormatter------")
print(main_.format_1d_int_list("{1, 2, 3}"))
print(main_.format_1d_char_list("{'1', '2', '3'}"))
print(main_.format_2d_int_list("{{1, 2, 3}, {4, 5, 6}}", 2, 3))
print(main_.format_2d_char_list("{{'1', '2', '3'}, {'4', '5', '6'}}", 2, 3))
main_.pretty_print(main_.format_linked_list("{1, 2, 3}"))
main_.pretty_print_bst(main_.format_bst("[3,1,4,#,2,#,5,#,#,#,#]"))

# Test BinarySearchTree class
print("------BST------")
r = main_.convert_level_order_traversal_to_bst([3, 1, 4, 2, 5])
main_.pretty_print_bst(r)
r1 = main_.convert_sorted_list_to_bst([1, 2, 3, 4, 5])
st = main_.serialize(r1)
print(st)
r2 = main_.deserialize(st)
r3 = main_.create_random_binary_search_tree()
main_.pretty_print_bst(r1)
main_.pretty_print_bst(r3)
main_.print_bst(r2)
