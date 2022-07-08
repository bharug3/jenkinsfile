pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                Hash=$(git log -1)
                Branch=$(git branch)
                echo "Git Hash: $Hash"
                echo "Git Branch : ${Branch}"
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
