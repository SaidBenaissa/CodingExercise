# CodingExercise
Live Football World Cup Score Board

Coding Exercise Instructions
Please provide the implementation of the Live Football World Cup Score Board as a simple library or frontend application:
1. Please read and familiarise yourself with the guidelines below.
2. Please follow the guidelines to implement the task as per requirements described
   further down in this document.
   Guidelines
     
   • Keep it simple. Follow the requirements and try to implement the simplest solution you can think of that works. Do not forget about edge cases!
   
   • Use an in-memory store solution (for example just use collections to store the information you might require).

   • We are NOT looking for a REST API, command line application, a Web Service or Microservice. Just a simple library (or frontend application) implementation.
   
   • Focus on Quality. Use Test-Driven Development (TDD), pay attention to OO design, Clean Code and adherence to SOLID principles.
   
   • Approach. Code the solution according to your standards. Please share your solution with a link to a source control repository (e.g. GitHub, GitLab, BitBucket) as we would like you to see your progress (your commit history is important)
   
   • Add a README.md file where you can make notes of any assumption or things you would like to mention to us about your solution.
   
   • If the implementation is in a frontend language, then it must follow all the above guidelines and additionally you should apply the suggestions below:
   
       If it is written it in a specific UI framework or library then we would suggest writing the simplest component/s to serve the described functionality. Please do not spend time making it look good.
       
       If it is written in vanillaJavaScript or TypeScript then we would suggest implementing the solution as a simple library (without graphical user interface)

Task requirements
You are working in a sports data company, and we would like you to develop a new Live Football World Cup Scoreboard library (or frontend application) that shows all the ongoing matches and their scores.
The scoreboard supports the following operations:
1. Start a new game, assuming initial score 0 – 0 and adding it the scoreboard. This should capture following parameters:
   a. Home team
   b. Away team
2. Finish game currently in progress. This removes a match from the scoreboard.

4. Update score. This should receive a pair of absolute scores: home team score and
   away team score.
   
4. Get a summary of games in progress ordered by their total score. The games with the same total score will be returned ordered by the most recently started match in the scoreboard. 
5. For example, if following matches are started in the specified order and their scores respectively updated:
      
   a. Mexico 0 - Canada 5

      b. Spain 10 - Brazil 2

      c. Germany 2 - France 2

      d. Uruguay 6 - Italy 6

      e. Argentina 3 - Australia 1

      The summary should be as follows:

      Uruguay 6 - Italy 6

      Spain 10 - Brazil 2
   
      Mexico 0 - Canada 5
   
      Argentina 3 - Australia 1
   
      Germany 2 - France 2

