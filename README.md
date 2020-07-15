# Wildlife Tracker
#### Wildlife Tracker, 
#### By **Ian Amuga**

## Description

```bash
An application that allows Rangers to track wildlife sightings in the area.
```
## Technologies Used
IntelliJ
Spark


## Installation
* `git clone <>` this repository
* `cd WildlifeTracker`

## SQL
```bash
1.Launch postgres
2.Type in psql
Run these commands
3. CREATE DATABASE wildlife_tracker;
4. \c wildlife_tracker;
5. CREATE TABLE animals (id serial PRIMARY KEY, name varchar, health varchar, age varchar, type varchar);
6. CREATE TABLE wildlife_tracker=# CREATE TABLE sightings (id serial PRIMARY KEY, animal_id int, location varchar, ranger_name varchar, timestamp timestamp);
7. CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;
```
## User Requirements
```bash
The applications allow users to do the following:
1.Add a new animal
2.Add an endangered animal
3.Add an animal Sighting

```

## Contact Details
```bash
You can contact me at amuga72@gmail.com
```

## License
- This project is licensed under the MIT Open Source license Copyright (c) 2020. 

