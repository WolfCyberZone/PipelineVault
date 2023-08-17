pipeline {
    agent any

    tools {
        // Install the Maven version and add it to the path.
        maven "MAVEN"
    }

    stages {
        stage('Build') {
            steps {
                // Get code from the GitHub repository
                git url: 'https://github.com/mcamacho777/Ufo2.git'

                // Run Maven on a Windows agent
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }

        stage('UnitTest') {
            steps {
                // Run Maven to execute the unit tests
                bat "mvn test"
            }

            post {
                always {
                    // Collect and archive the JUnit XML reports
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}
