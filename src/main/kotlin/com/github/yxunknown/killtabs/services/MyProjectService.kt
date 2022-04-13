package com.github.yxunknown.killtabs.services

import com.intellij.openapi.project.Project
import com.github.yxunknown.killtabs.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
