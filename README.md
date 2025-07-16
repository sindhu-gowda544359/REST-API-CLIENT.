# REST-API-CLIENT.

COMPANY NAME: CODTECH IT SOLUTIONS

NAME: SINDHU C.N

INTERN ID: CT04DG1118

DOMAIN NAME: JAVA PROGRAMMING

BATCH DURATION: 4 WEEKS

MENTOR NAME: NELLA SANTHOSH KUMAR

The Java Weather App is a console-based application developed to fetch and display real-time weather information for any city entered by the user. The application uses Java (JDK 8 or higher) as the core programming language, and was built and executed using Apache NetBeans IDE, a powerful tool that simplifies Java development with its user-friendly interface and inbuilt compiler. The application is designed to consume a public REST API, specifically the OpenWeatherMap API, which provides real-time weather data such as temperature, humidity, wind speed, and weather conditions like clear sky, rain, etc. The user is prompted to enter the name of a city, and the program constructs an API URL using that city name along with a unique API key. To send a request to the API and receive the response, the application uses the HttpURLConnection class from Java's java.net package. The response is in JSON format, which is a common structure used by web APIs. To parse this JSON data, the project uses the external library org.json (json.jar). This library allows easy extraction of required data from JSON objects and arrays. After parsing, the application extracts key values such as the weather condition, description, temperature in Celsius, humidity in percentage, and wind speed in meters per second. These details are then neatly displayed to the user using formatted output in the console.

In addition to displaying the weather details, the application also saves this data to a local text file named weather.txt, ensuring the user has a record of previous weather reports. This is accomplished using the FileWriter class from the java.io package in Java. The FileWriter is configured in append mode so that each new weather report is added to the file without erasing the previous data. The try-with-resources statement ensures that file handling is done safely and the file is automatically closed after writing. The saved file, weather.txt, is created in the root folder of the project directory, which in the case of NetBeans is typically located inside Documents > NetBeansProjects > WeatherApp. The program includes error handling to manage exceptions such as invalid city names, network issues, or problems connecting to the API, making it robust and user-friendly.

To develop this application, the following tools and technologies were used: Java for writing the core application logic, Apache NetBeans IDE for coding, compiling, and running the program, OpenWeatherMap API for live weather data, org.json (json.jar) for JSON parsing, and FileWriter for file storage. These tools together provide a complete end-to-end solution for building and running a Java-based weather application. This project helped me understand how Java can interact with online APIs, handle structured data like JSON, and store results in local files. It was a great learning experience and gave me hands-on exposure to real-world software development using Java and internet-based data services.

OUTPUT:
![Image](https://github.com/user-attachments/assets/cbc8a23c-0170-46e9-bad9-9a696fadc651)

