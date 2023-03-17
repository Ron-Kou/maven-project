pipeline {
    agent any
    stages {
        stage('Init') { steps {
            echo "Initing..."
        } }
        stage('Build') { steps {
            echo "Build..."
            sh 'mvn package'
        }
            post {
                success{
                    echo 'start archiving...'
                    archiveArtifacts artifacts: '**/target/*.war'
                    echo 'archivie complete'
                }
            }
        }

    }

}
