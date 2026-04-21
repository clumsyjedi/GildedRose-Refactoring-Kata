# Gilded Rose Refactoring Kata (Kotlin)

See [GildedRoseRequirements.md](GildedRoseRequirements.md) for the problem description.

## Prerequisites

A JDK (version 8 or later). The Gradle wrapper handles everything else — no Gradle installation needed.

## Run the TextTest approval tests

```
./start_texttest.sh
```

## Run the text fixture (30 days)

```
./gradlew run
```

## Run with a custom number of days

```
./gradlew run --args 10
```

## TextTest approval tests

See [texttests/README.md](texttests/README.md) for instructions on running the TextTest suite.
