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
        stage('Update XRay') {
           steps {
               script{
                       bat '''
                           cat xray-infos.json | sed -r "s/<build>/${BUILD_NUMBER}/g" | sed -r "s/<job>/${JOB_NAME}/g" | sed -r "s/<testPlanKey>/${TEST_PLAN_KEY}/g" > temp.json
                           mv temp.json xray-infos.json
                           zip results.zip /target/surefire-reports/testng-results.xml
                       '''
                       env.TEST_EXEC_KEY = sh(script:"curl -s -H 'accept: application/json' -H 'Content-Type: multipart/form-data' -H 'Authorization: Bearer ${JIRA_XRAY_TOKEN}' -F 'file=@results.zip' POST https://team-1612820401992.atlassian.net/jira/software/projects/BACBPI/boards/48/backlog |  jq -r .testExecIssue.key", returnStdout:true).trim();
                       bat "curl -H 'Content-Type: application/json' -H 'Authorization: Bearer ${JIRA_XRAY_TOKEN}' -X PUT  --data '@xray-infos.json' https://team-1612820401992.atlassian.net/jira/software/projects/BACBPI/boards/48/backlog/${TEST_EXEC_KEY}"               }
          }
       }

    }
}
