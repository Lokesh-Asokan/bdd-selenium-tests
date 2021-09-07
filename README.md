# bdd-selenium-tests
Web application Testing with cucumber framework using Selenium and Java

**Project Description**
It is a behavior driven development (BDD) approach to write automation test script to test Web applications. It enables you to write and execute automated acceptance tests. This automation framework is developed using selenium, cucumber, java and maven, Junit.

**Installation**
Pre-requisite You need to have following softwares installed on your computer

Install JDK 1.8 and set path
Install Maven and set path
Eclipse
Eclipse Plugins: Maven and Cucumber
Installation In order to start using the project you need to create your own Fork on Github and then clone the project.

![image](https://user-images.githubusercontent.com/18717702/118224507-3a7a4200-b47b-11eb-812a-ea3cc434f5b3.png)

├───target

**How to run the Tests?**
mvn clean install -U -Dtags='@Automation' -Dthreads=1

![image](https://user-images.githubusercontent.com/18717702/132341517-2c19234c-1862-4071-b9ae-d9a530c4af63.png)


**Further Improvements:**
Tooling improvements:
1. Grid Solution:
    Tool that I would highly recommend is Selenoid as a first preference and if not Zalenium as a backup.
    Seleenoid/Zalenium is limited to the type of browser available, howeever based on business need other paid tools like Saucelabs, Perfecto or browserstack can be integrated
2. Every Application is important to meet the WCAG 2.0, 2.1 standards, so it is important to introduce Accessibility testing into Automation. So I suggest the open source tool name AXE-core from Deque that allows us to scan the application as we need. With this integration , while we run the Functional test Axe can be invoked.
3. Along with UI Functional testing it is good feature to automated GUI tests which again reduces manual dependency and allows us to function more of Exploratory testing. The toold that I was recently working and closly Applitools
4. When we consider shift left approach, it is right that we move the DAST testing(Security testing) within the pipeline , everknown OWASP-ZAP is an amazing predefind tool that helps us to scan while the functional tests are running.
Note: When we merge these tools and invoke part of the functional test, this allows us to perform all different phases of testing in one go. No addtional coding needed, No additional maintenance needed also allows us the possible coverages in pipeline
5. Report Poral - Open source cloud reporting tool that which has vast API's that can be utilised, this helps us to manage history of reports including screenshot/video for failed tests


Technical improvements:
1. Json to maintain and manage test datas
2. To stabilise the reusable instances to avoid performance issue
3. To further extend the haspmap implementaion done for setContext
4. Good logger capability across classes 

