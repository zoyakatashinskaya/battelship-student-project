# Battelship (student project)
This is a student project for the Software construction course.

This game implements a user-computer Battleship play.

The following design patters are implemented:
* Singleton
* Observer
* Iterator

## Game flow
Here is how the output would look like:
```
Welcome to Battleship!!!

Please enter the position of your Carrier (6 fields): 
E9 J9
Please enter the position of your BattleShip 1 (4 fields): 
A2 A5
<...>
Please enter the position of your Patrol boat  3 (2 fields): 
F5 F6
Please enter the position of your Patrol boat  4 (2 fields): 
J2 J3
```

```
Your board is: 

   |[A][B][C][D][E][F][G][H][I][J]
---|------------------------------
[0]|[P][P][ ][S][ ][ ][B][B][B][B]
[1]|[ ][ ][ ][S][ ][ ][ ][ ][ ][ ]
[2]|[B][ ][ ][S][ ][S][S][S][ ][P]
[3]|[B][ ][ ][ ][ ][ ][ ][ ][ ][P]
[4]|[B][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[5]|[B][ ][ ][ ][ ][P][ ][ ][ ][S]
[6]|[ ][ ][ ][ ][ ][P][ ][ ][ ][S]
[7]|[P][P][ ][ ][ ][ ][ ][ ][ ][S]
[8]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[9]|[ ][ ][ ][ ][C][C][C][C][C][C]

The opponent's board is:

   |[A][B][C][D][E][F][G][H][I][J]
---|------------------------------
[0]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[1]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[2]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[3]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[4]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[5]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[6]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[7]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[8]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[9]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]

Your scoreboard:
- Player remaining boats: 10
- Enemy boats destroyed: 0

Enter the position you want to attack: 
```

```
Your board is: 

   |[A][B][C][D][E][F][G][H][I][J]
---|------------------------------
[0]|[P][P][ ][S][ ][ ][B][B][B][B]
[1]|[ ][ ][ ][S][ ][ ][ ][ ][ ][ ]
[2]|[B][ ][ ][S][ ][S][S][S][ ][P]
[3]|[B][ ][ ][ ][ ][ ][ ][ ][ ][P]
[4]|[B][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[5]|[B][ ][ ][ ][ ][P][ ][ ][ ][S]
[6]|[ ][ ][ ][ ][ ][P][ ][ ][ ][S]
[7]|[P][P][ ][ ][ ][ ][ ][ ][ ][S]
[8]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[9]|[ ][ ][ ][ ][C][C][C][C][C][C]

The opponent's board is:

   |[A][B][C][D][E][F][G][H][I][J]
---|------------------------------
[0]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[1]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[2]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[3]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[4]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[5]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[6]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[7]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[8]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[9]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]

Your scoreboard:
- Player remaining boats: 10
- Enemy boats destroyed: 0

Enter the position you want to attack: 
H4
You destroyed a Carrier  (0 fields)
The computer attacks position: D5
The computer missed

Your board is: 

   |[A][B][C][D][E][F][G][H][I][J]
---|------------------------------
[0]|[P][P][ ][S][ ][ ][B][B][B][B]
[1]|[ ][ ][ ][S][ ][ ][ ][ ][ ][ ]
[2]|[B][ ][ ][S][ ][S][S][S][ ][P]
[3]|[B][ ][ ][ ][ ][ ][ ][ ][ ][P]
[4]|[B][ ][ ][ ][ ][ ][O][ ][ ][ ]
[5]|[B][O][ ][O][ ][X][ ][ ][ ][S]
[6]|[ ][ ][ ][ ][ ][P][ ][ ][ ][S]
[7]|[P][P][ ][ ][ ][ ][ ][O][ ][S]
[8]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[9]|[ ][O][ ][ ][C][C][C][C][C][C]

The opponent's board is:

   |[A][B][C][D][E][F][G][H][I][J]
---|------------------------------
[0]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[1]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[2]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[3]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[4]|[ ][ ][C][C][C][C][C][C][ ][ ]
[5]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[6]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[7]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[8]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
[9]|[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]

Your scoreboard:
- Player remaining boats: 10
- Enemy boats destroyed: 1
<...>
```

## Input gor users battleships
```
E9 J9 - Carrier
A2 A5 - BattleShip
G0 J0 - BattleShip
D0 D2 - submarine
F2 H2 - submarine
J5 J7 - submarine
A0 B0 - Patrol boat
A7 B7 - Patrol boat
F5 F6 - Patrol boat
J2 J3 - Patrol boat
```
