pipeline{
    agent any 
    
    stages{
        stage('stage-1'){
            steps{
                script{
                    println 'My name is: ' + params.name 
                    println 'My srname is: ' + params.surname  
                }
            }
        }
    }
}