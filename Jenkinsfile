pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                echo 'Cloning the Git repository...'
                script {
                    def projectDir = 'Api_project'
                    if (fileExists(projectDir)) {
                        echo "Directory '${projectDir}' exists. Pulling latest changes..."
                        bat """
                        cd ${projectDir}
                        git reset --hard
                        git pull
                        """
                    } else {
                        echo "Directory '${projectDir}' does not exist. Cloning repository..."
                        bat "git clone https://github.com/Cherry9676/Api_project.git"
                    }
                }
            }
        }
        stage('Run Tests') {
            steps {
                echo 'Navigating to the project directory and running tests...'
                bat '''
                cd Api_project
                mvn clean test
                '''
            }
        }
    }
    post {
        always {
            echo 'Pipeline execution completed.'
        }
    }
}
