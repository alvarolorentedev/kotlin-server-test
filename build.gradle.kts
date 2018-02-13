import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.junit.platform.gradle.plugin.EnginesExtension
import org.junit.platform.gradle.plugin.FiltersExtension
import org.junit.platform.gradle.plugin.JUnitPlatformExtension

group = "com.kanekotic"
version = "1.0-SNAPSHOT"

buildscript {
    var kotlin_version: String by extra
    kotlin_version = "1.2.10"

    repositories {
        mavenCentral()
    }
    
    dependencies {
        classpath(kotlinModule("gradle-plugin", kotlin_version))
        classpath("org.junit.platform:junit-platform-gradle-plugin:1.0.0")
    }
    
}

apply {
    plugin("java")
    plugin("kotlin")
    plugin("org.junit.platform.gradle.plugin")
}

//configure {
//    filters {
//        engines {
//            include("spek")
//        }
//    }
//}


val kotlin_version: String by extra

repositories {
    mavenCentral()
    jcenter()
    maven { url = uri("https://dl.bintray.com/kotlin/kotlinx") }
    maven { url = uri("https://dl.bintray.com/kotlin/ktor") }
    maven { url = uri("http://dl.bintray.com/jetbrains/spek") }
}

dependencies {
    compile(kotlinModule("stdlib-jdk8", kotlin_version))
    compile("org.koin","koin-core","0.8.2")
    compile("io.vertx","vertx-web-client","3.5.0")
    compile("io.ktor","ktor-server-netty","0.9.1")
    compile("ch.qos.logback","logback-classic","1.2.1")
    testCompile("org.jetbrains.spek","spek-api","1.1.5")
    testCompile ("com.nhaarman","mockito-kotlin","1.5.0")
    testRuntime("org.jetbrains.spek","spek-junit-platform-engine","1.1.5")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

//fun JUnitPlatformExtension.filters(setup: FiltersExtension.() -> Unit) {
//    when (this) {
//        is ExtensionAware -> extensions.getByType(FiltersExtension::class.java).setup()
//        else -> throw Exception("${this::class} must be an instance of ExtensionAware")
//    }
//}
//fun FiltersExtension.engines(setup: EnginesExtension.() -> Unit) {
//    when (this) {
//        is ExtensionAware -> extensions.getByType(EnginesExtension::class.java).setup()
//        else -> throw Exception("${this::class} must be an instance of ExtensionAware")
//    }
//}

