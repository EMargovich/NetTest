pipeline {
    agent any
    tools {
        jdk 'Java' // Name from Global Tool Configuration
    }



  stages {
     stage('run Server') {
        steps {
                sh '''
                //Здесь нужно переработать адресацию. Класс TextMessage компилируется в src. Нужно обеспечить к нему доступ из Server
                javac src/TextMessage.java
                javac src/Server.java
                java src/Server
                '''
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
