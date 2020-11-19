# Quick DS

QuickDS is a library that contains a curated list of **Input Formatting** and **Input Generating Functions** that can be
used to **generate some commonly used Abstract data types** without having to write any code from scratch. This library
for was designed for the purposes of making competitive programming easy. Users can quickly convert **Serialized Input
formats into actual datastructures** to quickly test their code in local IDE

---

#### Available Languages:

* [Java](#Java-Version)
* [Python](#PYTHON)

# Java Version

---

### SETUP: Include the library in your project dependency

- [Link to library JAR File]()
- After Downloading the JAR File,
  - Open your Project Module Settings.
  - Go to Dependencies and include the JAR

![image](https://github.com/varnaa/QuickDS/blob/varnaa/java/screenshots/ss1.png)

---

### DOCUMENTATION

* Import the class ***Quickds*** from the added jar file. From this class users can access all the functions this
  library has to offer. See [Examples](###Examples:)

![image](https://github.com/varnaa/QuickDS/blob/varnaa/java/screenshots/ss2.png)

## Examples:

---

### I. [Input Generating Functions](#1arrays)

### II. [Input Formatting Functions](#2input-formatting-functions)

### III. [Pretty Print Functions]()

----------------------------------------------------

### 1.Arrays:

- Default Size: 10.
  - **Generates Random 1d and 2d Array inputs**

    `int[] array = quickds.createRandom1dArray();`

    `int[][] array = quickds.createRandom2dArray();`

  - **Generate Custom 1d and 2d Array inputs**

    `int[] array = quickds.createCustom1dArray(size: 25);`

    `int[][] array = quickds.createCustom2dArray(rowLength: 5, colLength: 5);`

---

### 2.Linked Lists

- Default Size: 10
- Note: **Import Node** class from the JAR file.
  - **Generates Random Linked List inputs**

    `Node head = quickds.createRandomLinkedList();`

  - **Generate Custom Linked List inputs**

    `Node head = quickds.createCustomLinkedList(Length: 12);`

---

### 3.Binary Search Tree

- Default No:of nodes: 23.
- Note: **Import TreeNode** class from the JAR file.
  - **Generates Random BST inputs**

    `TreeNode root = quickds.createRandomBST();`

  - **Generate Custom BST inputs**

    `TreeNode root = quickds.createCustomBST(Number Of Nodes: 15);`

---
    
## 2.Input Formatting Functions:

#### 1. Arrays: 
1. String to Array </br>
![image](https://github.com/varnaa/QuickDS/blob/varnaa/java/screenshots/array1d.png)

---

2. String to 2d int Array
![image](https://github.com/varnaa/QuickDS/blob/varnaa/java/screenshots/2dInt.png)

---

3. String to 2d char Array
![image](https://github.com/varnaa/QuickDS/blob/varnaa/java/screenshots/2dCharArray.png)

---

#### 2. LinkedList:
1. Array to Linked List </br> 
![Array to LL](https://github.com/varnaa/QuickDS/blob/varnaa/java/screenshots/arrayLL.png)

---

2. String to Linked List
![String to LL](https://github.com/varnaa/QuickDS/blob/varnaa/java/screenshots/StringLL.png)

---









      

