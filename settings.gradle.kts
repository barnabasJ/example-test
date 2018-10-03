// use the local maven repository of the parent project
pluginManagement {
    repositories {
        maven ("../lovely-gradle-plugin/build/repository")
        gradlePluginPortal()
    }
}
