package my

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import org.gradle.kotlin.dsl.*

class ExamplePlugin : Plugin<Settings> {
  override fun apply(t: Settings) {
    println("running ExamplePlugin in ${t.settingsDir}")
    val group: String? by t
    if(group != "my") {
      println("group != my")
      return
    }

    t.dependencyResolutionManagement {
      it.repositories.mavenCentral()
    }
  }
}

