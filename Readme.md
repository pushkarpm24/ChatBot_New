### **Automation Framework (BDD)**
____

In This framework we are able to automate test cases of __Web applications, Mobile applications, API's__. Created by using Cucumber tool by following BDD approach.  

### Concepts Included
____

* Parallel Run (Runner class of all 3 platform run in parallel)
* Page Object Model
* Extent Reporting
* Allure Reporting
* Hooks
* Generic Methods (Eg: Action Engine, Appium Wrapper, BaseClass, Properties Operations File)
* Feature Files (In this we have to write all the scenarios related to feature)
* Step Definition (This are the separate methods for steps in scenarios)
* Runner Classes (Here I have created 3 runner classes i.e 1 for each platform from which we can run all the feature files of particular platform)
* Added Screenshot To Report
* Congif. Files
* Separate package structure for all three platform (Eg: web,api,mobile folders)

### Tools
____

* Maven
* Cucumber-JVM
* JUnit
* Selenium Webdriver
* Appium
* Rest-Assured

### Requirments
____

In order to utilise this project you need to have the following installed locally:

* Maven Windows
* All Drivers (Chrome driver, gicko driver, edge driver etc..)
* Java 1.8
* Cucumber Plugin
* Appium Server
* Allure Installed
* Updated POM with all the dependencies added

### Usage
____

The project is broken into separate packages for Web, Mobile and API testing. Each of these modules can be utilised independently of the others.

* To run all the test runner class in parallel, Navigate to test project folder in terminal and run:

     ``mvn clean`` then ``mvn test > (path of the txt file to export all the logs in file)``
     
* If you want to run a particular platform runner class then navigate to runner class of particular platform right click and select Run(Runner class Name)

* If you want to run particular scenario in feature file then rigt click on that scenario and select RUN(Secnario_Name)

* To run all the test runner class in parallel there is another option, click on Maven option given in right side corner of IDE then click on Lifecycle and then double click on tests


### Reporting
____

Here we are generating `Extent report` for all the platforms feature file, report of all the feature files will get stored in `/test-output` folder and here we are also generating allure report in order to categorise the exceptions, The allure report will get generated in default folder allure-results/.

To view allure report:

* Navigate to project location in command prompt and run `allure serve allure-results/`

In `/test-output` folder three types of extent report will get generated :
* HTML
* Logger
* Spark