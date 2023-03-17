
pipeline{
  agent any
  stages{
    stage('Init'){steps{echo "Initing..."}}
    stage('Build'){steps{echo "Build..."}}
    stage('Deploy'){steps{echo "Deploy complete."}}
  }
  
}
