# java-handbook

A reference collection of Core Java, Collections, JVM internals, Concurrency, and Modern Java exercises — built topic by topic alongside DSA practice, as part of a structured 148-day SDE-2 preparation plan. Each exercise exists to prove out one specific concept, not to be exhaustive: the goal is to be able to explain *why* something works, not just that it does.

## Progress

**16 / 27 exercises complete**

| Category | Exercises | Status |
|---|---|---|
| Core Java & OOP | 5 | ✅ Complete |
| Collections Framework | 3 | ✅ Complete |
| JVM Internals & Performance | 4 | ✅ Complete |
| Generics | 2 | ✅ Complete |
| Exception Handling | 1 | ✅ Complete |
| Recursion | 1 | ✅ Complete |
| Modern Java (17 / 21) | 2 | ✅ Complete |
| Concurrency | 5 | ⬜ Not started |
| Systems & Algorithm Utilities | 4 | ⬜ Not started |

## Structure

```
java-handbook/
├── arrays/
├── oop/
├── collections/
├── generics/
├── exceptions/
├── recursion/
├── modernjava/
├── concurrency/
└── utils/
```

## Exercises

<details>
<summary><strong>Core Java & OOP</strong> — 5/5 ✅</summary>

Fluency with control flow, arrays/strings, and the object model — the base everything else in this repo (and in `dsa-java`) builds on.

- [x] Control flow & fluency exercises — FizzBuzz, Celsius↔Fahrenheit converter, prime checker *(Day 1)*
- [x] Arrays & Strings — max value in an array, in-place reverse, character frequency counting, palindrome check *(Day 2)*
- [x] `oop` package — `Book` (constructors, encapsulation), `Shape`/`Circle`/`Rectangle` (interfaces, polymorphism) *(Day 2)*
- [x] `Account` class hierarchy + `AccountType` enum — the four OOP pillars, applied *(Day 5)*
- [x] SOLID — `TaxCalculator` interface extraction (Open/Closed Principle); `NotificationService`/`MessageSender` refactor (Dependency Inversion) *(Day 6)*
</details>

<details>
<summary><strong>Collections Framework</strong> — 3/3 ✅</summary>

Where `ArrayList`, `HashSet`, `HashMap`, and `ArrayDeque` go from "APIs I called" to "data structures I can justify choosing."

- [x] `ArrayListPractice` *(Day 3)*
- [x] `HashSetPractice`, `HashMapPractice`, `StackQueuePractice` *(Day 4)*
- [x] `CollectionsBenchmark` — `ArrayList` vs. `ArrayDeque`, benchmarking insertion at index 0 *(Day 12)*
</details>

<details>
<summary><strong>JVM Internals & Performance</strong> — 4/4 ✅</summary>

The gotchas that separate "writes working Java" from "knows why it works" — stack vs. heap, the `Integer` cache, string immutability, and the `equals`/`hashCode` contract.

- [x] `PassByValueDemo` — stack vs. heap, pass-by-value semantics for primitives vs. object references *(Day 9)*
- [x] `TypesAndCache` — primitive overflow, the `Integer` cache trap (`-128` to `127`) *(Day 10)*
- [x] `StringPerformance` — `+=` concatenation vs. `StringBuilder`, benchmarked *(Day 11)*
- [x] `HashCodeContractDemo` — a broken `hashCode()` silently failing a `HashMap` lookup, then fixed *(Day 15)*
</details>

<details>
<summary><strong>Generics</strong> — 2/2 ✅</summary>

Type-safe, reusable containers — and the `Comparable`/`Comparator` split that every sorted structure in this plan leans on.

- [x] `ResponseWrapper<T>`, `Pair<A, B>` *(Day 16)*
- [x] `Transaction` record + `TransactionSorting` — `Comparable` vs. `Comparator` *(Day 17)*
</details>

<details>
<summary><strong>Exception Handling</strong> — 1/1 ✅</summary>

Checked vs. unchecked, and `try-with-resources` as the fix for the classic "forgot to close it" bug.

- [x] `CacheMissException` (custom unchecked exception) + `try-with-resources` demo *(Day 18)*
</details>

<details>
<summary><strong>Recursion</strong> — 1/1 ✅</summary>

Base case, recursive case, and a first real look at redundant recomputation — the exact problem Dynamic Programming exists to solve later in the plan.

- [x] `RecursionPractice` — factorial, Fibonacci (with call-tree tracing), digit-sum *(Day 8)*
</details>

<details>
<summary><strong>Modern Java (17 / 21)</strong> — 0/2 ✅</summary>

`record`, `sealed` types, and pattern matching for `switch` — the newer language features several later design-pattern exercises lean on.

- [ ] `ModernJava` — `sealed interface PaymentState permits Pending, Success, Failed`, each a `record`, with an exhaustive `switch` *(Day 28)*
- [ ] Record Pattern rewrite — the same `PaymentState` switch, using Java 21 record patterns and a `when` guard clause *(Day 92)*
</details>

<details>
<summary><strong>Concurrency</strong> — 0/5 ⬜</summary>

From raw threads to explicit locks to a hand-rolled blocking queue — the progression that makes `ConcurrentHashMap` and the executor framework feel like consequences, not magic.

- [ ] `ThreadInterleavingDemo` — two threads, interleaved non-deterministic output *(Day 29)*
- [ ] `ReentrantLock`-based `Counter` — correctness under 100 concurrent threads *(Day 37)*
- [ ] Producer-Consumer — `ReentrantLock` + two `Condition`s (`notFull`, `notEmpty`) *(Day 38)*
- [ ] `ConcurrentMapBenchmark` — `Collections.synchronizedMap()` vs. `ConcurrentHashMap` under concurrent writes *(Day 39)*
- [ ] Hand-rolled thread-safe bounded blocking queue (`ReentrantLock`/`Condition`, no `java.util.concurrent` shortcuts) + a concurrency test proving correctness *(Day 138)*
</details>

<details>
<summary><strong>Systems & Algorithm Utilities</strong> — 0/4 ⬜</summary>

Small, self-contained implementations of ideas that show up again later at real scale — on the platform, or in a system-design interview.

- [ ] `ConsistentHashingDemo` — a `TreeMap<Integer, String>` ring, measuring key movement on server add/remove *(Day 60)*
- [ ] Kruskal's Algorithm — implemented against the `UnionFind` class from `dsa-java`, on a small hardcoded weighted graph *(Day 77)*
- [ ] `DPFoundations` — Fibonacci three ways (naive recursion, `HashMap` memoization, tabulation), timed for `n=40` *(Day 81)*
- [ ] Base62 encoder/decoder — the building block behind a URL-shortener key generation service *(Day 120)*
</details>

## Stack

- Java 21
- IntelliJ IDEA

## Related

- [`dsa-java`](https://github.com/srisuryakumarm/dsa-java) — pattern-organized LeetCode solutions
- [`scalable-ecommerce-platform`](https://github.com/srisuryakumarm/scalable-ecommerce-platform) — where several of these concepts (consistent hashing, Snowflake IDs, hand-rolled concurrency primitives) get applied for real
