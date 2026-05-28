pipeline {
 
    agent any
 
    tools {

        jdk 'JDK21'

        maven 'Maven3'

    }
 
    stages {
 
        stage('Git Checkout') {

            steps {

                git 'https://github.com/utkarsh-srivastava01/flipkart_automation_test.git'

            }

        }
 
        stage('Clean Project') {

            steps {

                bat 'mvn clean'

            }

        }
 
        stage('Run Tests') {

            steps {

                bat 'mvn test'

            }

        }
 
        stage('Generate Reports') {

            steps {

                publishHTML([

                    allowMissing: false,

                    alwaysLinkToLastBuild: true,

                    keepAll: true,

                    reportDir: 'reports',

                    reportFiles: 'ExtentReport.html',

                    reportName: 'Extent Report'

                ])

            }

        }

    }
 
    post {
 
        always {

            archiveArtifacts artifacts: 'reports/*'

        }
 
        success {

            echo 'Pipeline Executed Successfully'

        }
 
        failure {

            echo 'Pipeline Failed'

        }

    }

}
 

 