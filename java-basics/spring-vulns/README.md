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
# --------------------------------------------------------------------------------------------------------------------

### $${\color{violet}Sometimes \space this \space may \space lead \space to \space RCE}$$ 

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
# --------------------------------------------------------------------------------------------------------------------

> In Java, input deserialization occurs as binary deserialization. One way to modify binary serialized data is by using tools like Buurp Extension or Hackvertor. These tools allow you to modify the serialized data and inject malicious code.

To identify serialized Java objects, you can look for the following characteristics:
- Serialized Java objects always begin with the same bytes, which are encoded as `ac ed` in hexadecimal and `rO0` in Base64.
- Any class that implements the interface `java.io.Serializable` can be serialized and deserialized. If you have access to the source code, pay attention to any code that uses the `readObject()` method, as it is used to read and deserialize data from an `InputStream`.

There are several ways to exploit serialized objects:
-  Modifying objects: This involves replacing the code logic of the serialized object and then replacing the file, which results in a different object ID.
- Modifying data types: By manipulating the serialized data, you can change the data types to be accepted by the deserialization process.
- Using application functionality: Sometimes, you can exploit deserialization vulnerabilities by tampering with specific functionalities of the application, such as uploading a malicious profile picture.
- Magic methods: Certain methods, such as `readObject()` in Java, can be overridden in a serializable class to execute arbitrary code during deserialization.

# --------------------------------------------------------------------------------------------------------------------

API Testing (Server Side Paramerer Pollution)

# --------------------------------------------------------------------------------------------------------------------
 
# $${\color{yellow}SSRF}$$ 

<b><u>This vulnerability allows an attacker to cause the server-side application to make requests to an unintended location.
Generally, when used (localhost, admin, .... etc) or (respective backend server IP). Then this vulnerability occurs</u></b>

### $${\color{orange}Attack:}$$ 

| Attack Techniques                                      |
|--------------------------------------------------------|
| - Use different protocols with localhost (blacklisted words) |
| - When there is a blacklist words, convert IPv4 to 32-bit Integer |
| - Use URL encoding |
| - Use a domain/subdomain which mimics as localhost |

### $${\color{lime}Prevention: }$$ 

| Prevention Measures                                    |
|--------------------------------------------------------|
| - Input Sanitization (allowed domains, protocols etc.) |
| - Whitelisting certain IP addresses for outgoing requests |
| - Whitelisting URL based requests |
| - Network segmentation to minimize SSRF attack surface |
| - Set Absolute URLs instead of Relative URLs |

### $${\color{teal}Detection}$$ 

| Timestamp           | Event Type | Event Description                                 |
|---------------------|------------|---------------------------------------------------|
| 2024-05-27 10:15:00 | SSRF Attack | Detected request to localhost with blacklisted protocol |
| 2024-05-27 10:17:30 | SSRF Attack | Detected conversion of IPv4 to 32-bit Integer |
| 2024-05-27 10:20:45 | SSRF Attack | Detected URL encoding in request |
| 2024-05-27 10:25:20 | SSRF Attack | Detected request to domain mimicking localhost |

# Blind SSRF

To identify Blind SSRF, performing OAST Testing is necessary.

### Different Types of Automated Testing

- **SAST (Static Application Security Testing):**
  - Analyzes source code, byte code, or application binaries for security vulnerabilities without executing the code. It's akin to proofreading a book for errors without understanding the story.
  - Tools: Semgrep, SonarQube, programming-based tools (https://github.com/analysis-tools-dev/static-analysis), Trivy, and Clair for Container Security.

- **DAST (Dynamic Application Security Testing):**
  - Analyzes an application during runtime to detect issues not visible in static analysis. It's akin to a live performance review from the outside in.
  - Tools: Accunetix, Fortify with custom rules, (https://github.com/paulveillard/cybersecurity-dast?tab=readme-ov-file).

- **OAST (Out-of-Band Application Security Testing):**
  - Combines elements of SAST and DAST, identifying vulnerabilities while the application is running by instrumenting it from the inside out.
  - Tools: Burp Collaborator.

- **IAST (Interactive Application Security Testing):**
  - Also combines aspects of SAST and DAST, identifying vulnerabilities while the application is running by instrumenting it internally.
  - Tools: New Relic.

## OAST Testing

Out-of-band application security testing (OAST) utilizes external servers to detect otherwise invisible vulnerabilities. It enhances the DAST (Dynamic Application Security Testing) model.


