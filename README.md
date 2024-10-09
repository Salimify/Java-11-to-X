# Java-11-to-X
A comparative of new java features in Java 17 and 21 to 11

<h2>Examples Structure</h2>
<h3>Java 11 to 17</h3>
1. Pattern Matching for instanceof (Java 17)
2. Records (Java 17)
3. Text Blocks (Java 13, Standardized in Java 15)
4. Sealed Classes (Java 17)
5. Switch Expressions (Java 17)

<h3>Java 17 to 21</h3>
1. Pattern Matching for switch (Java 17 vs Java 21)
2. Records (Java 17) vs Record Patterns (Java 21)
3. Text Blocks (Java 17) vs String Templates (Java 21)
4. Concurrency with Platform Threads (Java 17) vs Virtual Threads (Java 21)
5. ThreadLocal (Java 17) vs Scoped Values (Java 21)

<h2>Performance Benchmarks </h2>
Java 17 has also shown improvement over Java 11 in terms of its memory usage and time complexity. One such benchmark has been done where they tally code written in both version on their performance by making them do a series of tasks. The complete results and task descriptions can be found here.
<a href="https://www.optaplanner.org/blog/2021/09/15/HowMuchFasterIsJava17.html#:~:text=Java%2017%20is%208.66%25%20faster,than%20the%20G1%20Garbage%20Collector.">Link</a>

Some of the general results which have been noted are:

1. Java 17 is 8.66% faster than Java 11 and 2.41% faster than Java 16 for G1GC (default garbage collector).
2. Java 17 is 6.54% faster than Java 11 and 0.37% faster than Java 16 for ParallelGC(Parallel Garbage Collector).

3. The Parallel Garbage Collector(Available in Java 17) is 16.39% faster than the G1 Garbage Collector(Used in Java 11).

Migrating from Java 11 to Java 17 can provide many benefits, including new features and improved performance. However, it’s essential to be aware of potential bottlenecks that may arise during the migration process. Many libraries would also be upgrading to newer versions to support Java 17. Hence we should be extremely careful if we are using external libraries in our projects. By understanding these potential issues and taking the necessary steps to address them, you can ensure a smooth and successful migration to Java 17.

<a href="https://medium.com/javarevisited/java-17-vs-java-11-exploring-the-latest-features-and-improvements-6d13290e4e1a">source</a>