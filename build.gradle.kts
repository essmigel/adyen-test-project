plugins {
    kotlin("jvm") version "2.3.20"
    id("org.adyen.junit-filename") version "1.0-SNAPSHOT"
}

group = "org.adyen"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(25)
}

tasks.test {
    useJUnitPlatform()
}

junitFilename {
    outputDir = layout.buildDirectory.dir("junit-with-filename-test")
}