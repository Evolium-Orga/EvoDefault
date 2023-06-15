plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "net.evolium.pluginname"
version = "1.0.0-SNAPSHOT"

repositories {
    maven {
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
        content {
            includeGroup("org.bukkit")
            includeGroup("org.spigotmc")
        }
    }
    maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots") }
    maven { url = uri("https://oss.sonatype.org/content/repositories/central") }

    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("org.spigotmc:spigot-api:1.19.4-R0.1-SNAPSHOT")

    compileOnly("org.jetbrains:annotations:24.0.1")

    compileOnly("org.projectlombok:lombok:1.18.26")
    annotationProcessor("org.projectlombok:lombok:1.18.26")

    testCompileOnly("org.projectlombok:lombok:1.18.26")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.26")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.mockito:mockito-junit-jupiter:5.3.1")
}

tasks.shadowJar {
    with(this) {
        configurations = listOf(project.configurations.shadow.get())
    }
}

tasks.test {
    useJUnitPlatform()
}