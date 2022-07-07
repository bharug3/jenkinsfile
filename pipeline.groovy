pipeline {
    agent any
    stages {
        stage ('Get Commit') {
            steps{
                script{
                    try {
                        treeMapData = git(branch: branchName, credentialsId: credential, url: "${gitLabServer}/${projectName}/${repo}.git")
                        echo treeMapData["GIT_COMMIT"]
                    } catch (Exception e) {
                        echo "${e}"
                    }
                }
            }
        }
    }
}
