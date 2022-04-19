plugins {
    id("org.jetbrains.kotlin.multiplatform")
}


kotlin {
    jvm()
    macosX64()
    macosArm64()

    sourceSets {
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
                implementation("com.example:lib")
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }
    }
}