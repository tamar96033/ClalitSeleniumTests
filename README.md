# ClalitSeleniumTests
This project provides automated UI tests for the Clalit website using Selenium WebDriver, Java, and TestNG, following the Page Object Model (POM) design pattern.
# 🧪 ClalitPharmacyTests

### Automated UI Testing for the Clalit Health Services Website  
This project automates UI tests on the [Clalit](https://www.clalit.co.il/) website using **Java**, **Selenium WebDriver**, and **TestNG**, following the **Page Object Model (POM)** design pattern.

---

## 📌 Features

- Automated testing for pharmacy search functionality
- Modular design using Page Object Model
- Use of Enums for maintainability and cleaner code
- Compatible with Maven build system
- Uses WebDriverManager to handle browser drivers

---

## ✅ Test Scenarios

1. **Homepage interaction**
   - Click on “איתור שירות” (Service Locator)

2. **Pharmacy Search**
   - Open the pharmacy tab
   - Filter for currently open pharmacies
   - Click on the search button
   - Assert that at least one result appears

3. **Top Search Bar**
   - Open the top search bar
   - Search for "מרכז בית"
   - Check that search results appear

---

## 🛠 Technologies Used

- Java
- Maven
- Selenium WebDriver
- TestNG
- WebDriverManager
- IntelliJ IDEA

---

## 📁 Project Structure

src/
├── main/
│ └── java/
│ └── pages/ # Page Object classes
│ └── enums/ # Enum types for selectors/labels
│ └── utils/ # DriverManager or other utilities
├── test/
│ └── java/
│ └── tests/ # Test classes per page or feature
│ └── BaseTest.java # Common setup/teardown



---

## 🚀 How to Run

1. Make sure Java and Maven are installed.
2. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ClalitPharmacyTests.git
   cd ClalitPharmacyTests


Run the tests with Maven:
 mvn test


