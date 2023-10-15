plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("top.jfunc.json:Json-Gson:1.0")
    implementation("top.jfunc.json:Json-Gson:1.0")
    implementation("top.jfunc.json:Json-Gson:1.0")
    implementation("top.jfunc.json:Json-Gson:1.0")
    implementation("top.jfunc.json:Json-Gson:1.0")
    implementation("top.jfunc.json:Json-Gson:1.0")
    implementation("top.jfunc.json:Json-Gson:1.0")
    implementation("top.jfunc.json:Json-Gson:1.0")
    implementation("top.jfunc.json:Json-Gson:1.0")
    implementation("top.jfunc.json:Json-Gson:1.0")
    implementation("top.jfunc.json:Json-Gson:1.0")
    implementation("top.jfunc.json:Json-Gson:1.0")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}