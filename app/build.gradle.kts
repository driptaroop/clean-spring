plugins {
    id("org.springframework.boot")
    kotlin("kapt")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    kapt("org.springframework.boot:spring-boot-configuration-processor")
    implementation(project(":adapters:drivers:rest"))
}

configurations {
    compileOnly {
        extendsFrom(configurations.kapt.get())
    }
}