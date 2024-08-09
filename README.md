# Java Self-Study Repository 📚💻

Welcome to my Java self-study repository! This repository documents my journey of learning and practicing Java, covering various beginner to advanced topics and exercises.

## Table of Contents 📑

- [Introduction](#introduction)
- [Topics Covered](#topics-covered)
- [Project Structure](#project-structure)
- [How to Use](#how-to-use)
- [Resources](#resources)
- [Contributing](#contributing)
- [License](#license)

## Introduction 🌟 <a name="introduction"></a>

 This repository contents what I have learned about the fundamentals of Java such as basic syntax, data types, variables, conditionals, functions, data structures, packages, etc. as part of my self-learning.

 As well of advanced topics such as Memory Management, Collection Framework, Serialization, etc.
 
 Most of the examples, exercises and problems are from GeeksforGeeks site. Others from different part of Internet.
 
 The guide followed for this repository has been the Java Developer roadmap topics from https://roadmap.sh/java

## Topics Covered 📝 <a name="topics-covered"></a>

- Fundamentals
    - Basic Syntax
    - Conditionals
    - Data Structures
    - Datatypes and variables
    - Exception handling
    - Loops
    - OOP
    - Package examples
- Advanced
    - Basics of threads
    - Collection framework
    - Generics
    - JVM
    - Networking and sockets
    - Serialization
    - Streams

## Project Structure 🗂️ <a name="project-structure"></a>

The repository is organized into folders, each representing a different topic or project. Here's a brief overview:

```bash

src/main/java/com/mycompany/java/
│  
├── advanced/
│   ├── basics-of-threads/
│       ├── MyThread.java
│       ├── MyThread1.java
│       ├── ThreadPriority.java
│       ├── ThreadState.java
│   ├── collection-framework/
│       ├── custom-data-structure/
│           ├── Main.java
│       ├── list-interface
│           ├── arraylist/
│               ├── TestJavaCollection1.java
│           ├── TestJavaCollection1.java
│       ├── set-interface
│           ├── TestJavaCollection1.java
│       ├── CustomIterator.java
│       ├── Main.java
│   ├── generics/  
│       ├── Test.java
│   ├── jvm/
│       ├── ClassLoaderExample.java
│       ├── Test.java
│       ├── TestGarbage1.java
│   ├── networking-and-sockets/
│       ├── Client.java
│       ├── Server.java
│   ├── serialization/
│       ├── Test.java
│   ├── streams/
│       ├── Demo.java
│       ├── JavaStreamExample.java
├── fundamentals/
│   ├── conditionals/
│       ├── Demo001.java
│       ├── Demo002.java
│       ├── NestedSwitch.java
│   ├── data-structures/
│       ├── arrays/
│           ├── coding-problems/
│               ├── level1/
│                   ├── Problem7.java
│                   ├── Problem8.java
│                   ├── Problem9.java
│                   ├── Problem10.java
│                   ├── ReverseArray.java
│                   ├── Sort012.java
│                   ├── SortArray.java
│                   ├── SortArrayWithoutArraysSort.java
│                   ├── SubarrayWithGivenSum.java
│           ├── ArrayExample.java
│           ├── Demo001.java
│       ├── graph/
│           ├── coding-problems/
│               ├── level1/
│                   ├── Problem1.java
│                   ├── Problem2.java
│                   ├── Problem3.java
│       ├── linked-list/
│           ├── coding-problems/
│               ├── flatten-linked-list/
│                   ├── FlattenLinkedList.java
│               ├── middle-of-linked-list/
│                   ├── MiddleOfLinkedList.java
│               ├── problem1/
│                   ├── Problem1.java
│               ├── problem2/
│                   ├── Problem2.java
│               ├── problem3/
│                   ├── LinkedList.java
│               ├── problem4/
│                   ├── Problem4.java
│               ├── problem5/
│                   ├── Problem5.java
│           ├── merge-sort/
│           ├── DLL.java
│           ├── LinkedList.java
│           ├── SinglyLinkedList.java
│       ├── queue/
│           ├── coding-problems/
│               ├── problem1/
│                   ├── GfG.java
│           ├── Queue.java
│           ├── QueueAsLinkedList.java
│       ├── stack/
│           ├── Stack.java
│           ├── StackAsLinkedList.java
│       ├── tree/
│           ├── binary-search-tree/
│               ├── BinarySearchTree.java
│           ├── binary-tree/
│               ├── deletion/
│                   ├── GFG.java
│                   ├── GFG2.java
│               ├── find-the-maximum-depth-or-height/
│                   ├── BinaryTree.java
│                   ├── GFG.java
│               ├── insertion/
│                   ├── GFG.java
│               ├── level-order-tree-traversal/
│                   ├── BinaryTree.java
│                   ├── BinaryTree1.java
│               ├── BinaryTree1.java
│               ├── BinaryTree2.java
│               ├── BinaryTree3.java
│               ├── Main.java
│               ├── coding-problems
│                   ├── level1
│                       ├── problem1/
│                           ├── BinaryTree.java
│                       ├── problem2/
│                           ├── BinaryTree.java
│                           ├── BinaryTree1.java
│                       ├── problem3/
│                           ├── BinaryTree.java
│                       ├── problem4/
│                           ├── BinaryTree.java
│                       ├── problem5/
│                           ├── BinaryTree.java
│           ├── Tree.java
│   ├── data-types-and-variables/
│       ├── Demo001.java
│       ├── Demo002.java
│   ├── exception-handling/
│       ├── Demo001.java
│       ├── Demo002.java
│       ├── Demo003.java
│       ├── SampleException.java
│   ├── loops/
│       ├── ForEachExample.java
│       ├── ForEachExample1.java
│       ├── ForExample.java
│       ├── ForExample1.java
│       ├── LabeledForExample.java
│       ├── LabeledForExample2.java
│       ├── NestedForExample.java
│       ├── PyramidExample.java
│       ├── PyramidExample2.java
│       ├── WhileExample1.java
│       ├── WhileExample2.java
│   ├── oop/
│       ├── abstraction/
│           ├── Main.java
│       ├── inheritance/
│           ├── Main.java
│           ├── Main3.java
│       ├── interfaces/
│           ├── gfg.java
│           ├── TestClass.java
│           ├── TestClass2.java
│       ├── polymorphism/
│           ├── Honda3.java
│       ├── Calculation.java
│       ├── Test.java
│       ├── TestClass.java
│       ├── TestClass3.java
│       ├── TestClass4.java
│   ├── package-examples/
│       ├── my-pack/
│           ├── B.java
│       ├── my-pack/
│           ├── A.java
│       ├── Simple.java
│       ├── StaticImportDemo.java
│   ├── BasicSyntax.java

```


## How to Use 🛠️ <a name="how-to-use"></a>

1. Clone the repository to your local machine using:
   ```bash
   git clone https://github.com/it-moisesmoreno/java.git
2. Navigate to the topic folder you are interested in.
3. Open the Java files in your preferred code editor to explore the examples and code.

## Resources 📚 <a name="resources"></a>

[GeeksForGeeks](https://www.geeksforgeeks.org/)

## Contributing 🤝 <a name="contributing"></a>

This repository is primarily for my personal learning, but if you'd like to contribute or provide suggestions, feel free to open an issue or submit a pull request.

## License 📜 <a name="license"></a>

This project is licensed under the MIT License. See the [LICENSE](https://github.com/it-moisesmoreno/html?tab=MIT-1-ov-file) file for more details.

Feel free to further customize it as needed!