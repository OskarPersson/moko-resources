/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

buildscript {
    repositories {
        mavenCentral()
        google()

        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")

        gradlePluginPortal()
    }
    dependencies {
        classpath("com.oskar:resources-generator")
        classpath(libs.composeJetBrainsPlugin)
        classpath(":resources-build-logic")
    }
}

allprojects {
    plugins.withId("org.gradle.maven-publish") {
        group = "dev.icerock.moko"
        version = moko.versions.resourcesVersion.get()
    }
}
