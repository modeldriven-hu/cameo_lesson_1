# Cameo/MagicDraw plugin development - Lesson 1

This is the first lession of how to develop a plugin for Cameo/MagicDraw. At the end of the lession you will have an environment and a very simple - hello world - example.

# Requirements

- Cameo/MagicDraw latest 
- Java JDK 11 
- Maven

# Usage

## Check out the repository

`git clone https://github.com/modeldriven-hu/cameo_lesson_1.git`

## Configure environment variable

Configure Cameo/MagicDraw root directory according to local setup, for example:

`set CAMEO_ROOT=C:/home/Tools/Cameo`

or when using PowerShell:

`$env:CAMEO_ROOT = "C:/Home/Tools/Cameo"`

## Build project

`mvn package`

## Extract into Cameo plugins folder

Extract `target/hu.modeldriven.cameo.lesson1.zip` into `CAMEO_ROOT/plugins`

## Restart

Restart CAMEO