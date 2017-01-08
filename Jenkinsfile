#!groovy
//Jenkinsfile (Scripted Pipeline)
node { // <1>
  
   //echo 'Current SCM Branch: ' + env.BRANCH_NAME; 
   //echo 'Current SCM Branch: ${BRANCH_NAME}'; 
   //echo 'Current SCM Branch: ${env.BRANCH_NAME}';
   
   /*
   echo 'Beginning of ENV vars'; 
   //env.each{ k, v -> println "${k}:${v}" };
   
   sh 'env > env.txt'
    readFile('env.txt').split("\r?\n").each {
        println it
        echo it
    }
   echo 'End of ENV vars';  
   */
   
   //Setting an environment variable within a Jenkins Pipeline can be done with the withEnv 
   /*withEnv(["PATH+MAVEN=${tool 'M3'}/bin"]) {
        sh 'mvn -B verify'
    }*/
   
   echo 'Current Build Number: ' + currentBuild.number;  

   echo 'Parameter Owner: ' + params.owner;
  
   
    stage('Build') { // <2>
       echo 'Checking out the EDGE project...';
       checkout scm 
       //checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/RameshThangamuthu/Sample']]]);
       echo 'Building the EDGE project...';
       
       
       
       //archiveArtifacts captures the files built matching the include pattern (**/target/*.jar) and saves them to the Jenkins master for later retrieval.
       //Archiving artifacts is not a substitute for using external artifact repositories such as Artifactory or Nexus and should be considered only for basic reporting and file archival.
       //archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true //
       
       //The stash step allows capturing files matching an inclusion pattern (**/target/*.jar) for reuse within the same Pipeline. Once the Pipeline has completed its execution, stashed files are deleted from the Jenkins master.
       //stash includes: '**/target/*.jar', name: 'app' // <1>
       /* .. snip .. */
    }
    stage('Test') {
       echo 'Testing the EDGE project...';
       try {
            //sh 'make check'
        }
        finally {
            //junit '**/target/*.xml'
        }
        /* .. snip .. */
    }
    stage('Deploy') {
       echo 'Deploying the EDGE project...';
       if (currentBuild.result == 'SUCCESS') {
          echo 'Success Success'
       }
        /* .. snip .. */
    }
}
