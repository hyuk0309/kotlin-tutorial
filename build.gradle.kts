plugins {
    kotlin("jvm") version "1.5.10"
}

group = "org.hyuk"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.13.2")
}

tasks.test {
    useJUnitPlatform()
}