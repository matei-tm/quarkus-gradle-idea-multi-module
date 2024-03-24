pluginManagement {
    val quarkusPluginVersion: String by settings
    val quarkusPluginId: String by settings
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
      id (quarkusPluginId) version quarkusPluginVersion
    }
}
rootProject.name="quarkus-gradle-idea-multi-module"
include("module-1")
include("module-2")

