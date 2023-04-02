pipeline {
    agent any
    stages {
        stage('Selenium Test') {
            steps {
                seleniumIDE(
                    testFiles: 'path/to/test-suite.xml',
                    browsers: 'chrome'
                )
            }
        }
    }
}
