# AnnotationDemo
Demo annotation with Activity, Fragment, Adapter, etc.

# Guide install annotaion into project
1. into /app and open file build.gradle and insert commands below:
<br/>
"
  apply plugin: 'android-apt' <br/>
  def AAVersion = 'XXX' // XXX is version annotation <br/>
  <br/>
  apt { <br/>
    arguments { <br/>
        androidManifestFile variant.outputs[0].processResources.manifestFile <br/>
    } <br/>
  } <br/>
  <br/>
  dependencies { <br/>
    /*Annotation*/ <br/>
    apt "org.androidannotations:androidannotations:$AAVersion" <br/>
    compile "org.androidannotations:androidannotations-api:$AAVersion" <br/>
  } <br/>
" <br/>
2. in project folder tree. open file build.gradle and insert commands below: <br/>
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
