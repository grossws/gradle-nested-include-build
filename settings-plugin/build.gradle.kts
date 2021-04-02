import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version embeddedKotlinVersion
  `java-gradle-plugin`
}

gradlePlugin {
  plugins.create("settings") {
    id = "my.settings-plugin"
    implementationClass = "my.ExamplePlugin"
  }
}


// copy from ../plugin-build-logic/src/main/kotlin/my.plugin-conventions.gradle.kts

dependencies {
  implementation(gradleKotlinDsl())

  implementation(kotlin("stdlib-jdk8"))
  implementation(kotlin("reflect"))
}

tasks.withType<KotlinCompile>().configureEach {
  kotlinOptions {
    jvmTarget = "11"
  }
}

