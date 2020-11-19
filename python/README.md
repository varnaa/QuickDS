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
    **Input**  : array  
    **Output** : Head of linked list
    
  - create_random_linked_list(length = 10)  
    **Input**  : length = 10 (optional)  
    **Output** : Head of linked list
    
  - pretty_print_llist(head)  
    **Input**  : Head node of the linked list  
    **Output** : Prints the linked list
    
- List  
  - create_random_list(length = 10)  
    **Input**  : length = 10 (optional)  
    **Output** : list
    
  - create_random_2d_list(row_length = 4, col_length = 4)  
    **Input**  : row_length = 4 (optional), col_length = 4 (optional)  
    **Output** : 2d list  
    
- Input Formatter
  - format_1d_char_list(inp)  
    **Input**  : string with 1d char array     
    **Output** : list
    
  - format_1d_int_list(inp)  
    **Input**  : string with 1d int array  
    **Output** : list  
    
  - format_2d_char_list(inp, row_length, col_length)  
    **Input**  : string, row_length, column_length  
    **Output** : 2d list
    
  - format_2d_int_list(inp, row_length, col_length)  
    **Input**  : string, row_length, column_length  
    **Output** : 2d list
    
  - format_linked_list(inp)  
    **Input**  : string  
    **Output** : Head of linked list
    
  - format_bst(inp)  
    **Input**  : string  
    **Output** : Root node of BST
    
- BST
  - create_random_binary_search_tree(no_of_nodes = 10)  
    **Input**  : no_of_nodes = 10 (optional)  
    **Output** : Root node of BST
    
  - convert_sorted_list_to_bst(array)  
    **Input**  : sorted array  
    **Output** : Root node of BST
    
  - serialize(root)  
    **Input**  : root  
    **Output** : Root node of BST
    
  - deserialize(inp)  
    **Input**  : encoded string  
    **Output** : Root node of BST
    
  - pretty_print_bst(root)  
    **Input**  : Root  
    **Output** : prints BST

  - print_bst(root)  
    **Input**  : Root  
    **Output** : prints inorder of the BST


## License

This repository is Licensed under the MIT License.
See LICENSE for more details.
