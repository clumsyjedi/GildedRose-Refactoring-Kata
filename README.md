# Gilded Rose Refactoring Kata (Kotlin)

See [GildedRoseRequirements.md](GildedRoseRequirements.md) for the problem description.

## Prerequisites

A JDK. The Gradle wrapper handles everything else — no Gradle installation needed.

## Run the text fixture (30 days)

```
./gradlew run
```

## Run the TextTest approval tests

```
./start_texttest.sh
```

## Run with a custom number of days

```
./gradlew run --args 10
```

## TextTest approval tests

See [texttests/README.md](texttests/README.md) for instructions on running the TextTest suite.
