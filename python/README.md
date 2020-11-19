# QuickDS - Python

## Installation
Install and update using [pip](https://pypi.org/project/QuickDS/)

```pip install -U QuickDS```

## Example
```python
import QuickDS

print(QuickDS.create_random_list())
```

## Documentation
- Linked List
  - create_linked_list(array)  
    creates a linked list from an array  
    **Input**  : array  
    **Output** : Head of linked list  
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/create_linked_list.PNG)
    
  - create_random_linked_list(length = 10)  
    creates a random linked list of given length as range  
    **Input**  : length = 10 (optional)  
    **Output** : Head of linked list
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/create_random_linked_list.PNG)
    
  - pretty_print_llist(head)  
    prints a linked list in viewable format instead of address  
    **Input**  : Head node of the linked list    
    **Output** : Prints the linked list  
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/pretty_print_llist.PNG)
    
- List  
  - create_random_list(length = 10)  
    creates random list of given length  
    **Input**  : length = 10 (optional)  
    **Output** : list  
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/create_random_list.PNG)
    
  - create_random_2d_list(row_length = 4, col_length = 4)  
    creates random 2d list with given row and column sizes  
    **Input**  : row_length = 4 (optional), col_length = 4 (optional)  
    **Output** : 2d list  
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/create_random_2d_list.PNG)
    
- Input Formatter
  - format_1d_char_list(inp)  
    formats char string to list  
    **Input**  : string with 1d char array     
    **Output** : list
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/format_1d_char_list.PNG)
    
  - format_1d_int_list(inp)  
    formats char string to list  
    **Input**  : string with 1d int array  
    **Output** : list  
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/format_1d_int_list.PNG)
    
  - format_2d_char_list(inp, row_length, col_length)  
    formats 2d char string to 2d list  
    **Input**  : string, row_length, column_length  
    **Output** : 2d list  
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/format_2d_char_list.PNG)
    
  - format_2d_int_list(inp, row_length, col_length)  
    formats 2d int string to 2d list  
    **Input**  : string, row_length, column_length  
    **Output** : 2d list
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/format_2d_int_list.PNG)
    
  - format_linked_list(inp)  
    formats string array to linked list  
    **Input**  : string  
    **Output** : Head of linked list
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/format_linked_list.PNG)
    
  - format_bst(inp)  
    formats string array to binary search tree  
    **Input**  : string  
    **Output** : Root node of BST  
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/format_bst.PNG)
    
- BST
  - create_random_binary_search_tree(no_of_nodes = 10)  
    create random binary search tree with given number of nodes  
    **Input**  : no_of_nodes = 10 (optional)  
    **Output** : Root node of BST
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/create_random_binary_search_tree.PNG)
    
  - convert_sorted_list_to_bst(array)  
    Converts sorted list to binary search tree  
    **Input**  : sorted array  
    **Output** : Root node of BST
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/convert_sorted_list_to_bst.PNG)
    
  - serialize(root)  
    Converts binary search tree to string of level order traversal  
    **Input**  : root  
    **Output** : Root node of BST  
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/serialize.PNG)
    
  - deserialize(inp) 
    Converts string of level order traversal to binary search tree   
    **Input**  : encoded string  
    **Output** : Root node of BST
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/deserialize.PNG)
    
  - pretty_print_bst(root)  
    prints binary search tree in viewable format  
    **Input**  : Root  
    **Output** : prints BST
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/pretty_print_bst.PNG)

  - print_bst(root)  
    prints inorder of binary search tree
    **Input**  : Root  
    **Output** : prints inorder of the BST
    [](https://github.com/varnaa/QuickDS/blob/rishiraj/python/Screenshots/print_bst.PNG)


## License

This repository is Licensed under the MIT License.
See LICENSE for more details.
