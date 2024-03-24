plugins {
    id("java")
}

allprojects {
    group = "my-groupId"
    version = "my-version"
}

subprojects {
    apply (plugin =  "java")

    repositories {
        mavenLocal()
        mavenCentral()
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.compilerArgs.add("-parameters")
    }

//    tasks.withType<TestJavaCompile> {
//        options.encoding = "UTF-8"
//    }

    java {

        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    tasks.withType<Test> {
        systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
    }
}