# Cameo/MagicDraw plugin development - Lesson 1

This is the first lession of how to develop a plugin for Cameo/MagicDraw. At the end of the lession you will have an environment and a very simple - hello world - example.

# Requirements

- Cameo/MagicDraw latest 
- Java JDK 11 
- Maven

# Usage

Check out the repository:

`git clone https://github.com/modeldriven-hu/cameo_lesson_1.git`

Configure Cameo/MagicDraw root directory according to local setup:

`set MAGICDRAW_ROOT=C:/home/Tools/Cameo`

Build project using maven:

`mvn package`

Extract `target/hu.modeldriven.cameo.lesson1.zip` into `CAMEO_ROOT/plugins`

Restart CAMEO