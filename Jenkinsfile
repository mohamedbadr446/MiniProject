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
                          bat '''curl -k -H "Content-Type: target/surefire-reports/testng-results.xml" -X POST -H "Authorization: Bearer "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnQiOiJiNmNhZGQwNS1lMzQxLTNmMTctYjU1Zi00OTM0MTI4MWQ4MmEiLCJhY2NvdW50SWQiOiI2MmU3ZmNmMDNjYzIwYzA2YzhhZTMyYjYiLCJpc1hlYSI6ZmFsc2UsImlhdCI6MTY2MDgzNTA4MywiZXhwIjoxNjYwOTIxNDgzLCJhdWQiOiJEMkE5RTBGMTMyRTM0NUFBODRGNzk5MTY4MUE5QkU3MCIsImlzcyI6ImNvbS54cGFuZGl0LnBsdWdpbnMueHJheSIsInN1YiI6IkQyQTlFMEYxMzJFMzQ1QUE4NEY3OTkxNjgxQTlCRTcwIn0.i9IqKtM1u7Xniq4BZszUgWYh8P9nLZ1DdKP3qfjBqtw"  --data @"testng-results.xml" https://xray.cloud.getxray.app/api/v1/import/execution/cucumber'''
                      }
             }
        }
    }
}
