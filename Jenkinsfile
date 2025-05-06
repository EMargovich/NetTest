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
        sh '''
        cd src
        dir
        '''
  
      }
    }
      
     stage('javac') {
        steps {
            script {
                sh '''
               
                javac src/TextMessage.java
                javac -d src -cp src src/Server.java
                javac -cp src src/Client.java
              
               
               
                '''
            }
        }  
     }

        
    stage('java') {
        steps {
                sh '''
                java Bubble
                java -cp src src/Server
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
