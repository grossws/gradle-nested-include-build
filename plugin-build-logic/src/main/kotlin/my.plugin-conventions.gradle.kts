import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm")
  `java-gradle-plugin`
}

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
