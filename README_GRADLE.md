# 🛠️ Basic Gradle Commands Cheat Sheet (Using Wrapper)

## 🔧 Build and Clean
- `./gradlew build` – Compiles the project, runs tests, and generates build artifacts.
- `./gradlew clean` – Deletes generated files (`build/` directory).

## 🧪 Testing
- `./gradlew test` – Runs unit tests.
- `./gradlew test --rerun-tasks` – Forces test execution even if tasks are up-to-date.

## 🚀 Running the Application (requires `application` plugin)
- `./gradlew run` – Launches the application (make sure `mainClass` is defined in `build.gradle`).

## 📦 Dependencies
- `./gradlew dependencies` – Displays the dependency tree.
- `./gradlew dependencyInsight --dependency <name>` – Shows details about a specific dependency.

## 📋 Tasks and Help
- `./gradlew tasks` – Lists all available tasks.
- `./gradlew help` – Displays Gradle help information.

## 🔄 Wrapper and Version
- `./gradlew wrapper --gradle-version <version>` – Updates the Gradle wrapper to a specific version.
- `./gradlew --version` – Shows the current Gradle version.

## 🧠 Diagnostics
- `./gradlew help --scan` – Generates a detailed build scan report.
- `./gradlew help --warning-mode all` – Displays all deprecation warnings.

---

💡 **Tip**: Add `--info` or `--debug` for more detailed output:
```bash
./gradlew test --info
