load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "masamune",
    srcs = glob([
        "src/main/java/com/darthbinamira/masamune/*.java",
    ]),
    main_class = "com.darthbinamira.masamune.Runner",
    deps = [
        "@maven//:io_playn_playn_core",
        "@maven//:io_playn_playn_scene",
        "@maven//:io_playn_playn_java_base",
        "@maven//:io_playn_playn_java_lwjgl",
        "@maven//:com_samskivert_pythagoras",
        "@maven//:com_threerings_react",
    ],
    runtime_deps = select({
        "@bazel_tools//src/conditions:windows": [
            "@maven//:org_lwjgl_lwjgl_natives_windows",
            "@maven//:org_lwjgl_lwjgl_glfw_natives_windows",
            "@maven//:org_lwjgl_lwjgl_opengl_natives_windows",
        ],
        "@bazel_tools//src/conditions:darwin": [
            "@maven//:org_lwjgl_lwjgl_natives_macos",
            "@maven//:org_lwjgl_lwjgl_glfw_natives_macos",
            "@maven//:org_lwjgl_lwjgl_opengl_natives_macos",
        ],
        "//conditions:default": [
            "@maven//:org_lwjgl_lwjgl_natives_linux",
            "@maven//:org_lwjgl_lwjgl_glfw_natives_linux",
            "@maven//:org_lwjgl_lwjgl_opengl_natives_linux",
        ],
    }),
)
