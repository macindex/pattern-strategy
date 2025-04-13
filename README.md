# 🧠 Notification Strategy Pattern with Spring Boot

This project demonstrates the **Strategy Design Pattern** using **Spring Boot** by implementing a flexible and scalable notification system.

Instead of relying on multiple `if-else` or `switch-case` statements to determine how to send a notification (via Email, Twitter, Discord, etc.), the **Strategy Pattern** is used to encapsulate each notification behavior in a separate class.

---

## 📌 Project Structure

### ✅ Interface
```java
public interface NotificationStrategy {
    void send(String destination, String message);
}

🛠️ Strategy Implementations
EmailNotificationStrategy

WhatsappNotificationStrategy

TwitterNotificationStrategy

InstagramNotificationStrategy

DiscordNotificationStrategy

Each class implements NotificationStrategy and defines its own way of handling the delivery.

💡 Example Usage
java
Copy
Edit
notificationService.sendNotification("email", "user@example.com", "Welcome to our platform!");

🧩 Why Use the Strategy Pattern?
🚫 Traditional Approach (if-else)
java
Copy
Edit
if (type.equals("email")) {
    // send email
} else if (type.equals("twitter")) {
    // send tweet
} else if (type.equals("whatsapp")) {
    // send WhatsApp message
}
// ... and so on

Hard to maintain

Difficult to extend (modifying existing logic)

Violates Open/Closed Principle (OCP)

✅ Strategy Pattern Approach
Each strategy is encapsulated in its own class.

Adding new channels requires no changes to existing logic.

More testable and modular code.

Promotes cleaner, reusable, and maintainable architecture.

🚀 Technologies Used
Java 17+

Spring Boot 3+

Spring Context (for DI)

Lombok

Maven

📂 Example Folder Structure
css
Copy
Edit
src
├── main
│   ├── java
│   │   └── com.example.notification
│   │       ├── strategy
│   │       │   ├── NotificationStrategy.java
│   │       │   ├── EmailNotificationStrategy.java
│   │       │   ├── WhatsappNotificationStrategy.java
│   │       │   ├── TwitterNotificationStrategy.java
│   │       │   ├── InstagramNotificationStrategy.java
│   │       │   └── DiscordNotificationStrategy.java
│   │       ├── service
│   │       │   └── NotificationService.java
│   │       └── NotificationApplication.java


📫 Contribution
Feel free to fork this project, suggest improvements, or open pull requests.
