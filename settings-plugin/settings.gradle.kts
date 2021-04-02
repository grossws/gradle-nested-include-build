dependencyResolutionManagement {
  repositories.mavenCentral()
}

dependencyResolutionManagement {
  println("from settings-plugin/settings")
  repositories.forEach { println("repo ${it.name}") }
}
