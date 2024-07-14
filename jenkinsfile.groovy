pipeline{
    agent any 
    
    stages{
        stage('stage-1'){
            steps{
                script{
                    //name = "shubham,amruta,pallavi"
                    people_names = params.name.split(',') 
                    for(name in people_names){
                        println 'My name is: ' + name
                    }
                }
            }
        }
    }
}