
rootProject.name = "kotlin-debugger-project"

include(":kotlin-debugger-jvm")
include(":kotlin-debugger-bistoury")
include(":kotlin-debugger-bistoury:kotlin-debugger-bistoury-spy")
include(":kotlin-debugger-bistoury:kotlin-debugger-bistoury-agent")
include(":kotlin-debugger-bistoury:kotlin-debugger-bistoury-client")
include(":kotlin-debugger-bistoury:kotlin-debugger-bistoury-proxy")
include(":kotlin-debugger-bistoury:kotlin-debugger-bistoury-remoting")
include(":kotlin-debugger-bistoury:kotlin-debugger-bistoury-serverside-common")

include(":kotlin-debugger-arthas:kotlin-debugger-arthas-client")
include(":kotlin-debugger-arthas:kotlin-debugger-arthas-common")
include(":kotlin-debugger-arthas:kotlin-debugger-arthas-cli")