plugins {
    kotlin("js") version "1.9.20"
}

kotlin {
    target {
        useCommonJs()
        nodejs()
    }

    sourceSets["main"].dependencies {
        implementation(kotlin("stdlib-js"))

        implementation(npm("@actions/core", "^1.2.3"))
        implementation(npm("@actions/github", "^2.1.1"))
    }
}

repositories {
    mavenLocal()
}
