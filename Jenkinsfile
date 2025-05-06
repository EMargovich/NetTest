pipeline {
    agent any
    tools {
        jdk 'Java' // Name from Global Tool Configuration
    }



  stages {

    stage('check dir') {
       steps {
        echo 'Start'
        sh 'dir'
  
      }
    }
      
     stage('javac') {
        steps {
            script {
                sh '''
               
                javac TextMessage.java
                javac Server.java
              
               
               
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
