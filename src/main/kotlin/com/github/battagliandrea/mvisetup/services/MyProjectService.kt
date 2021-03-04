package com.github.battagliandrea.mvisetup.services

import com.github.battagliandrea.mvisetup.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
