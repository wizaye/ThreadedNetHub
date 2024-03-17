

# ThreadedNetHub

A simple multi-threaded web server implementation in Java using a thread pool.

## Description

This project demonstrates a basic multi-threaded web server that can handle multiple client connections concurrently using a fixed-size thread pool. The server listens on a specified port and sends a greeting message to clients upon connection.

## Features

- Multi-threaded handling of client connections.
- Configurable thread pool size.
- Simple greeting message sent to clients upon connection.

## Usage

1. Clone the repository:

    ```bash
   https://github.com/wizaye/ThreadedNetHub.git
    ```

2. Compile the Java files:

    ```bash
    javac Server.java
    ```

3. Run the server:

    ```bash
    java Server
    ```

4. Connect to the server using a web browser or a tool like `curl`:

    ```bash
    curl http://localhost:8010
    ```

## Configuration

You can adjust the following parameters in the `Server.java` file:

- `port`: The port on which the server listens for incoming connections.
- `poolSize`: The size of the thread pool used for handling client connections.

## Dependencies

- Java (version 8 or higher)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.


