
---

# Proxy Pattern: Problem Statements

## 1. Video Streaming Service (Based on Provided Code)

**Scenario:**  
You are building a video streaming application. When a user requests to play a video, the system loads the video file.
- If the same video is requested multiple times, it should not be loaded from disk again to save time and bandwidth.
- The system should be able to add features like access control, logging, or caching without modifying the core video loading logic.

**Requirements:**
- Avoid redundant loading of the same video.
- Allow additional features (like logging, access control) to be added transparently.
- The client should interact with the video service through a common interface, unaware of whether a proxy is used.

---

## 2. YouTube App: Caching, Access Control, and Logging

**Scenario:**  
You are developing a YouTube-like app.
- Videos are large and expensive to load repeatedly.
- Some videos are restricted based on user subscription or region.
- All video access should be logged for analytics.

**Requirements:**
- Cache videos to avoid repeated downloads.
- Enforce access control before loading a video.
- Log every video access.
- The client code should not change if these features are added or removed.

---

## 3. Google Drive File Access

**Scenario:**  
A Google Drive client app allows users to access files stored in the cloud.
- Files may be large and should be downloaded only when needed.
- Some files are private and require permission checks.
- File access should be logged for auditing.

**Requirements:**
- Download files only when accessed.
- Check user permissions before granting access.
- Log all file accesses.
- The client interacts with files through a unified interface.

---

## 4. Amazon Product Page: Image and Data Loading

**Scenario:**  
An Amazon-like e-commerce site displays product pages with many images and details.
- Loading all images and data upfront is slow and bandwidth-intensive.
- Some product details are restricted to logged-in users.

**Requirements:**
- Load images and details only when needed (lazy loading).
- Restrict access to certain data based on user authentication.
- Optionally log access to sensitive product information.

---

## 5. Spotify Song Streaming: Caching and Access Control

**Scenario:**  
A Spotify-like music streaming app streams songs to users.
- Songs should be cached locally to avoid repeated downloads.
- Some songs are restricted to premium users.
- Song play events should be logged for analytics.

**Requirements:**
- Cache songs after first play.
- Check user subscription before streaming.
- Log every song play.
- The client should use a common interface for all song requests.

---

## 6. Meta Internal Microservice Rate Limiter

**Scenario:**  
Within Meta's internal infrastructure, microservices communicate with each other.
- Some services have strict rate limits to prevent abuse.
- All requests should be logged for monitoring.
- Access to certain services is restricted to specific teams.

**Requirements:**
- Enforce rate limits on service calls.
- Log all service requests.
- Check access permissions before forwarding requests.
- The calling service should not be aware of these checks.

---

These scenarios illustrate how the Proxy Pattern can be used to add cross-cutting concerns like caching, access control, logging, and rate limiting to existing systems without changing their core logic.