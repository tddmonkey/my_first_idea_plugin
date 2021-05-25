package com.github.tddmonkey.myfirstideaplugin.services

import com.github.tddmonkey.myfirstideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
