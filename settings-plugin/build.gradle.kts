import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("my.plugin-conventions")
}

gradlePlugin {
  plugins.create("settings") {
    id = "my.settings-plugin"
    implementationClass = "my.ExamplePlugin"
  }
}
