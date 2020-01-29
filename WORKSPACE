load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

RULES_JVM_EXTERNAL_TAG = "3.0"
RULES_JVM_EXTERNAL_SHA = "62133c125bf4109dfd9d2af64830208356ce4ef8b165a6ef15bbff7460b35c3a"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
   artifacts = [
    "org.lwjgl:lwjgl:3.1.6",
    "org.lwjgl:lwjgl-glfw:3.1.6",
    "org.lwjgl:lwjgl-opengl:3.1.6",
    "org.lwjgl:lwjgl:jar:natives-windows:3.1.6",
    "org.lwjgl:lwjgl-glfw:jar:natives-windows:3.1.6",
    "org.lwjgl:lwjgl-opengl:jar:natives-windows:3.1.6",
    "io.playn:playn-core:2.0.4",
    "io.playn:playn-scene:2.0.4",
    "io.playn:playn-java-base:2.0.4",
    "io.playn:playn-java-lwjgl:2.0.4",
    "io.playn:playn-jbox2d:2.0.4",
    "org.jbox2d:jbox2d-library:2.2.1.1",
    "com.samskivert:pythagoras:1.4.3",
    "com.threerings:react:1.5.4",
    "org.java-websocket:Java-WebSocket:1.3.0",
    "com.googlecode.soundlibs:jlayer:1.0.1-1",
    "com.googlecode.soundlibs:mp3spi:1.9.5-1",
    "com.googlecode.soundlibs:tritonus-share:0.3.7-1",
    "junit:junit:3.8.2",
   ],
   repositories = [
        "https://repo1.maven.org/maven2",
    ],
)
