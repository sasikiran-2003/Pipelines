pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/sasikiran-2003/Pipelines.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project...'
                sh 'mvn clean install'   // Use `bat` if on Windows
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'            // Use `bat` if on Windows
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully.'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}
