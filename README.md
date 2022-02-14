### **_DESCRIPTION_**
**BDD Test automation Framework with Selenium webdriver + Java + Maven + TestNg**

### **_Tools and technologies used:_**

1.Language: Java 8

2.Testing framework: TestNG

3.BDD framework: Cucumber

4.Automation tool: Selenium 4

5.Build tool: maven

6.Headless browser

7.Chrome Browser

8.Firefox Browser

9.Apache POI

### **Features of the framework**

1.BDD framework using Cucumber.Feature files is written using Scenario with Given,When,Then.

2.Login credentials are feeded from an external excel file data using Apache POI.

3.Following exceptions are handled during execution of test.
* Webdriver Exception
* NoSuchElementException
* ElementNotVisibleException
* TimeoutException
* StaleElementReferenceException

4.Tests are executed on Chrome and Firefox browsers using ChromeDriver and GeckoDriver.

5.Tests are executed in headless browser.

6.Tests is executed from linux terminal using mvn command.

7.Intellij is used as an IDE.

**package: resources :** It has driver of chromedriver and geckodriver.
This is required while creating the webdriver session.

**Directory: StepDefinitions** : It contains features (tests) files.

**directory: StepDefinitions** : It includes the java classes which are required by each test to perform actions.

**package: data** :It include TestData.Xlsx file.

**POM.xml** : It contains all the dependencies.

## **Execution of tests**

**$ mvn test**
: To run test with configurable browser i.e. firefox , chromedriver , geckodriver.









