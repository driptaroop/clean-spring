plugins {
    kotlin("plugin.jpa")
}
dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    api(project(":common:common-persistence"))
    api(project(":core:ports:outgoing:spi"))
    runtimeOnly("com.h2database:h2")
}