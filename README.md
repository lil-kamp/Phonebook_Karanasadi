# Phonebook
A Simple Implemention of phonebook with Java to challenge you with writing unit tests and working with git

# How To Do The Assignment:
step 1 => fork this repository and add it to your own account

step 2 => clone the repository on your own system

step 3 => open pom.xml file in the project

step 4 => add this dependencies to pom.xml and click on load maven changes :

```
<dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.junit</groupId>
                <artifactId>junit-bom</artifactId>
                <version>5.8.2</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
    
    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
```

step 5 => open the Phonebook_Test class and import this files:
```
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
```
step 6 => write your unit tests and after completing each tests of a method, commit changes and push to your repo

Find bugs and make this project better
