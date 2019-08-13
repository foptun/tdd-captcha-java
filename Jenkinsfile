node {
 
 checkout scm
 /*
  * In order to communicate with the MySQL server, this Pipeline explicitly
  * maps the port (`3306`) to a known port on the host machine.
  */
 docker.image('mysql:5').withRun('-e "MYSQL_ROOT_PASSWORD=my-secret-pw" -p 3306:3306') { c ->
     /* Wait until mysql service is up */
     sh 'while ! mysqladmin ping -h0.0.0.0 --silent; do sleep 1; done'
     /* Run some tests which require MySQL */
     sh 'make check'
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
