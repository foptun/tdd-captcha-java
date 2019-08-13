node {
 
 //stage('Checkout SCM'){
 // checkout scm
// }
 stage 'PS' 
  sh 'docker ps'
 
 docker.image('node:latest').withRun('--name node_test') { c ->
  sh 'docker ps'
  sh 'docker exec -it node_test /bin/bash '
 }
 
 
 /*
 docker.image('node:latest') { c ->
  echo 'in docker image'
  sh 'node -v'
 }
 */
/* stage 'Checkout'
  checkout scm
 stage 'docker ps'
  sh "docker ps"
 stage 'which docker-compose'
  sh "which docker-compose"
 stage 'docker-compose -v'
  sh "docker-compose -v"
 stage('npm install'){
  echo 'npm install'
// sh 'npm install
 }
*/ 
 
}
