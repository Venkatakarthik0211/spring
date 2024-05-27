# $${\color{yellow}🔄How \space deserialization \space occurs \space (deserialization \space or \space also \space known \space as \space object \space injection)}$$

Serialization is the process of converting an object into a format that can be easily stored, transmitted, or reconstructed later. In Java, serialization allows you to convert an object into a stream of bytes, which can then be saved to a file, sent over a network, or stored in a database. 
When it comes to Spring Boot, serialization is often used in scenarios where you need to persist or transmit objects between different components of an application, such as between a client and a server.

Here's a step-by-step explanation of how serialization works in Java:

| $${\color{orange}Step}$$ | $${\color{purple}Description}$$ |
|------|-------------|
| 1.   | Importing the necessary classes: In your code snippet, you have imported the `java.io.*` package, which contains classes for input and output operations, including serialization. |
| 2.   | Creating an object to serialize: In order to serialize an object, you first need to create an instance of the object you want to serialize. In your code, the `MyObject` class is used as an example. This class represents the object you want to serialize. |
| 3.   | Creating output streams: To write the serialized object to a file or any other destination, you need to create output streams. In your code, a `FileOutputStream` is created to write the serialized object to a file named "data.ser". The `ObjectOutputStream` is then created to handle the serialization process. |
| 4.   | Writing the object to the output stream: Once the output streams are set up, you can write the object to the `ObjectOutputStream` using the `writeObject()` method. This method serializes the object and writes it to the output stream. |
| 5.   | Closing the streams: After writing the object, it's important to close the output streams to release system resources. In your code, the `close()` method is called on both the `ObjectOutputStream` and the `FileOutputStream`. |

<h3 align="center">Here's an example to illustrate the serialization process:</h3>

```java
import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        try {
            // Create an object to serialize
            MyObject myObject = new MyObject("Hello, World!");

            // Create a file output stream
            FileOutputStream fileOutputStream = new FileOutputStream("data.ser");

            // Create an object output stream
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Write the object to the output stream
            objectOutputStream.writeObject(myObject);

            // Close the streams
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
### $${\color{red}Sometimes \space this \space may \space lead \space to \space RCE}$$ 

In this example, the `MyObject` class represents the object you want to serialize. The `FileOutputStream` and `ObjectOutputStream` are used to write the serialized object to a file named "data.ser". The `writeObject()` method is used to serialize the `myObject` and write it to the output stream. Finally, the streams are closed to release system resources.

## $${\color{yellow}Common \space Java \space and \space Spring \space Boot \space Serialization \space Vulnerabilities \space and \space Defenses}$$ 

### $${\color{red}Vulnerabilities:}$$ 
1. **Unpatched libraries in programming language dependencies**
2. **Unclosed Interfaces and classes**
3. **Privileged tags in microservices - Remote Code Execution (RCE)**
4. **Parameter Tampering**
5. **Denial of Service (DoS)**

### $${\color{skyblue}Defenses:}$$ 
1. **Get rid of unpatched or vulnerable libraries** and **Input Validation**
   - Use `safeConstructor()` as argument when defining objects.
   - Implement input validation to sanitize user input.

2. **Reduce Attack Surface**
   - Properly close application classes and interfaces to prevent unintended access.
   - Avoid sending unnecessary or sensitive data through objects.

3. **Avoid using privileged flags**
   - Maintain normal user privileges and utilize security options like AppArmor and SELinux.

4. **Implement Digital Signatures**
   - Digitally sign serialized data to ensure integrity and authenticity.

5. **Denial of Service (DoS) Mitigation**
   - Embed Content Security Policy (CSP) headers to restrict resources that can be loaded on a web page.

