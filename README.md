# Java-Homework
Hi, all this is my first Java homework jsp, servlet, JDBC.
# Install this 
First, create a new folder name you like, and then go to any IDE(IntelliJ, vscode) > Recommend IntelliJ
  navigate to the new folder you've created, 
  Open terminal past this to your terminal to install the project--> ```git clone https://github.com/Jouymray/Java-Homework.git```

# How to Run/Debug

1. install Tomcat
2. add Tomcat to your project
3. Install Java database connector version 8.0.33  https://cdn.mysql.com/archives/mysql-connector-java-8.0/mysql-connector-j-8.0.33.zip
4. add a Java-database-connector to your project by creating a new dictionary named "lib"
5. and then Click run to deploy the app
6. go to a browser (etc, chrome, edge, firefox) to access the app by http://localhost:8080/advancedjavahomework/form.jsp.

# Note
Make sure you have installed Xampp and MySql on your computer, and if you have yet to install those things please go to YouTube to watch tutorials on how to install XAMPP  AND MYSQL. But if you already installed make your DATABASE NAME match our code

# SQL scripts
```
CREATE DATABASE mydb;
USE mydb;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(100),
    password VARCHAR(100),
    birthday VARCHAR(50),  -- Or use DATE type if you prefer
    new_student VARCHAR(10),
    college VARCHAR(100),
    major VARCHAR(100),
    color VARCHAR(20),
    terms VARCHAR(10)
);

```
**Thank You**
