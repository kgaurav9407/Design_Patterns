## 2. Factory Method

**Problem framing:**

> You are building a payment system.
> Based on input (`CREDIT_CARD`, `UPI`, `PAYPAL`), you need to create corresponding payment objects.
>
> Problem:
>
> * You don’t want `if-else` everywhere
> * New payment types will be added later

👉 “Object creation depends on type, but caller shouldn’t know concrete class” → **Factory Method**