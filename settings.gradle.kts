rootProject.name = "clean-spring"

include(
        "app",
        "adapters:driven:persistence",
        "adapters:drivers:web",
        "core:domain:entity",
        "core:domain:service",
        "core:ports:incoming:api",
        "core:ports:incoming:model",
        "core:ports:outgoing:model",
        "core:ports:outgoing:spi"
)