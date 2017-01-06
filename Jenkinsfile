#!groovy
node {
   echo 'Hello World scm Ramesh'
}

node {
     checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/RameshThangamuthu/Sample']]])
   pwd()
}
