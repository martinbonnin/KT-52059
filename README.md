# Reproducer for KT-52059

- open `module1/src/commonTest/kotlin/com/module1/Module1Test.kt`
- Gradle sync
- `com.lib.hello` is underlined in red despite the symbol existing and the test passing
- Revert kotlin to 1.6.10 in both `build.gradle.kts` and `included-build/build.gradle.kts`
- Gradle sync
- `com.lib.hello` is not underlined in red anymore