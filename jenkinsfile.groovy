pipeline{
    agent any 
    
    stages{
        stage('stage-1'){
            steps{
                script{
                    println 'My name is: ' + params.name
                    def people_name = params.name.split(',')
                    for (element in people_name) {
                        println 'My name is: ' + element
                    }
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