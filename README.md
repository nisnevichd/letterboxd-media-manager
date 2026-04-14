# Media Review Manager

A Java project for tracking books and movies, including completion status, ratings, reviews, searching, and file saving/loading.

## Features

- Add books and movies
- Store shared media information using an abstract parent class
- Mark items as completed
- Add ratings and reviews
- Display all items
- Search by title
- Count completed items
- Find the highest-rated item
- Save media data to a text file
- Load media data from a text file

## Concepts Used

- Classes and objects
- Constructors
- Encapsulation
- Inheritance
- Abstract classes
- Method overriding
- Polymorphism
- ArrayLists
- Loops and conditionals
- File I/O
- Exceptions
- String parsing

## Project Structure

- `MediaItem.java` — abstract parent class for all media items
- `Book.java` — subclass representing books
- `Movie.java` — subclass representing movies
- `MediaManager.java` — manages the media collection and file operations
- `Main.java` — tests the program features

## Example File Format

```text
MOVIE,La La Land,2016,Chazelle,158,true,5,I wish I could watch this movie for the first time again
BOOK,The Secret History,1992,Tartt,559,false,0,
