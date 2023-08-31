plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.8.22"
    id("org.jetbrains.intellij") version "1.14.1"
    antlr
}

group = "dev.tlang"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    antlr("org.antlr:antlr4:4.13.0")
    implementation("org.antlr:antlr4-runtime:4.13.0")
    implementation("org.antlr:antlr4-intellij-adaptor:0.1")
}

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
intellij {
    version.set("2023.2")
    type.set("IC") // Target IDE Platform

//    plugins.set(listOf("com.intellij.modules.java-capable"))
}

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }

    patchPluginXml {
        sinceBuild.set("232")
        untilBuild.set("232.*")
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }


    generateGrammarSource {
        arguments = arguments + listOf("-package", "dev.tlang.parser", "-Xexact-output-dir", "-lib", "$projectDir/src/main/antlr/dev/tlang/parser")

//        , "-o", "$projectDir/src/main/java/main/dev/tlang/parser"
        outputDirectory = File("$projectDir/src/main/java/dev/tlang/parser")

//        doLast {
//            copy {
//                from( "$projectDir/build/generated-src/antlr/main/")
//                include ("*.*")
//                into ("$projectDir/src/main/java/main/dev/tlang/parser")
////                into ("$projectDir/build/generated-src/antlr/main/java/main/dev/tlang/parser")
//            }
//            project.delete( fileTree("$projectDir/build/generated-src/antlr/main").include("*.*"))
//        }
    }

    getByName("compileKotlin").dependsOn("generateGrammarSource")

}
