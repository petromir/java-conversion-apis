# Java Conversion APIs

This project defines a set of Java API definitions designed to provide a common abstraction for various data 
conversions. By using these APIs, you can decouple your application's core logic from specific third-party library implementations (such as Jackson, Gson, or others), making it easier to switch between them or support multiple implementations.

> [!WARNING]
> Under active development 🚧

## Conversion Types

### JSON

The `json-convertion-api` library provides a unified interface for JSON serialization and deserialization.

#### Key Features:
- **Generic Abstraction**: Works with any JSON library through the `JsonConverter` interface.
- **Support for Common Data Types**: Methods for converting objects, lists, sets, and maps.
- **Custom Exceptions**: Uses `JsonConversionException` for consistent error handling across different implementations.
- **Delegate Access**: Allows access to the underlying library's native object (e.g., `JsonMapper` in Jackson) when 
  needed.

## Usage

### Add to your project
#### Import the bom
```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>com.petromirdzhunev</groupId>
            <artifactId>java-conversion-apis-bom</artifactId>
            <version>${java_conversions_apis_bom_version}</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```
replace `${java_comersions_apis_bom_version}` with the last version.

#### Add specific dependency
Once bom is in place, add the conversion API of choice
```xml
<dependencies>
    <dependency>
        <groupId>com.petromirdzhunev</groupId>
        <artifactId>json-convertion-api</artifactId>
    </dependency>
</dependencies>
```

## Development

### Prerequisites
1. [Install SDKMAN](https://sdkman.io/install)
2. Initialize SDKMAN environment
```shell
sdk env install
```
Check [.sdkmanrc](.sdkmanrc) for all the tools installed with this command.

### Build and publish `SNAPSHOT` versions to local repository
Change the version by adding a `-SNAPSHOT` suffix in the [pom.xml](pom.xml) file and then execute:
```shell
 mvnd -B clean install
```

### Pointing to a local version
```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>com.petromirdzhunev</groupId>
            <artifactId>java-comersion-apis-bom</artifactId>
            <version>0.0.1-SNAPSHOT</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```
