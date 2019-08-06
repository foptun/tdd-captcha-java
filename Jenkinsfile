pipeline {
  agent {
    docker {
      image 'maven:3.6.1-jdk-8'
      args '-p 9090:8081'
    }

  }
  stages {
    stage('Start') {
      steps {
        echo 'Start Message'
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
  }
}