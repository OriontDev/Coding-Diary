# Linked List in C

This document explains the implementation of a singly linked list in C. Below are the key components and concepts used in the provided code.

## Key Concepts and Terminology

### Node
A **node** is a fundamental unit of a linked list. Each node contains:
- **Data**: The actual value stored in the node (e.g., integers in this example).
- **Pointer (next)**: A reference to the next node in the list. If it's the last node, this pointer is `NULL`.

### Head
The **head** is a pointer that represents the start of the linked list. It points to the first node. If the linked list is empty, the head is `NULL`.

### `malloc`
`malloc` is a function from the `<stdlib.h>` library used to allocate memory dynamically at runtime. In this code, `malloc` is used to allocate memory for each new node.

```c
Node* newNode = (Node*)malloc(sizeof(Node));
```
- `sizeof(Node)` determines the memory size needed for a node.
- If memory allocation fails, `malloc` returns `NULL`.

## Functions Explained

### 1. `createNode`
This function creates a new node, initializes it with the provided data, and sets the `next` pointer to `NULL`.

#### Code:
```c
Node* createNode(int data) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    if (!newNode) {
        printf("Memory allocation failed\n");
        exit(1);
    }
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}
```
#### Purpose:
- To allocate memory for a node.
- To initialize the node with data and set its `next` pointer to `NULL`.

### 2. `appendNode`
This function adds a new node to the end of the linked list.

#### Code:
```c
void appendNode(Node** head, int data) {
    Node* newNode = createNode(data);
    if (*head == NULL) {
        *head = newNode;
    } else {
        Node* temp = *head;
        while (temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = newNode;
    }
}
```
#### Purpose:
- To handle two cases:
  1. Adding the first node to an empty list.
  2. Adding a node to the end of a non-empty list.
- To traverse the list and find the last node, then link it to the new node.

### 3. `printList`
This function prints the linked list by traversing through the nodes.

#### Code:
```c
void printList(Node* head) {
    Node* temp = head;
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}
```
#### Purpose:
- To display all the node values in the linked list.
- Ends with `NULL` to indicate the end of the list.

### 4. `freeList`
This function frees all the allocated memory for the linked list.

#### Code:
```c
void freeList(Node* head) {
    Node* temp;
    while (head != NULL) {
        temp = head;
        head = head->next;
        free(temp);
    }
}
```
#### Purpose:
- To prevent memory leaks by releasing the memory allocated for each node.

### Main Function
#### Code:
```c
int main() {
    Node* head = NULL;

    // Adding nodes to the linked list
    appendNode(&head, 10);
    appendNode(&head, 20);
    appendNode(&head, 30);
    appendNode(&head, 40);

    // Printing the linked list
    printf("Linked List: ");
    printList(head);

    // Freeing the allocated memory
    freeList(head);

    return 0;
}
```
#### Purpose:
- Demonstrates creating and using a linked list.
- Adds nodes with data `10`, `20`, `30`, and `40`.
- Prints the linked list.
- Frees the memory used by the linked list.

## Summary
This implementation provides the following:
1. A basic structure for a singly linked list.
2. Functions for creating nodes, adding nodes, printing the list, and freeing memory.
3. Use of dynamic memory allocation with `malloc` to manage memory efficiently.
