plugins {
    id("com.android.library") version "8.2.0"
    id("maven-publish")
}

afterEvaluate {
    configure<PublishingExtension> {
        publications {
            register<MavenPublication>("release") {
                from(components["release"])
                groupId = "com.github.TamarunGitHubUsername"
                artifactId = "moby-rewards"
                version = "1.0.0"
            }
        }
    }
}