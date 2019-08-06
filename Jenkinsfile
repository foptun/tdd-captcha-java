pipeline {
  agent {
    docker {
      image 'maven:3.6.1-jdk-8'
    }

  }
  stages {
    stage('Start') {
      parallel {
        stage('Start') {
          steps {
            echo 'Start Message'
          }
        }
        stage('Alert') {
          steps {
            input 'Confirm'
          }
        }
      }
    }
    stage('Clean') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn package'
      }
    }
    stage('Confirmm') {
      steps {
        input '"Xxx"'
        echo 'xXx'
      }
    }
  }
}