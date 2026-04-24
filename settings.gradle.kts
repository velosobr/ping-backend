pluginManagement {
    includeBuild("build-logic")
    repositories {
        maven { url = uri("https://repo.spring.io/milestone") }
        gradlePluginPortal()
    }
}
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "ping"

include("app")
include("user")
include("chat")
include("notification")
include("commons")