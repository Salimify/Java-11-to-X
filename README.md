# Java-11-to-X
A comparative overview of new features introduced in Java 17 and 21, as compared to Java 11.

## Table of Contents
1. [Introduction](#introduction)
2. [New Features](#new-features)
    - [Java 11 to 17](#java-11-to-17)
    - [Java 17 to 21](#java-17-to-21)
3. [Performance Benchmarks](#performance-benchmarks)
4. [Migration Considerations](#migration-considerations)
5. [References](#references)

## Introduction
This document provides a comparison of Java 11, 17, and 21, highlighting key feature enhancements and performance improvements. It serves as a guide to help developers understand the evolution of Java and make informed decisions when migrating from Java 11.

## New Features

### Java 11 to 17
Key features introduced in Java 17 as compared to Java 11:
1. **Pattern Matching for `instanceof`** (Java 17)
2. **Records** (Java 17)
3. **Text Blocks** (Java 13, Standardized in Java 15)
4. **Sealed Classes** (Java 17)
5. **Switch Expressions** (Java 17)

### Java 17 to 21
Comparing feature advancements from Java 17 to Java 21:
1. **Pattern Matching for `switch`** (Java 17 vs Java 21)
2. **Records** (Java 17) vs **Record Patterns** (Java 21)
3. **Text Blocks** (Java 17) vs **String Templates** (Java 21)
4. **Concurrency: Platform Threads** (Java 17) vs **Virtual Threads** (Java 21)
5. **ThreadLocal** (Java 17) vs **Scoped Values** (Java 21)

## Performance Benchmarks
Java 17 shows notable performance improvements over Java 11, especially in memory usage and time complexity. Benchmarks comparing code performance in both versions have demonstrated the following:

1. **Java 17** is **8.66% faster** than Java 11 and **2.41% faster** than Java 16 for **G1GC** (default garbage collector).
2. **Java 17** is **6.54% faster** than Java 11 and **0.37% faster** than Java 16 for **ParallelGC** (Parallel Garbage Collector).
3. **ParallelGC** in Java 17 is **16.39% faster** than **G1GC** used in Java 11.

For detailed results, see the [full benchmark report](https://www.optaplanner.org/blog/2021/09/15/HowMuchFasterIsJava17.html#:~:text=Java%2017%20is%208.66%25%20faster,than%20the%20G1%20Garbage%20Collector.).

## Migration Considerations
Migrating from Java 11 to Java 17 provides several benefits, including new features and performance improvements. However, it's important to be mindful of potential bottlenecks during migration, especially when using external libraries that may need to be updated to support Java 17. To ensure a smooth transition:
- Review your project's dependencies and their compatibility with Java 17.
- Test thoroughly to detect and address any issues arising from the upgrade.

By being aware of these considerations, you can optimize the migration process and take full advantage of the new features in Java 17 and beyond.

## References
- [Java 17 vs Java 11: Exploring the Latest Features and Improvements](https://medium.com/javarevisited/java-17-vs-java-11-exploring-the-latest-features-and-improvements-6d13290e4e1a)
- [Java 17 Performance Benchmarks](https://www.optaplanner.org/blog/2021/09/15/HowMuchFasterIsJava17.html#:~:text=Java%2017%20is%208.66%25%20faster,than%20the%20G1%20Garbage%20Collector.)
