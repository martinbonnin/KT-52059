# Reproducer for KT-52059

- open `module1/src/commonTest/kotlin/com/module1/Module1Test.kt`
- Gradle sync
- `com.sublib.hello` is underlined in red despite the symbol existing and the test passing
