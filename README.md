# Tango REST API Java reference

Please read about Tango REST API in the Tango documentation: [link](http://tango-controls.readthedocs.io/en/latest/development/advanced/rest-api.html)

This repository provides Java reference implementation which can be used for server/client development using Java:

This is __NOT A SERVER__! Known server implementations are listed in [tango-rest-api](https://github.com/tango-controls/rest-api) repository. 

# How to use

1. Add  GitHub Maven packages repo to pom.xml/settings.xml

```xml
<repositories>
    <repository>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
        <id>github-hzg</id>
        <url>https://maven.pkg.github.com/hzg-wpi/*</url>
    </repository>
</repositories>
```

2. Add corresponding server to settings.xml

```xml
 <server>
    <id>github-hzg</id>
    <username>GITHUB_USER</username>
    <password>GITHUB_TOKEN</password>
</server>
```

3. Add corresponding dependency to your pom.xml e.g. server:

```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>de.hereon.tango</groupId>
            <artifactId>rest-api-bom</artifactId>
            <version>2.3</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

See GitHub docs: [here](https://docs.github.com/en/packages/guides/configuring-apache-maven-for-use-with-github-packages)

