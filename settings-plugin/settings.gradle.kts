dependencyResolutionManagement {
  repositories.mavenCentral()
}

// !!! settings plugin convention plugins should be included via pluginManagement { includeBuild("...") }
// just includeBuild("../plugin-build-logic") wouldn't work
pluginManagement {
  includeBuild("../plugin-build-logic")
}

dependencyResolutionManagement {
  println("from settings-plugin/settings")
  repositories.forEach { println("repo ${it.name}") }
}
