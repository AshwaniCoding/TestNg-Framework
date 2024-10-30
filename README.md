# TestNG Framework Template

This repository provides a streamlined TestNG framework template configured for automated testing, designed specifically with only test components, JDK 21, and Maven. It’s ideal for modular test creation and can be easily adapted to multiple projects, with support for Excel-based data handling.

## Key Features

- **Test-Only Structure**: Organized solely around test classes for clarity and simplicity.
- **Excel Data Handling**: Integrates with Apache POI for reading and writing Excel files, enabling data-driven testing.
- **Cross-Browser Compatibility**: Configurable to run tests across various browsers.
- **Detailed Reporting**: Generates comprehensive reports for analysis and debugging.
- **Enhanced Error Logging**: Improved logging for easier troubleshooting.

## Framework Structure

- `src/test/java` - Contains all test cases, organized by modules.
- `resources/` - Holds configuration files, such as `config.properties` and any Excel test data files.
- `testng.xml` - Configures suite execution, test grouping, and parallel runs.

## Getting Started

1. **Clone the Repository**:
      `git clone https://github.com/AshwaniCoding/TestNg-Framework.git`
      `cd TestNg Framework`

2. **Dependencies**: Ensure necessary dependencies, including `poi-ooxml`, are in your `pom.xml` for Maven management.

3. **Configuration**:
   - Edit `config.properties` for any environment-specific settings.
   - Modify `testng.xml` to set up suites, parallel execution, and other test parameters.

4. **Execute Tests**:
      mvn test  

## Reusing in Future Projects

To use this framework in new projects:
1. Copy the `src`, `resources`, and configuration files.
2. Update `testng.xml` and `config.properties` based on project requirements.
3. Add and customize test cases as needed, using Excel files for data-driven testing if applicable.

## Dependencies

- **JDK 21**
- **TestNG** (recommended version 7.0+)
- **Apache POI (poi-ooxml)** for Excel file operations
- **Selenium WebDriver** (for browser automation)
- **Maven** (for dependency and build management)

## Contributing

Fork the repository, submit issues, or create pull requests to contribute improvements or add new features.

## License

This project is licensed under the MIT License.
