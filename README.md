The goal of this homework is to install the basic tooling that is used throughout the semester and to learn its basic functionality. 
The tooling portion of the homework can be completed on a personal machine, laptop or otherwise, or an open lab computer. 
Many of the steps require research to complete. 
This lack of specificity is intentional and students are encouraged to use Stackoverflow (Links to an external site.) and other resources as appropriate. 

Part I: Git

This class will use git to distribute both homework and labs. 
Assignments will also be turned in using git. 
If you do not have git installed you will need to do so as the first step to this assignment.

Once you have git installed, sfork this repository.

Part II: Maven

This class will be using the build tool Maven. 
To familiarize yourself with Maven, read through the first step of this tutorial http://tutorials.jenkov.com/maven/maven-tutorial.html . 
For more extensive information on maven this resource is valuable https://maven.apache.org/index.html .
When installing maven, the easiest course of action is to your package manager (brew for macOS, apt for Ubuntu/Windows subsystem for Linux). 
Windows users may need to research a little bit to find the necessary steps to install Maven. 

Windows users may find the following sources valuable in their installation process
https://docs.alfresco.com/4.2/tasks/fot-addpath.html 
https://maven.apache.org/download.cgi?Preferred=http%3A%2F%2Fapache.cs.utah.edu%2F
https://maven.apache.org/guides/getting-started/windows-prerequisites.html 

Once Maven is installed, make sure to finish reading all six steps of the tutorial before moving on.

Your labs and homework will often require a pom file. 
No pom file will be distributed with any sources that are provided.
It will be your responsibility to know and understand Maven and the pom file.

Part III: Tooling

The goal of this assignment is to create the pom.xml file used by Maven to build the source and test code within this repository. 
To meet this requirement start by adding a groupId, artifactId, and version.
Your project's groupId should be your netID, the artifactId should be the assignment's name, and the version should be "1.0-SNAPSHOT".
Next, declare the target and source java version as 1.8 .
As you progress through this assignment, it would behoove you to continually test that what you're writing works and contains no errors.
To do this while writing the pom.xml, from the command line and in the directory that contains your pom.xml you may run "mvn clean".
In the same tag that contains your target and source java versions, add the following
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
This will address warnings that are produced by one of the following dependencies you're required to add.
Add these dependencies:
-JUnit5
    -junit-jupiter-engine version 5.3.0 or above
    -junit-platform-runner version 5.3.0 or above
    -junit-platform-console-standalone version 5.3.0 or above
-JaCoCo version 0.8.4 or above
-SLF4J version 1.7.28 or above
-Checkstyle version 8.19 or above

Now you will need to add the Checkstyle plugin to your pom, under the build tag.

<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-checkstyle-plugin</artifactId>
            <version>3.1.0</version>
            <configuration>
                <configLocation>checkstyle.xml</configLocation>
                <encoding>UTF-8</encoding>
                <logViolationsToConsole>true</logViolationsToConsole>
                <consoleOutput>true</consoleOutput>
                <failsOnError>true</failsOnError>
                <linkXRef>false</linkXRef>
            </configuration>
            <executions>
                <execution>
                    <id>validate</id>
                    <phase>validate</phase>
                    <goals>
                        <goal>check</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>

Do NOT modify the above plugin's configuration or execution these are both needed to properly report style violations.

As you can see a plugin is similar to a dependency and contains a groupId, artifactId, and version number.
For more information on plugins, you can read about them here https://maven.apache.org/plugins/index.html .
Under the plugins tag you will need to add one additional plugin:

-maven-surefire-plugin version 2.22.0 or above 

When attempting to compile the code using the Maven "mvn compile" command from the command line, you may get warnings. 
You will need to fix those warnings, such that when you compile there are no warningns.

After you've successfully compiled the given code, you will need to run the provided tests using "mvn test", and confirm that there are no failed tests.

----------------------
Sean/James

Please add the jar located here https://github.com/checkstyle/checkstyle/releases/ to your src/main/resources directory
Then please exectue the instructions here https://checkstyle.sourceforge.io/writingchecks.html#Logging_errors under the Tool To Print Java Tree Structure and The Checkstyle SDK Gui.
Will these be sufficient replacements to the ASTView used previously? Are the names the same that are presented in the ASTView. 
