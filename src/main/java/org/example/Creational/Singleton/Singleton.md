## 1. Singleton

**Problem framing:**

> You are building a configuration manager for a backend system.
> The system reads configs from a file/db and caches them in memory.
>
> Requirements:
>
> * Only one instance should exist across the application
> * All services should access the same config object
> * Lazy initialization (load only when needed)


Purpose
-------
The Singleton pattern ensures a class has exactly one instance and provides a global point of access to it. It's a creational pattern used when a single shared resource (configuration, logging, connection pool manager, etc.) must be coordinated across an application.
# 🧠 1. CREATIONAL PATTERNS (Object Creation Problems)

---

## 1. Singleton

**Problem framing:**

> You are building a configuration manager for a backend system.
> The system reads configs from a file/db and caches them in memory.
>
> Requirements:
>
> * Only one instance should exist across the application
> * All services should access the same config object
> * Lazy initialization (load only when needed)

👉 You *feel the need*: “only one object globally” → **Singleton**


## Naive implementation:

Cons:
>The naive implementation allows multiple instances of the `ConfigManager` 
> to be created across different parts of the application, which 
> leads to several issues. Each instance opens its own database 
> connection and loads configuration data separately, resulting 
> in unnecessary resource usage and performance overhead. Since
> every instance maintains its own cache, the same data is
> duplicated in memory, and more importantly, different instance
> s may hold different snapshots of the data depending on when 
> they were created. This causes inconsistency in the system,
> where different services might read different configuration 
> values at the same time. Additionally, the absence of a 
> centralized configuration leads to a lack of a single source
> of truth, making the system harder to maintain, debug, and 
> ensure consistent behavior across all components.


##Eager Initialization:

---

Eager initialization ensures thread safety by creating the instance during the class initialization phase, which is inherently synchronized by the JVM. When multiple threads attempt to access the class for the first time, the JVM guarantees that only one thread performs the class initialization while other threads wait, ensuring that the instance is created exactly once. However, the drawback of eager initialization is that the object is created even when it may not be needed. Since the instance is initialized as a static field, it gets created during class loading, which can be triggered by accessing any static member of the class. This can lead to unnecessary resource utilization, especially when object creation is expensive, such as opening database connections or loading configuration data. As a result, eager initialization may negatively impact application startup time and overall performance if the instance is rarely or never used.
