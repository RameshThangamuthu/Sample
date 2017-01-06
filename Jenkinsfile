#!groovy
//Jenkinsfile (Scripted Pipeline)
node { // <1>
   
   //echo 'Current SCM Branch: ' + BRANCH_NAME; 
   //echo 'Current SCM Branch: ' + env.BRANCH_NAME; 
   //echo 'Current SCM Branch: ${BRANCH_NAME}'; 
   //echo 'Current SCM Branch: ${env.BRANCH_NAME}'; 
   echo 'Current Build Number: ' + currentBuild.number;  
   //echo 'Current Build result: ' + currentBuild.result;
   echo 'Parameter Owner: ' + params.owner;
   
   
    stage('Build') { // <2>
       echo 'Checking out the EDGE project...';
       checkout scm 
       //checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/RameshThangamuthu/Sample']]]);
       echo 'Building the EDGE project...';
       
       
       
       //archiveArtifacts captures the files built matching the include pattern (**/target/*.jar) and saves them to the Jenkins master for later retrieval.
       //Archiving artifacts is not a substitute for using external artifact repositories such as Artifactory or Nexus and should be considered only for basic reporting and file archival.
       archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true //
       /* .. snip .. */
    }
    stage('Test') {
       echo 'Testing the EDGE project...';
        /* .. snip .. */
    }
    stage('Deploy') {
        echo 'Deploying the EDGE project...';
       if (currentBuild.result == 'SUCCESS') {
       }
        /* .. snip .. */
    }
}
