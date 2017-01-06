#!groovy
node {
   echo 'Hello World scm Ramesh';
   echo 'Current SCM Branch: ' + BRANCH_NAME; 
   echo 'Current SCM Branch: ' + env.BRANCH_NAME; 
   echo 'Current SCM Branch: ${BRANCH_NAME}'; 
   echo 'Current SCM Branch: ${env.BRANCH_NAME}'; 
   echo 'Current Build Number: ' + currentBuild.number;  
   echo 'Current Build result: ' + currentBuild.result;
   echo 'Parameter Owner: ' + params.owner;
}

node {
     checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/RameshThangamuthu/Sample']]]);
}
