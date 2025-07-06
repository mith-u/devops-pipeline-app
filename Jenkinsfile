pipeline {
  agent any

  stages {
    stage('Clone Repo') {
  steps {
    git branch: 'main', url: 'https://github.com/mith-u/devops-pipeline-app.git'
  }
}
}

    stage('Build with Maven') {
      steps {
        sh 'mvn clean package'
      }
    }

    stage('Run Unit Tests') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Docker Build') {
      steps {
        sh 'docker build -t devops-app .'
      }
    }

    stage('Docker Run') {
      steps {
        sh 'docker rm -f devops-app || true'
        sh 'docker run -d -p 8082:8080 --name devops-app devops-app'
      }
    }
  }
}

