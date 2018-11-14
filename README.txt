Part 1

Your task is to implement Conway's Game of Life in Java
You have 2 hours and are allowed to use any resources you can, except for downloading an
already implemented version.
If you cannot finish within the 2 hours limit then no worries, we will evaluate your code based on
many factors such as: data structure choices, code quality, readability, your thinking on the
problem-space, etc.
The rules of the game are:

The game consists of a 10 x 10 grid and behaves as follows:
1) Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
2) Any live cell with more than three live neighbours dies, as if by overcrowding.
3) Any live cell with two or three live neighbours lives on to the next generation.
4) Any dead cell with exactly three live neighbours becomes a live cell.
Your implementation should have a starting state and be able to calculate the state after the next
generation.
For output you can just write the 10x10 grid to the console.

Part 2
When sending the code to us, write a short explanation of the choices you made when designing
your solution and why you made those choices.
Include how you would add unit tests for code like this.


The game has the following rules:

1 - Choose the size of grid: 
class Game variable sizeOfGrid (MxM) Ex: sizeOfGrid: 2 (2x2) or 3 (3x3) ...

2 -Shows the cells that were created.

3 - The 4 rules for each cell are applied.

4 - Shows the result of the game.
