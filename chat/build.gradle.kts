plugins {
    id("java-library")
    id("ping.spring-boot-service")
    kotlin("plugin.jpa")
}

group = "com.velosobr"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}