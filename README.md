# CRUDAPI
Java spring boot using API for (PUT DELETE GET POST)


# Student Package have every thing related to the student CRUD ops (Student(config - controller - repo - service)).

## 1 - Student
Has student data (id - name - email -dob), Getter and Setters.

## 2 - Student Config
Where I initialize my database with 2 records.

## 3 - Student Controller
Functions for: 

#### 1 - Get Students
#### 2 - Register New Students
#### 3 - Update Student (By Id)
#### 4 - Delete Student (By Id)
#### 5 - constructor with student services class which has the implementations of those functions 

## 4 - Student Repository ( Data Access Layer)
Interface class responsible for data access

## 5 - Student Service (Service Layer)
Class respoonsible for business logic

Note: The project runs on port 8091 you can change it from application.properties file
