# Selenium-101
Repository for Selenium 101 Certification

## Overview
This repository contains Selenium automation test scripts built with Java and TestNG framework. The project demonstrates practical Selenium WebDriver implementations for automating web application testing on the LambdaTest Selenium Playground platform.

---

## Repository Structure

```
Selenium-101/
└── seleniumPractice/
    ├── src/
    │   └── main/
    │       └── java/
    │           └── seleniumPractice/
    │               ├── baseFile.java
    │               ├── InputFormSmt.java
    │               ├── DragDropSliders.java
    │               ├── simpleFormDemo.java
    │               └── firstTest.java
    ├── pom.xml
    └── testng.xml
```

---

## Test Files Overview

### `/seleniumPractice/src/main/java` - Test Classes

#### **1. baseFile.java**
- **Purpose**: Base test class providing setup and teardown functionality for all test classes
- **Key Features**:
  - `@BeforeTest` - Initializes WebDriver with parameterized browser selection (Chrome, Firefox, Edge, Safari)
  - `@AfterTest` - Cleans up and closes the WebDriver session
  - Supports cross-browser testing via LambdaTest cloud platform
  - Configures browser options with visual and video recording capabilities
  - Navigates to LambdaTest Selenium Playground URL
- **Browser Support**: Chrome, Firefox, Edge, Safari
- **Integration**: LambdaTest RemoteWebDriver with credentials and Selenium version 4.4.0

#### **2. InputFormSmt.java**
- **Purpose**: Automated test for submitting an input form with validation
- **Key Functionality**:
  - Locates and clicks "Input Form Submit" link
  - Tests form validation (verifies required field error message)
  - Fills multiple form fields:
    - Name, Email, Password
    - Company, Website URL
    - Country selection via dropdown
    - Address details (City, Street, State, Zip Code)
  - Submits the form
  - Verifies success message: "Thanks for contacting us, we will get back to you shortly."
- **Technologies Used**: WebDriverWait, Select dropdown handling, Assertions
- **Extends**: `baseFile` class

#### **3. simpleFormDemo.java**
- **Purpose**: Automated test for simple form demo functionality
- **Key Functionality**:
  - Navigates to Simple Form Demo page
  - Verifies URL contains "simple-form-demo"
  - Enters a message: "Welcome to LambdaTest"
  - Clicks "Get Checked Value" button
  - Validates that the entered message is displayed correctly
- **Technologies Used**: WebDriverWait, URL verification, Element interactions
- **Extends**: `baseFile` class

#### **4. DragDropSliders.java**
- **Purpose**: Automated test for drag and drop slider interaction
- **Key Functionality**:
  - Navigates to "Drag & Drop Sliders" section
  - Locates a slider element
  - Uses arrow key navigation to adjust slider to target value (95)
  - Implements a do-while loop to precisely control slider movement
  - Verifies final slider value equals 95
- **Technologies Used**: Actions, Keys, WebDriverWait, Slider manipulation
- **Extends**: `baseFile` class
- **Note**: Alternative drag-and-drop implementation is commented out (line 28-29)

#### **5. firstTest.java**
- **Purpose**: Initial/basic Selenium test demonstrating simple browser automation
- **Key Functionality**:
  - Sets ChromeDriver property
  - Opens LambdaTest website
  - Retrieves and prints page title
  - Basic test structure for beginners
- **Technologies Used**: Local WebDriver (ChromeDriver)
- **Status**: Standalone test (not extended from baseFile)

---

## Configuration Files

### **pom.xml** - Maven Project Object Model
- **Group ID**: `Practice`
- **Artifact ID**: `seleniumPractice`
- **Version**: `0.0.1-SNAPSHOT`

**Dependencies**:
1. **Selenium Java** (v4.43.0)
   - Provides WebDriver API for browser automation
   - Source: Maven Central Repository

2. **TestNG** (v6.14.2)
   - Test framework for running and organizing tests
   - Provides annotations (@Test, @BeforeTest, @AfterTest)
   - Enables parameterized testing and test organization

**Usage**: 
```bash
mvn clean install    # Install dependencies
mvn test             # Run all tests
```

### **testng.xml** - TestNG Test Suite Configuration
- **Suite Name**: Suite
- **Thread Count**: 5 (parallel test execution)

**Test Scenarios**:

1. **TestScenario 1 - Edge Browser**
   - Browser: Microsoft Edge
   - OS: Windows 11
   - Test Name: "Test Scenario 3 In Edge"
   - Test Class: `seleniumPractice.InputFormSmt`
   - Thread Count: 5

2. **TestScenario 2 - Chrome Browser**
   - Browser: Google Chrome
   - OS: Windows 10
   - Test Name: "Test Scenario 3 in Chrome"
   - Test Class: `seleniumPractice.InputFormSmt`
   - Thread Count: 5

**Parameters**: 
- `browsername` - Browser type to execute tests on
- `testName` - Display name for the test in reporting
- `OS` - Operating system configuration

**Features**:
- Parameterized test execution for cross-browser testing
- Parallel execution capability with thread configuration
- Easy test organization and execution control

---

## How to Run Tests

### Run All Tests:
```bash
mvn test
```

### Run Specific Test Suite:
```bash
mvn test -Dsuites=testng.xml
```

### Run Single Test Class:
```bash
mvn test -Dtest=InputFormSmt
```

---

## Technology Stack
- **Language**: Java
- **Build Tool**: Maven
- **Test Framework**: TestNG
- **Automation Tool**: Selenium WebDriver 4.43.0
- **Execution Platform**: LambdaTest Cloud (for cross-browser testing)

---

## Notes
- Tests are designed for cross-browser execution using LambdaTest cloud infrastructure
- Visual and video recording is enabled for all test runs on LambdaTest
- Explicit waits (WebDriverWait) are used instead of implicit waits for better element interaction
- The repository demonstrates best practices for Selenium automation testing

---

## Author
luise7306
