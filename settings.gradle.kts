rootProject.name = "clean-spring"

include(
        "app",
        "adapters:driven:persistence",
        "adapters:drivers:rest",
        "core:domain:entity",
        "core:domain:service",
        "core:ports:incoming:api",
        "core:ports:incoming:command-query-model",
        "core:ports:outgoing:datamodel",
        "core:ports:outgoing:spi",
        "common:common-rest",
        "common:common-persistence"
)