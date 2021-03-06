plugins {
    base
    id("com.lovelysystems.gradle") version ("1.0.0")
}
lovely {
    gitProject()
    dockerProject("barnabasj/example-test")
}

val createVersionFile by tasks.creating {
    val f = file("VERSION.txt")
    outputs.files(f)
    f.writeText(version.toString())
}

lovely.dockerFiles.from(createVersionFile.outputs)
tasks["prepareDockerImage"].dependsOn(createVersionFile)

defaultTasks("buildDockerImage")
