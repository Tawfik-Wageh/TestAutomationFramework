# TestAutomationFramework

## Overview

TestAutomationFramework is a comprehensive automation testing project for web applications, utilizing Java, Maven,
Selenium WebDriver, TestNG, and Allure for reporting. The framework is modular, scalable, and designed for both UI and
API testing.

## Features & Enhancements

- **Modular Design:** Organized by drivers, pages, components, actions, validations, listeners, media, and utilities for
  maintainability.
- **Cross-Browser Support:** Chrome, Firefox, Edge, Safari via factory pattern.
- **API Testing:** Integrated API test support with dedicated classes.
- **Data-Driven Testing:** Supports JSON, Excel, and property files for test data.
- **Advanced Reporting:** Allure integration for rich test reports and environment details.
- **Logging:** Centralized logging via LogsManager.
- **Screen Recording & Screenshots:** Automated capture during test execution.
- **Custom Waits & Actions:** Robust utilities for element interaction and synchronization.
- **TestNG Listeners:** Custom listeners for enhanced test lifecycle management.
- **Environment Configuration:** Flexible property files for environment, waits, video, and more.
- **Reusable Components:** Navigation bar and other UI components for DRY code.
- **Assertions & Validations:** BaseAssertion, Validation, and Verification classes for robust checks.

## Prerequisites

- Java 17 or higher
- Maven 3.8+
- Chrome/Firefox/Edge/Safari browsers (latest versions)
- Allure Commandline (for report generation)

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone <your-repo-url>
   cd TestAutomationFramework
   ```
2. **Install dependencies:**
   ```
   mvn clean install
   ```
3. **Configure properties:**
   Edit files in `src/main/resources/` (e.g., `environment.properties`, `webapp.properties`, etc.) as needed.
4. **Run tests:**
   ```
   mvn test
   ```
5. **Generate Allure Report:**
   ```
   allure serve target/allure-results
   ```

## Project Structure

- `src/main/java/com/automationexercices/` - Framework source code
- `src/test/java/com/automationexercices/tests/` - Test cases (UI & API)
- `src/main/resources/` - Configuration and test data
- `pom.xml` - Maven build configuration

## Usage

- **UI Tests:** Implement page objects in `pages/`, actions in `actions/`, and tests in `tests/ui/`.
- **API Tests:** Use `apis/` for API interaction and `tests/api/` for API test cases.
- **Test Data:** Place data files in `src/test/resources/test-data/`.
- **Reporting:** View Allure reports after test execution.

## Contribution Guidelines

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/your-feature`)
3. Commit your changes
4. Push to your branch
5. Open a pull request

## License

MIT License

## Contact

For issues or feature requests, open an issue or contact the maintainer.

---
_Last updated: October 2, 2025_

