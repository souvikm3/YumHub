pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        //for slideshow
        maven { url = uri("https://www.jitpack.io" ) }
    }
}

rootProject.name = "YumHub"
include(":app")
