pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh"Hash=${git log -1}"
                echo"Git Hash: ${Hash}"
                sh"Branch=${git branch}"
                echo"Git Branch : ${Branch}"
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
