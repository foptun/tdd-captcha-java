node {
 
 stage 'Checkout'
  checkout scm
 stage 'docker ps'
  sh "docker ps"
 stage 'which docker-compose'
  sh "which docker-compose"
 stage 'docker-compose -v'
  sh "docker-compose -v"
 stage('End'){
  echo 'End'
 }
 
}
