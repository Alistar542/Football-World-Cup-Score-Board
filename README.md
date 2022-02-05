# Football World Cup Score Board
A simple java application to create, update and display the score boards for the football game

### The board supports the following operations:

1. Start a game. When a game starts, it should capture (being initial score 0 – 0):
	a. Home team
	b. Away team
2. Finish game. It will remove a match from the scoreboard.
3. Update score. Receiving the pair score;home team score and away team score
   updates a game score.
4. Get a summary of games by total score. Those games with the same total score will
   be returned ordered by the most recently added to our system.
As an example, being the current data in the system:
    * Mexico - Canada: 0 - 5
    * Spain - Brazil: 10 – 2
    * Germany - France: 2 – 2
    * Uruguay - Italy: 6 – 6
    * Argentina - Australia: 3 - 1
### The summary would provide with the following information:
    1. Uruguay 6 - Italy 6
    2. Spain 10 - Brazil 2
    3. Mexico 0 - Canada 5
    4. Argentina 3 - Australia 1
    5. Germany 2 - France 2

* The entry point for this application is `ScoreBoard/src/main/java/ScoreBoard/ScoreBoard.java`

* The respective test classes can be found in `ScoreBoard/src/test/java/ScoreBoard/ScoreBoardTest.java`
* Test cases are only written for the major functionalities/features of the program.

Few assumptions are taken for this code to work properly:
```
1. This code does not consider all the inputs (such as wildcards,nulls,
    values of different data types than expected)
2. Code depends on the inputs given by the user
3. The code flow is as 
    a. Create a new scoreboard
    b. Update the scoreboard
    c. Finish the scoreboard
    d. Repeat the steps from a to c in that order as per the requirements
    e. Exit to see the summary of scores
    The code flow should be followed as in the way given above, otherwise the code can 
    given wrong results
4. The inputs should be given and not skipped, othewise there is a chance for failure. 
```
