# http-get-method-using-java
Computer Networking Lab
# Networkingclass1

## Overview
This is a simple Java application that demonstrates how to make an HTTP GET request to a REST API endpoint using Java's `HttpURLConnection`. The application fetches data from `https://jsonplaceholder.typicode.com/posts`, prints the response code and message, and displays the retrieved JSON data.

## Features
- Establishes an HTTP connection to a given URL
- Sends a GET request with a custom User-Agent header
- Reads and prints the response status code and message
- Fetches and displays the full response data from the API

## Prerequisites
To run this project, ensure you have the following installed:
- Java Development Kit (JDK) 8 or later

## How to Run
1. Clone or download the project files.
2. Open a terminal or command prompt in the project directory.
3. Compile the Java program:
   ```sh
   javac Networkingclass1.java
   ```
4. Run the compiled class:
   ```sh
   java com.mycompany.networkingclass1.Networkingclass1
   ```

## Expected Output
When executed, the program should display:
- HTTP response code (e.g., `200` for success)
- HTTP response message (e.g., `OK`)
- The retrieved JSON response data from the API

## Notes
- The API used (`https://jsonplaceholder.typicode.com/posts`) is a free fake online REST API for testing and prototyping.
- The response is printed as a single string; formatting may be necessary for better readability.

## License
This project is open-source and free to use.

