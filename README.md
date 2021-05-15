# guppy [![Java CI](https://github.com/marco-schmidt/guppy/workflows/Java%20CI/badge.svg)](https://github.com/marco-schmidt/guppy/actions?query=workflow%3A%22Java+CI%22)

A gradle plugin providing basics

## Usage

This plugin is not hosted anywhere yet, you will have to publish it locally first.

Publish guppy to maven local in a cloned copy of guppy:
```
./gradlew pTML
```

Make sure a gradle project's settings.gradle can access the guppy plugin which has been published locally by inserting mavenLocal() into the list of plugin repositories:
```
pluginManagement {
  repositories {
    mavenLocal()
    gradlePluginPortal()
    // ... other repositories
  }
}
```

In that gradle project's build.gradle file, include the guppy plugin like this:
```
plugins {
  ...
  id 'com.github.marco-schmidt.guppy' version '0.0.1-SNAPSHOT'
}
```

## Technology Stack

* Written in Groovy
* Built with Gradle
