pluginManagement {
  includeBuild("../settings-plugin")
}

plugins {
  id("my.settings-plugin")
}

dependencyResolutionManagement {
  println("from build-logic/settings")
  repositories.forEach { println("repo ${it.name}") }
}
