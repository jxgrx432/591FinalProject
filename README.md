# 591FinalProject
Final Project for 591

This project was developed by Christine Huang, Calvary Rogers, and John Griffin. Our UPenn TA is Xunjing Wu.

This application generates a user customized recommended music playlist based on the user selecting a number of parameters. Based on the user input, the application intelligently selects songs from a Spotify database and generates a playlist. 

The application is developed in Java and utilizes the JavaFX graphic library.

A summary of CRCs are below for reference:

(1) Class: InfoReader

- Responsibilities: 
  - Read in music data from csv file and store data into relevant data structures for program use
  
- Collaborators:
  - DataAnalysis
  
(2) Class: DataAnalysis
  
- Responsibilities: 
  - Generate descriptive statistics of song data
  - Create customized playlist based on user input preferences
  
- Collaborators:
  - InfoReader
  - UserInput
  
(3) Class: Song

- Responsibilities: 
  - Represent individual song data
  
- Collaborators:
  - InfoReader
  - DataAnalysis
  
(4) Class: SongRepository

- Responsibilities: 

- Collaborators:

(5) Class: MainDisplay

- Responsibilities: 
  - Create and display main JavaFX GUI to user
  
- Collaborators:
  - UserInput
  - UserInstructions
  - UserPlaylist
  
(6) Class: UserInput

- Responsibilities: 
  - Store user input preferences for desired playlist characteristics (e.g. sony energy, playlist length, etc.)
  - Generate userinput JavaFX graphic elements 

- Collaborators:
  - MainDisplay
  - DataAnalysis
  
(7) Class: UserInstructions

- Responsibilities:
 - Store user instructions that will be displayed to user during program 
 - Generate user instruction JavaFX graphic elements
 
- Collaborators:
  - MainDisplay
  
(8) Class: UserPlaylist

- Responsibilities: 
  - Take playlist data and format it for display to the user
  - Generate userplaylist JavaFX graphic elements
  
- Collaborators:
  - DataAnalysis
  - MainDisplay
  
(9) Class: MainProgram

- Responsibilities: 
  - Execute main method
  
- Collaborators:
  - All
