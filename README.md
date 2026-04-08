# Real-Time Chat Application

##Description
A real-time chat application built using Spring Boot and WebSocket that allows multiple users to communicate instantly with message persistence.

##Tech Stack
- Java
- Spring Boot
- WebSocket
- STOMP
- MySQL

## Project Structure

'''bash
app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.chat.app/
│   │   │       ├── config/
│   │   │       │   └── WebSocketConfig.java
│   │   │       ├── controller/
│   │   │       │   └── ChatController.java
│   │   │       ├── model/
│   │   │       │   └── ChatMessage.java
│   │   │       ├── repository/
│   │   │       │   └── ChatMessageRepository.java
│   │   │       └── AppApplication.java
│   │   ├── resources/
│   │   │   ├── static/
│   │   │   ├── templates/
│   │   │   │   └── chat.html
│   │   │   └── application.properties
│   ├── test/
│   │   └── java/
│   │       └── com.chat.app/
│   │           └── AppApplicationTests.java
│
├── .gitignore
├── pom.xml
├── mvnw
├── mvnw.cmd
├── HELP.md
└── .gitattributes
'''


## How to Run
1. Clone the repository
2. Open in IDE (IntelliJ / Eclipse)
3. Configure MySQL in application.properties
4. Run the Spring Boot application
5. Open browser and start chatting


##Features
- Real-time messaging between multiple users
- Join and leave notifications
- Stores chat history in database
- WebSocket-based communication

##How to Run
1. Clone the repository
2. Open in IDE (IntelliJ / Eclipse)
3. Configure MySQL in application.properties
4. Run the Spring Boot application
5. Open browser and start chatting

##Key Concept
This project uses WebSocket instead of traditional REST APIs to enable real-time communication.
