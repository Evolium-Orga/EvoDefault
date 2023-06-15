# BaseTemplate Plugin

The BaseTemplate plugin serves as a starting point for developing Bukkit plugins in Java. It provides a basic template structure and essential components to help you get started quickly.

## Getting Started

To utilize HysummitPluginTemplate plugin, follow these steps:

1. Clone the repository or download the source code to your local machine.
2. Set up your development environment with the required dependencies and libraries.
3. Import the project into your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse). We recommend the use of IntelliJ IDEA!
4. Update plugin name references in files
   1. settings.gradle
   2. build.gradle.kts
   3. plugin.yml
5. Customize the plugin according to your specific requirements. Make changes to the provided code or add your own classes to extend the functionality.
6. Once finished setting up, replace this file's contents with the contents from "README-plugin.md" and delete the latter. 

## Coding Rules

When working on the BaseTemplate plugin, please adhere to the following coding rules and conventions:

1. **Package Naming**: Packages should be named in lowercase with words separated by periods. For example: `net.hysummit.rtp.playermanager`.
2. **Class Naming**: Class names should follow PascalCase (UpperCamelCase), starting with an uppercase letter. For example: `BaseTemplate`, `ExampleExecutor`, `JoinManager`.
3. **Variable Naming**: Variables should use camelCase starting with a lowercase letter. For example: `logger`, `formator`, `pm`.
4. **Constant Naming**: Constants should be in uppercase with words separated by underscores. For example: `WELCOME_MESSAGE`, `DEBUG_MODE`.
5. **Indentation and Formatting**: Use consistent indentation (spaces rather than tabs) for improved code readability. Follow consistent formatting rules, such as placing opening braces on the same line as the corresponding method or class declaration.
6. **Comments**: Include comments to explain the purpose and functionality of classes, methods, and important code sections. Comments should be clear, concise, and provide useful information.
7. **Error Handling**: Implement proper error handling using try-catch blocks or propagating exceptions to the appropriate level.
8. **Use of Final and Static**: Utilize the `final` keyword for constant variables and the `static` keyword for class-level variables and methods when appropriate.
9. **Code Organization**: Group related code together! Only the main class should be at the root of the plugin. Use appropriate access modifiers (`public`, `private`) to control visibility and accessibility of class members.
10. **Naming Convention for Methods**: Method names should use camelCase and be descriptive of their purpose. For example: `onEnable`, `onDisable`, `setCommands`, `loadConfigFiles`.

Please keep these coding rules in mind while working on your plugin to maintain code consistency and readability.

## Known Issue

If when you try to load the gradle project you get this error `Unsupported class file major version 64` and if setting your project sdk to 17 doesn't fix this issue then it probably mean that your Gradle settings are trying to use Java 20. You can solve it by clicking on Gradle -> the little cogwheel -> Gradle Settings and setting Gradle JVM to 17.


## Contributing

If you find any issues, have suggestions, or would like to contribute to the project, feel free to open an issue or submit a pull request. Your contributions are greatly appreciated!
