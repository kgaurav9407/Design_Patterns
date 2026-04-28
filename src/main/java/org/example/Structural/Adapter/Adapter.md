
---

# Adapter Pattern: Problem Statements

## 1. Notification System (Based on Provided Code)

**Scenario:**  
You are building a notification system that supports multiple channels (Email, SMS, etc.).
- The system has a new notification interface, but there are legacy classes (e.g., for SMS) that do not match the new interface.
- You want to use both new and legacy notification services interchangeably.

**Requirements:**
- Allow the notification service to work with both new and legacy notification implementations.
- Use adapters to make legacy classes compatible with the new interface.
- The client should interact with all notification types through a common interface.

---

## 2. Payment Gateway Integration

**Scenario:**  
An e-commerce platform wants to support multiple payment gateways (PayPal, Stripe, Razorpay, etc.).
- Each gateway has a different API and data format.
- The platform should be able to switch or add gateways without changing the core payment logic.

**Requirements:**
- Provide a unified payment interface for the application.
- Use adapters to integrate different payment gateway APIs.
- Allow easy addition of new gateways in the future.

---

## 3. Google Maps to Apple Maps Migration (API Adapter)

**Scenario:**  
A mobile app originally used Google Maps APIs for location and navigation but now needs to support Apple Maps as well.
- The APIs for Google Maps and Apple Maps are different.
- The app should be able to switch between map providers with minimal changes.

**Requirements:**
- Define a common map interface for the app.
- Use adapters to translate calls from the common interface to each provider's API.
- Allow seamless switching between map providers.

---

## 4. Amazon Warehouse: Legacy XML to JSON (Data Format Adapter)

**Scenario:**  
Amazon's warehouse management system is being upgraded.
- Some legacy systems produce data in XML, while new systems require JSON.
- The systems must interoperate without rewriting all legacy code.

**Requirements:**
- Provide a unified data interface for warehouse operations.
- Use adapters to convert XML data to JSON format as needed.
- Allow legacy and new systems to work together smoothly.

---

## 5. Netflix Analytics Integration

**Scenario:**  
Netflix wants to integrate a new analytics engine, but its API is different from the existing analytics interface.
- The streaming service should be able to use the new analytics engine without changing the core streaming logic.

**Requirements:**
- Define a standard analytics interface for the streaming service.
- Use an adapter to connect the new analytics engine to the existing interface.
- Enable easy integration of future analytics engines.

---

## 6. Uber Driver Onboarding

**Scenario:**  
Uber's driver onboarding system needs to integrate with various third-party background check services, each with its own API.
- The onboarding process should be consistent regardless of the background check provider.

**Requirements:**
- Define a common background check interface for onboarding.
- Use adapters to connect to different third-party background check APIs.
- Allow the onboarding system to switch providers easily.

---

These scenarios demonstrate how the Adapter Pattern enables systems to work with incompatible interfaces by introducing adapters, promoting flexibility and reusability.