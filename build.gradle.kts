plugins {
	kotlin("jvm") version "2.1.20"
	application
}

group = "com.gildedrose"
version = "1.0-SNAPSHOT"

repositories {
	mavenCentral()
}


application {
	mainClass.set("com.gildedrose.TexttestFixtureKt")
}
