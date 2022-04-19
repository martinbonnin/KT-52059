plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("maven-publish")
}

group = "com.example"
version = "0.1"

kotlin {
    jvm()
    macosX64()
    macosArm64()
}