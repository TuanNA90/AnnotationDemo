# AnnotationDemo
Demo annotation with Activity, Fragment, Adapter, etc.

# Guide install annotaion into project
1. into /app and open file build.gradle and insert commands below:
"
  apply plugin: 'android-apt'
  def AAVersion = 'XXX' // XXX is version annotation
  
  apt {
    arguments {
        androidManifestFile variant.outputs[0].processResources.manifestFile
    }
  }
  
  dependencies {
    /*Annotation*/
    apt "org.androidannotations:androidannotations:$AAVersion"
    compile "org.androidannotations:androidannotations-api:$AAVersion"
  }
"
2. in project folder tree. open file build.gradle and insert commands below:
"
  buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:1.3.0'
        classpath 'com.neenbedankt.gradle.plugins:android-apt:1.4'
    }
  }
"

# How to using annotation
reference: http://androidannotations.org/
