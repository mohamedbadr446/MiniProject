pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'git@github.com:mohamedbadr446/MiniProject.git'

                // Run Maven on a Windows agent.
                bat "mvn clean"

            }
        }
            stage('Test') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'git@github.com:mohamedbadr446/MiniProject.git'

                // Run Maven on a Windows agent.
                bat "mvn test -Dsurefire.suiteXmlFiles=testng.xml"

            }
        }
            stage('Import results to Xray') {

            steps {
                step([$class: 'XrayImportBuilder', endpointName: '/testng', importFilePath: 'target/surefire-reports/testng-results.xml', importToSameExecution: 'true', projectKey: 'BACBPI', serverInstance: '57447907779B4661AE36C9E6886438C0'])
            }

        }

    }
}
