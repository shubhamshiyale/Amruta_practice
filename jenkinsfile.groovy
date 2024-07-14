pipeline{
    agent any 
    
    stages{
        stage('stage-1'){
            steps{
                script{

                    println 'My name is: ' + params.name
                    def people_name = params.name.split(',')
                    for (nav in people_name) {
                        println 'My name is: ' + nav
                        if(nav == "amruta"){
                            println "haha she is getting married ..!"
                        }else if(nav == "shubham"){
                            println "humare to maje hai..!"
                        }

                    }
                    if(!params.name.contains("sharjeel")){
                        println 'pata nahi ab kaha hai .?'
                    }
                    
                }
            }
        }
    }
}