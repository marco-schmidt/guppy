package com.github.marco_schmidt.guppy.gradleplugin

import org.gradle.api.*
import org.gradle.api.tasks.*

class GuppyPlugin implements Plugin<Project>
{
  @Override
  void apply(Project project)
  {
    println('Guppy gradle plugin');
  }
}