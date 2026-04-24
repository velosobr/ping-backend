plugins {
    id("ping.spring-boot-app")
}

group = "com.velosobr"
version = "0.0.1-SNAPSHOT"
description = "ping-backend"


dependencies {
    implementation(projects.user)
    implementation(projects.chat)
    implementation(projects.notification)
    implementation(projects.commons)
}