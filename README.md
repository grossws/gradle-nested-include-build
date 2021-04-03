# About

Demo project for Gradle settings plugin which use convention plugin for its configuration.

* Branch `init` contains code where settings plugin *doesn't* use conventions plugin
* Branch `main` contains code with full example
 
## Dependencies

* `app` use `build-logic` as normal included build and `settings-plugin` to configure repos 
  (using `pluginManagement { includeBuild(...) }` and `plugins { id("my.settings-plugin") }`);
* `build-logic` use `settings-plugin` (like `app`);
* `settings-plugin` use `plugin-build-logic` for its convention plugins.
