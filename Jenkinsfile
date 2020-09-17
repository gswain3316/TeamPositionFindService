pipeline {
	agent any
	
	tools{
		maven "3.6.3"
	}
	
	stages {
	
	 	stage('Checkout') {
            git url: 'https://github.com/gswain3316/football5/tree/master/Team_Standing_microservice', branch: 'master'
        }
	
		triggers {
		pollSCM '*****'
		}
	
		stage('Build'){
			sh 'mvn clean install'
		}
		
		stage('Build Docker Image'){
			sh 'docker build -t gswain3316/football5:1.0.0'
		}
		stage ('Push Docker Image') {
            sh 'docker login -u gswain3316 -p Qwerty@123'
            sh 'docker push gswain3316/football5:1.0.0'
        }
        stage ('Run Container on AWS Server') {
            def dockerRun = 'docker run -p 8080:8080 -d --name footballApp gswain3316/football5:1.0.0'
            sshagent(['dev-server']){
            	sh "ssh -o StrictHostKeyChecking=no Ubuntu@18.217.63.227 ${dockerRun}"
            }
        }
	}
}