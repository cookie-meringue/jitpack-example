dependencies {
    // JSON 처리
    api("com.fasterxml.jackson.core:jackson-databind:2.15.3")
    api("com.fasterxml.jackson.core:jackson-annotations:2.15.3")

    // Lombok (선택)
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")
}

// 라이브러리로 배포
tasks.named<Jar>("jar") {
    enabled = true
    archiveClassifier.set("")
}
