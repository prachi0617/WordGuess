# Word Guess Game Lab

Welcome to the Word Guess Game lab! This repository contains starter code for implementing a classic word guessing game (similar to "hangman") in either Java or Python.

## Game Overview

In this lab, you'll be implementing a word guessing game where:
- A secret word is chosen
- The player guesses letters one at a time
- Correct guesses reveal the letter's position(s) in the word
- Incorrect guesses count against the player
- The player wins by guessing all letters before running out of attempts
- The player loses if they make too many incorrect guesses

## Getting Started

Choose your preferred programming language and follow the instructions below:

### Java Version

Navigate to the `java/` directory to find:
- `WordGuess.java` - Main game class (empty, ready for implementation)
- `Person.java` - Player class with interface
- `PersonInterface.java` - Defines the contract for person objects
- Test files to verify your implementation

**To run Java tests:**
```bash
cd java
mvn test
```

### Python Version

Navigate to the `python/` directory to find:
- `wordguess.py` - Main game class (empty, ready for implementation)
- `person.py` - Player class implementation
- `person_interface.py` - Abstract base class for person objects
- Test files to verify your implementation

**To run Python tests:**
```bash
cd python
pip install -r requirements.txt
pytest
```

## Your Mission

1. **Implement the Person class** (if not already complete)
   - Store and manage player information (name, score, etc.)
   - Follow the interface contract

2. **Implement the WordGuess game class**
   - Create a word guessing game
   - Track guessed letters
   - Manage game state (wins, losses, current word progress)
   - Handle user input and game logic

3. **Add additional features** (optional)
   - Multiple difficulty levels
   - Word categories
   - Scoring system
   - Save/load game state

## Development Strategy: Start Small, Build Incrementally

Building a complete game can feel overwhelming, but the key to success is breaking it down into small, manageable pieces. Here's a proven approach that will help you build confidence while creating a working game:

### Phase 1: The Minimal Game Loop (Start Here!)
Begin with the simplest possible version - a game that runs but doesn't do much yet:
- Create a basic main method/function that prints "Welcome to Word Guess!"
- Add a simple loop that asks for input and echoes it back
- Include a way to quit (like typing 'quit')
- **Goal**: Get something running that you can interact with

This might seem trivial, but having a working program from day one is psychologically powerful and gives you a foundation to build upon.

### Phase 2: Add the Core Game State
Now add the essential data structures:
- Hard-code a simple word (like "HELLO")
- Create variables to track: the secret word, guessed letters, and wrong guess count
- Display the word with blanks for unguessed letters (like "H _ _ _ O")
- **Goal**: Show the game state visually, even if logic isn't complete

### Phase 3: Implement Basic Guessing
Add the core game mechanics one piece at a time:
- Accept single letter guesses
- Check if the letter is in the word
- Update the display to show correct guesses
- Count wrong guesses
- **Goal**: The fundamental guessing mechanism works

### Phase 4: Add Win/Lose Conditions
Implement game endings:
- Detect when all letters are guessed (win)
- End game after too many wrong guesses (lose)
- Display appropriate win/lose messages
- **Goal**: Complete games that have clear outcomes

### Phase 5: Polish and Enhance
Now that you have a working game, improve it:
- Add input validation (handle invalid inputs gracefully)
- Implement word selection (random words, categories)
- Add the Person class integration for player tracking
- Improve user interface and feedback
- **Goal**: A polished, user-friendly experience

### Why This Approach Works
This incremental approach offers several advantages:
- **Immediate feedback**: You always have something working to test
- **Confidence building**: Each small success motivates the next step
- **Easier debugging**: Problems are isolated to recent changes
- **Natural testing**: You can verify each piece works before moving on
- **Prevents overwhelm**: Complex problems become manageable chunks

Remember: professional developers work this way too! They build working prototypes first, then iterate and improve. Your first version doesn't need to be perfect - it just needs to work. You can always refactor and enhance later.

Start with Phase 1 today, and you'll be surprised how quickly you progress through the remaining phases.

## Testing Your Code

Both versions include starter tests to help verify your implementation. Make sure all tests pass before considering your implementation complete!

## Learning Objectives

By completing this lab, you will practice:
- Object-oriented programming principles
- Interface/abstract class implementation
- Game state management
- User input handling
- Test-driven development
- Code organization and structure

## Need Help?

- Review the existing test files to understand expected behavior
- Start with the Person class implementation
- Break the WordGuess game into smaller, manageable methods
- Test frequently to catch issues early

Happy coding! 🎮
