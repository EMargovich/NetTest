pipeline {
    agent any
    tools {
        jdk 'Java' // Name from Global Tool Configuration
    }



  stages {
     stage('javac') {
        steps {
            script {
                sh '''
               
                javac src/Bubble.java
                javac src/TextMessage.java
                javac src/Server.java
               
                '''
            }
        }  
     }

    stage('java') {
        steps {
                sh '''
                java Bubble
                java Server
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
