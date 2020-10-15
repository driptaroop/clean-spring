import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES

plugins {
    val kotlinVersion = "1.4.10"
    val springBootVersion = "2.3.4.RELEASE"
    val springDependencyManagementVersion = "1.0.10.RELEASE"


    id("org.springframework.boot") version springBootVersion apply false
    id("io.spring.dependency-management") version springDependencyManagementVersion apply false
    kotlin("jvm") version kotlinVersion apply false
    kotlin("kapt") version kotlinVersion apply false
    kotlin("plugin.spring") version kotlinVersion apply false
    kotlin("plugin.jpa") version kotlinVersion apply false
    id("org.jmailen.kotlinter") version "3.2.0" apply false
}

allprojects {
    repositories {
        jcenter()
    }

    group = "org.dripto"
    version = "1.0-SNAPSHOT"
}

subprojects {
    apply {
        plugin("io.spring.dependency-management")
        plugin("org.jetbrains.kotlin.jvm")
        plugin("org.jmailen.kotlinter")
        plugin("org.jetbrains.kotlin.plugin.spring")
    }
    configure<JavaPluginExtension> {
        sourceCompatibility = JavaVersion.VERSION_11
    }

    val api by configurations
    val implementation by configurations
    val testImplementation by configurations
    dependencies {
        api(platform(BOM_COORDINATES))

        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
        implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")

        testImplementation("org.springframework.boot:spring-boot-starter-test") {
            exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
            languageVersion = "1.4"
        }
    }
}