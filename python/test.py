"""
@Author: rishi
"""

import python.main as main_

# Test Linked list class
array = [1, 2, 3, 4, 5]
main_.pretty_print(main_.create_linked_list(array))
main_.pretty_print(main_.create_random_linked_list(20))

# Test List class
print(main_.create_random_list(20))
print(main_.create_random_2d_list(5))

# Test inputformatter class
print(main_.format_1d_int_list("{1, 2, 3}"))
print(main_.format_1d_char_list("{'1', '2', '3'}"))
print(main_.format_2d_int_list("{{1, 2, 3}, {4, 5, 6}}", 2, 3))
print(main_.format_2d_char_list("{{'1', '2', '3'}, {'4', '5', '6'}}", 2, 3))
print(main_.format_linked_list("{1, 2, 3}"))
