# Problem: Rescue Operation - The Last Exit

## Problem Statement
Following a massive earthquake, high-tech factory X partially collapsed, turning its internal structure into a complex maze. A rescue robot is deployed to determine the shortest path from its current position to a safe exit in order to transmit a rescue signal for the trapped victims.

The factory is modeled as a 2D grid of size $N \times M$. The robot can move to 4 adjacent cells (Up, Down, Left, Right) if the target cell is not blocked by an obstacle. Help the robot find the minimum number of steps required to reach the exit.

## Input Format
- The first line contains two integers $N$ and $M$ ($1 \le N, M \le 1000$) - the dimensions of the factory.
- The next $N$ lines, each containing $M$ characters, represent the factory map:
    - `S`: The robot's starting position (Start).
    - `E`: The exit position (Exit).
    - `#`: Obstacle (collapsed walls, fire, impassable).
    - `.`: Empty path (passable).

## Output Format
- A single integer representing the minimum number of steps from `S` to `E`.
- If no valid path exists, print `-1`.

## Constraints
- $1 \le N, M \le 1000$
- The total number of cells in the grid is at most 1,000,000.
- Time Limit: 1.0 second.
- Memory Limit: 256 MB.

## Sample Test Cases

### Sample 1
**Input:**
5 5
S . . # .
# # . # .
. . . . .
. # # # .
. . . . E

**Output:**
8

### Sample 2
**Input:**
3 3
S # .
# # .
. . E

**Output:**
-1
