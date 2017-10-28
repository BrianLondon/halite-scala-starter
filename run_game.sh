#!/bin/bash
set -e

sbt assembly
cp target/scala-2.12/bbot-assembly-1.0.jar MyBot.jar
zip MyBot.zip MyBot.jar LANGUAGE
./halite -d "240 160" "java -jar MyBot.jar" "java -jar MyBot.jar DumbBot"
