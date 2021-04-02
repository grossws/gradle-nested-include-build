pluginManagement {
  includeBuild("../settings-plugin")
}

plugins {
  id("my.settings-plugin")
}

includeBuild("../build-logic")

dependencyResolutionManagement {
  println("from app/settings")
  repositories.forEach { println("repo ${it.name}") }
}
