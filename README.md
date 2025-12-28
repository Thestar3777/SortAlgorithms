# Quicksort Algorithm

A simple Java implementation of the Quicksort algorithm. This program sorts an array of integers using the divide-and-conquer strategy and tracks the total number of swaps performed during the sorting process.

## Features

* **Efficient Sorting:** Implements the classic Quicksort algorithm.
* **Performance Tracking:** Counts and displays the total number of swaps required to sort the array.
* **Visualization:** Prints the array state before and after sorting.

## Getting Started

### Prerequisites

You need the Java Development Kit (JDK) installed to compile and run this program.

### Compilation

Open your terminal or command prompt and run the following command to compile the code:

```bash
javac QuicksortAlgorithm.java
```

### Usage

Run the compiled program using the java command:

```bash
java QuicksortAlgorithm
```

### Example Output

```bash
When you run the program, it will display the initial array, the sorted array, and the swap count:

Before Sort: 
12 9 4 99 120 1 3 10 23 45 75 69 31 88 101 14 29 91 2 0 77 

After Quicksort: 
0 1 2 3 4 9 10 12 14 23 29 31 45 69 75 77 88 91 99 101 120 

Total # of swaps: <number_of_swaps>

```

### Code Structure

**main:** Initializes the dataset and orchestrates the sorting and printing.

**quicksort:** Recursively partitions the array and sorts the sub-arrays.

**swap:** Helper method to swap elements and increment the swapCount.

**printArray:** Utility method to print the array contents to the console.
