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
            steps{
             script {
                    bat ''' curl -H "Content-Type: /target/surefire-reports/" -u admin:admin -F "file=@testng-results.xml" https://team-1612820401992.atlassian.net/jira/software/projects/BACBPI/boards/48'''

                      }
             }
        }
    }
}
