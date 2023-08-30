dependencies {
    implementation("org.ow2.asm:asm:$asmVersion")
    implementation("org.ow2.asm:asm-util:$asmVersion")
    implementation("org.ow2.asm:asm-commons:$asmVersion")
    implementation("org.ow2.asm:asm-analysis:$asmVersion")
    implementation("org.ow2.asm:asm-tree:$asmVersion")

    implementation("com.wanna:kotlin-metrics:$kotlinMetricsVersion")
    implementation(project(":kotlin-debugger-bistoury:kotlin-debugger-bistoury-spy"))
}
