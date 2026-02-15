# API Test Automation Framework

## 📋 Project Overview

This is a **REST Assured API Test Automation Framework** built with **Java** and **Cucumber BDD**. The framework provides a robust solution for testing RESTful APIs with clear, readable test scenarios written in Gherkin syntax.

## 🏗️ Project Structure

```
API_PROJECT/
├── src/
│   └── test/
│       └── java/
│           ├── common/              # Common utilities and helpers
│           ├── features/            # Cucumber feature files (.feature)
│           ├── runner/              # Test runners
│           ├── stepdefinitions/     # Step definition classes
│           └── workflows/           # Reusable workflow classes
├── Configuration.xml                # TestNG/Framework configuration
├── TestData.json                   # Test data repository
├── .classpath                      # Eclipse classpath configuration
├── .gitignore                      # Git ignore rules
├── .project                        # Eclipse project file
├── Jenkinsfile                     # Jenkins CI/CD pipeline
└── pom.xml                         # Maven dependencies
```

## 🛠️ Technology Stack

| Technology | Purpose |
|------------|---------|
| **Java** | Programming Language |
| **REST Assured** | API Testing Library |
| **Cucumber** | BDD Framework |
| **TestNG** / **JUnit** | Test Runner |
| **Maven** | Build & Dependency Management |
| **Jenkins** | CI/CD Integration |
| **JSON** | Test Data Management |

## ✨ Key Features

- ✅ **BDD Approach**: Cucumber-based Gherkin scenarios for business-readable tests
- ✅ **Data-Driven Testing**: Externalized test data in JSON format
- ✅ **Modular Architecture**: Separation of concerns with workflows and step definitions
- ✅ **CI/CD Ready**: Jenkins pipeline integration
- ✅ **Comprehensive Reporting**: Built-in test execution reports
- ✅ **Configuration Management**: Centralized configuration file
- ✅ **Reusable Components**: Common utilities and workflow classes

## 📦 Prerequisites

Before running the tests, ensure you have:

- **Java JDK** 11 or higher
- **Maven** 3.6+
- **IDE**: Eclipse, IntelliJ IDEA, or VS Code
- **Git** (for version control)

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone <repository-url>
cd API_PROJECT
```

### 2. Install Dependencies

```bash
mvn clean install
```

### 4. Configure Settings

Update `Configuration.xml` with your environment settings.

## 🧪 Running Tests

### Run All Tests

```bash
mvn test
```

### Run Specific Feature

```bash
mvn test -Dcucumber.options="src/test/java/features/api_feature_file.feature"
```

### Run with Tags

```bash
mvn test -Dcucumber.options="--tags @smoke"
```

### Run via TestNG XML

```bash
mvn test -DsuiteXmlFile=Configuration.xml
```

## 📊 Test Reports

After test execution, reports are generated in:

```
target/
├── cucumber-reports/
│   ├── cucumber.html
│   └── cucumber.json
└── surefire-reports/
    └── testng-results.xml
```

## 🔧 Common Utilities

The `common/` package contains:

- **APIClient**: REST Assured client wrapper
- **ConfigReader**: Configuration file reader
- **JsonUtils**: JSON parsing utilities
- **DataProvider**: Test data provider
- **Hooks**: Cucumber before/after hooks

## 🔄 CI/CD Integration

### Jenkins Pipeline

## 🎯 Best Practices

1. **Use Page Object Model**: Keep API endpoints and methods in separate classes
2. **Externalize Test Data**: Use `TestData.json` for all test data
3. **Tag Your Scenarios**: Use `@smoke`, `@regression`, `@sanity` tags appropriately
4. **Reusable Steps**: Create generic step definitions for common operations
5. **Proper Assertions**: Use appropriate matchers and validations
6. **Logging**: Add proper logging for debugging
7. **Error Handling**: Implement try-catch blocks for robust tests

## 🐛 Troubleshooting

### Common Issues

**Issue**: Tests fail with connection timeout
- **Solution**: Check `baseUrl` in `TestData.json` and network connectivity

**Issue**: Dependencies not found
- **Solution**: Run `mvn clean install -U` to force update

**Issue**: Feature files not detected
- **Solution**: Verify runner configuration and feature file path

## 📞 Support

For issues or questions:
- Create an issue in the repository
- Contact the automation team
- Check documentation in `/docs`

## 📄 License

This project is licensed under the MIT License.

## 👥 Contributors

- **Your Name** - Initial work and maintenance

---

**Last Updated**: February 2026
**Framework Version**: 1.0.0
