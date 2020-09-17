node{
        def mvnHome = tool name: 'maven-3.6.3', type: 'maven'
        def mvn = "${mvnHome}/bin/mvn"
    stage('SCM Checkout'){
        git credentialsId: 'git-credentials', url: 'https://github.com/gswain3316/TeamPositionFindService'
    }
    stage('Mvn package jar'){
        bat "${mvn} clean package"
    }
    stage('Build Docker Image'){
        bat 'docker build -t gswain3316/footballAssignment:1.0.0 .'
    }
    stage('Push docker image to dockerhub registry'){
        withDockerRegistry(credentialsId: 'dockerHubCredential', url: 'https://www.docker.com/') {
        bat 'docker login docker.io'
        bat 'docker push gswain3316/footballAssignment:1.0.0'
    }
    }
    stage('Docker run container on server'){
        bat 'docker run -dp 8888:8888 gswain3316/footballAssignment:1.0.0'
    }
}