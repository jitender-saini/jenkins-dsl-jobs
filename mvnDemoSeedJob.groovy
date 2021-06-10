job('mvn-demo-dsl-job') {
    description("mvn demo project build using dsl")
    scm {
        github('https://github.com/jitender-saini/spring-boot-demo.git', 'main')
    }
    triggers {
        scm('30 14 * * *')
    }
    steps {
        maven('clean package', 'pom.xml')
    }
    publishers {
        archiveArtifacts('**/*.war')
    }
}
