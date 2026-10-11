

---

# Iterator Pattern: Problem Statements

## 1. Playlist Iterator

**Scenario:**
You are building a music player that stores songs in a playlist.

The playlist should allow clients to traverse songs one by one without exposing how the songs are stored internally.

**Requirements:**

* Create a common iterator interface for traversing songs.
* The playlist should provide an iterator to access its songs.
* Support operations such as `hasNext()` and `next()`.
* The client should not need to know whether songs are stored in an `ArrayList`, array, or another data structure.
* Iteration should proceed sequentially from the first song to the last.

---

## 2. Library Book Iterator

**Scenario:**
You are designing a library management system containing a collection of books.

The library may internally store books using different data structures, but users should be able to browse all available books in a consistent manner.

**Requirements:**

* Provide an iterator for traversing books.
* Hide the internal data structure used by the library.
* Support `hasNext()` and `next()` operations.
* The client should be able to iterate through books without directly accessing the underlying collection.
* The design should allow the internal storage mechanism to change without affecting the client.
* Support iterating over only currently available books as an additional iterator.

---

## 3. Social Media Feed Iterator

**Scenario:**
You are building a social media platform where a user's feed contains posts from different sources.

Posts may be stored or generated differently, such as:

* Posts from followed users
* Recommended posts
* Sponsored posts

The feed should expose a uniform way for the client to traverse posts without exposing how each source stores or generates them.

**Requirements:**

* Provide a common iterator interface for traversing feed posts.
* Hide the internal representation of each feed source.
* Allow different feed sources to provide their own iterators.
* Support sequential traversal using `hasNext()` and `next()`.
* The client should not need to know whether posts come from a list, database-backed collection, or generated source.
* Support filtering posts, such as only posts from followed users.
* The design should allow new feed sources to be added without changing the client.

---

## 4. File System Directory Iterator

**Scenario:**
You are designing a cloud file-storage system where directories can contain files and subdirectories.

Users should be able to browse the contents of a directory without knowing how the directory internally stores its entries.

The system should also support different ways of traversing the file system.

**Requirements:**

* Provide an iterator for traversing directory entries.
* Hide the internal representation of directory contents.
* Support iterating over files and subdirectories.
* Provide a recursive/depth-first iterator that can traverse all files inside a directory hierarchy.
* Support filtering, such as iterating only over `.pdf` files.
* Allow different traversal strategies without changing the directory itself.
* The client should interact only with the iterator abstraction.

---

## 5. Database Query Result Iterator

**Scenario:**
You are designing a data-access layer for a large-scale application.

A database query may return millions of records, so the application should not load all records into memory at once.

Instead, query results should be exposed through an iterator that fetches records incrementally from the database.

The client should be able to process results without knowing whether records are being read from an in-memory collection, database cursor, or remote data source.

**Requirements:**

* Provide an iterator abstraction for query results.
* Support sequential access using `hasNext()` and `next()`.
* Avoid loading the complete result set into memory.
* Fetch records incrementally as the client requests them.
* Hide database cursor/result-set implementation details from the client.
* Properly handle the end of the result set.
* Support closing/releasing database resources after iteration.
* Allow different data sources to expose results through the same iterator abstraction.
* Support optional filtering or transformation of records during iteration.
* The design should allow large result sets to be processed efficiently.

---

### Difficulty progression

| Problem                       | Focus                                                 |
| ----------------------------- | ----------------------------------------------------- |
| **1. Playlist**               | Basic Iterator                                        |
| **2. Library**                | Multiple iterators / encapsulation                    |
| **3. Social Media Feed**      | Multiple data sources + filtering                     |
| **4. File System**            | Recursive traversal + different traversal strategies  |
| **5. Database Query Results** | Lazy iteration + resource management + large datasets |

For your **2–3 actual solves**, I'd do **1 → 4 → 5**. That gives you the progression from the pure textbook Iterator to the kind of iterator problem where the pattern is actually useful in production.
