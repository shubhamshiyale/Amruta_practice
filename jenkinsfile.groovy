pipeline{
    agent any 
    
    stages{
        stage('stage-1'){
            steps{
                script{
                    println 'My name is: ' + params.name
                    //name = "shubham,amruta,pallavi"
                    // def people_names = params.name.split(',') 
                    // for(value in people_names){
                    //     println 'My name is: ' + value
                    // }
                }
            }
        }
    }
}