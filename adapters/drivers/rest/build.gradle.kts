dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web")
    api(project(":common:common-rest"))

    api(project(":core:ports:incoming:api"))
}