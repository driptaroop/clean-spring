rootProject.name = "clean-spring"

include(
        "app",
        "adapters:driven:persistence",
        "adapters:drivers:rest",
        "core:domain:entity",
        "core:domain:service",
        "core:ports:incoming:api",
        "core:ports:incoming:incoming-model",
        "core:ports:outgoing:outgoing-model",
        "core:ports:outgoing:spi",
        "common:common-rest",
        "common:common-core",
        "common:common-persistence"
)