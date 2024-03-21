pipeline {
    agent any

    environment {
        JAVA_HOME = '/usr/lib/jvm/java-17-openjdk-arm64'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/d4-tr/ops.git', branch: 'main'
            }
        }

        stage('Run Maven Test') {
            steps {
                withEnv(["JAVA_HOME=${env.JAVA_HOME}"]) {
	                sh 'pwd'
	                sh 'printenv'
	                sh 'mvn test'
                }
            }
        }
    }
}