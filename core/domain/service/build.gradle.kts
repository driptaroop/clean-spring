dependencies {
    implementation(project(":core:domain:entity"))
    api(project(":core:ports:incoming:api"))
    api(project(":core:ports:outgoing:spi"))

    implementation("org.springframework:spring-context")
    implementation("org.springframework:spring-tx")
}