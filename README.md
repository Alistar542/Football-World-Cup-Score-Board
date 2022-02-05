# Football World Cup Score Board
A simple java application to create, update and display the score boards for the football game

* The entry point for this application is `ScoreBoard/src/main/java/ScoreBoard/ScoreBoard.java`

* The respective test classes can be found in `ScoreBoard/src/test/java/ScoreBoard/ScoreBoardTest.java`
* Test cases are only written for the major functionalities/features of the program.

Few assumptions are taken for this code to work properly:
```
1. This code does not consider all the inputs (such as wildcards,nulls,values of different data types than expected)
2. Code depends on the inputs given by the user
3. The code flow is as 
    a. Create a new scoreboard
    b. Update the scoreboard
    c. Finish the scoreboard
    d. Repeat the steps from a to c in that order as per the requirements
    e. Exit to see the summary of scores
    The code flow should be followed as in the way given above, otherwise the code can given wrong results
4. The inputs should be given and not skipped, othewise there is a chance for failure. ```
