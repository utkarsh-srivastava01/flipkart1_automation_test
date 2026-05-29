pipeline {

agent any

tools {
    jdk 'jdk21'
    maven 'Maven12'
}

stages {

    stage('Git Checkout') {
        steps {
            git branch: 'main',
            url: 'https://github.com/utkarsh-srivastava01/flipkart_automation_test.git'
        }
    }

    stage('Clean Project') {
        steps {
            bat 'mvn clean'
        }
    }

    stage('Run Cucumber Tests') {
        steps {
            bat 'mvn test'
        }
    }

    stage('Publish Cucumber Report') {
        steps {
            publishHTML(target: [
                allowMissing: true,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target/cucumber-reports',
                reportFiles: 'cucumber.html',
                reportName: 'Flipkart Cucumber Report'
            ])
        }
    }

    stage('Publish TestNG Report') {
        steps {
            publishHTML(target: [
                allowMissing: true,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target/surefire-reports',
                reportFiles: 'index.html',
                reportName: 'TestNG Report'
            ])
        }
    }
}

post {

    always {

        archiveArtifacts(
            artifacts: 'target/cucumber-reports/*, target/surefire-reports/*',
            allowEmptyArchive: true
        )

        junit allowEmptyResults: true,
              testResults: 'target/surefire-reports/*.xml'
    }

    success {
        echo 'Flipkart Automation Execution Successful'
    }

    failure {
        echo 'Flipkart Automation Execution Failed'
    }
}