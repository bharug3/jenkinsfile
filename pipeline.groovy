pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh"Hash=$(git log -1)"
                sh"Branch=$(git branch)"
                sh"echo "Git Hash: $(Hash)""
                sh"echo "Git Branch : $(Branch)""
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
