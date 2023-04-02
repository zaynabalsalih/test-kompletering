pipeline {
    agent any
    stages {
        stage('Selenium Test') {
            steps {
                seleniumIDE(
                    testFiles: 'C:/Users/Zaynab/Desktop/test/test code/SelenTest.java',
                    browsers: 'chrome'
                )
            }
        }
    }
}
