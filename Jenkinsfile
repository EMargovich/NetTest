pipeline {
    agent any
    tools {
        jdk 'Java' // Name from Global Tool Configuration
    }



  stages {
     stage('run Server') {
        steps {
            script {
                sh '''
               
                javac src/ShowMessage.java
                java src.ShowMessage
                '''
            }
        }  
     }

    stage('run Client') {
        steps {
                sh '''
                javac src/Client.java
                java src/Client
                '''
            }
        }  
    
     
    stage ("build") {
      steps {
        echo 'building the application...'
        echo 'Application built'
  
      }
    }
    stage ("test") {
      steps {
        echo 'testing the application...'
      }
    }
    stage ("deploy") {
      steps {
        echo 'deploying the application...'
      }
    }    
  }
}
