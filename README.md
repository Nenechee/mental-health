# Spring AI Chat Application

This project is a simple chat application that integrates with the OpenAI API using Spring Boot and Spring AI. Users can send prompts to the OpenAI model and receive responses via a REST API.

## Features

- **Spring Boot** for the backend framework.
- **Spring AI** to interact with the OpenAI API.
- **RESTful API** to send chat messages to the OpenAI model.
- **Simple Chat Interface** (Frontend can be built using Thymeleaf or other technologies).

## Tech Stack

- **Spring Boot** 3.x
- **Spring AI**
- **OpenAI GPT-3.5 (or GPT-4 depending on your settings)**
- **Maven** for dependency management

---

## Project Setup

### 1. Clone the Repository

Clone this repository to your local machine:
git clone https://github.com/your-username/spring-ai-chat.git

### 2. Install Dependencies
Ensure you have the following installed:
- **Java 17 or later**
- **Maven**
Run the following command to install all necessary dependencies:
mvn install

### 3. Configure OpenAI API Key
You need an OpenAI API key to interact with the OpenAI model.

Sign up at OpenAI.

Obtain your API key from the OpenAI API Dashboard.

Add the API key to your application.properties file in the src/main/resources folder:
openai.api.key=your-api-key-here

### 4. Run the Application
Start the Spring Boot application by running the following command:
mvn spring-boot:run

Once the application is running, it will be accessible at:
http://localhost:8080

### 5. Sending Chat Requests
You can send a POST request to the /api/chat endpoint with a simple message in the body to interact with the OpenAI API.

Here’s an example using curl:
curl -X POST http://localhost:8080/api/chat -d "Hello, how are you?" -H "Content-Type: application/json"

The response will be the OpenAI model's reply to your message.
