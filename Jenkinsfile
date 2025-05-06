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
               
                '''
            }
        }  
     }

    stage('java') {
        steps {
                sh '''
                
                java Bubble
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
