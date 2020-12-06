**Problem Statement**
Implement the class SubrectangleQueries which receives a rows x cols rectangle as a matrix of integers in the constructor and supports two methods:

```java
1. updateSubrectangle(int row1, int col1, int row2, int col2, int newValue)
```

Updates all values with newValue in the subrectangle whose upper left coordinate is (row1,col1) and bottom right coordinate is (row2,col2).

```java
2. getValue(int row, int col)
```

Returns the current value of the coordinate (row,col) from the rectangle.

**Solution**
The brute force approach would be to update the values during each update. This approach takes $O(mn)$ time during the update operation. The `getValue` operation takes $O(1)$ time.

The second solution stores all the updates into a list. Then during the `getValue` operation, iterate through each update, check if the element lies within the update boundary and return
the most recently updated value.
