# Broswer-Automation
# About Project 
This is a browser automation that launches one of my local projects on chrome, logs in and navigates to user details page

# Tools
Java
Selenium
Chrome Driver

# Setup Environment
Intellij Idea

# How to Setup
## Download and install JDK
https://www.oracle.com/java/technologies/javase/jdk18-archive-downloads.html (Depending on your OS)
### Add the path of your JDk to Environment Variables
Navigate to the JDK folder after installation <br>
This is usually in the C:\Program Files\Java\jdk-18.0.2\bin <br>
Next copy the path of the JDK bin folder <br>
Navigate to Advanced System Settings(You can type this in Search bar) <br>
Click Environment Variables <br>
Under system variables <br>
Click Path, Edit then Paste the URL of the JDK bin folder

## Download and install Intellij IDea Community Edition
https://www.jetbrains.com/idea/download/#section=windows

## Download Latest Selenium Jar files for Java
https://www.selenium.dev/downloads/ <br>
Navigate to Selenium Clients and WebDriver Language Bindings and click on Java

## Download ChromeDriver depending on your chrome version
https://chromedriver.chromium.org/downloads


## Clone repository and Add selenium jar files and chrome driver to project
Next open project <br>
Navigate to Project Structure <br>
Navigate to Modules <br>
Click on the + sign <br>
Select Jars or directories <br>
Navigate to the location of the Selenium Jar files <br>
Next select all Jar files and apply <br>

Edit the System.setproperty() code path to the path of where you downloaded the chrome driver and that's all

:)
