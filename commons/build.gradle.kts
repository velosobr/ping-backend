plugins {
    id("java-library")
    id("ping.kotlin-common")
    id("org.springframework.boot")
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