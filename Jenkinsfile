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
                    bat 'cd C:/Jenkins/workspace/MiniProject_JenkinsFile/target/surefire-reports/'
                    bat '''curl -H "Content-Type: text/xml" -X POST -H "Authorization: Bearer "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnQiOiJiNmNhZGQwNS1lMzQxLTNmMTctYjU1Zi00OTM0MTI4MWQ4MmEiLCJhY2NvdW50SWQiOiI2MmI5ZDM3N2Y1M2Q5MTY3Mzg2N2IzYjYiLCJpc1hlYSI6ZmFsc2UsImlhdCI6MTY2MjY0ODA0OSwiZXhwIjoxNjYyNzM0NDQ5LCJhdWQiOiI1NzQ0NzkwNzc3OUI0NjYxQUUzNkM5RTY4ODY0MzhDMCIsImlzcyI6ImNvbS54cGFuZGl0LnBsdWdpbnMueHJheSIsInN1YiI6IjU3NDQ3OTA3Nzc5QjQ2NjFBRTM2QzlFNjg4NjQzOEMwIn0.kTHdKnbBMjKQpSocDiVO2Ftk8pH77fkvIz6EQcgF8lU"" --data @"testng-results.xml" https://xray.cloud.getxray.app/api/v1/import/execution/testng?projectKey=BACBPI  '''
                      }
             }
        }
    }
}
