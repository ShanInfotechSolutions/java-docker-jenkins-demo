pipeline {
  agent any

  environment {
    IMAGE_NAME = "shaninfotech/dockerintegratingdemo/java-maven-app"
    TAG = "latest"
  }

  stages {
    stage('Build with Maven') {
      steps {
        sh 'mvn clean package'
      }
    }

    stage('Build Docker Image') {
      steps {
        sh 'docker build -t $IMAGE_NAME:$TAG .'
      }
    }

    stage('Run Docker Container') {
      steps {
        sh 'docker run --rm $IMAGE_NAME:$TAG'
      }
    }
  }
}
