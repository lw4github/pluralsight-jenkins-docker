pipeline {
  agent any
  stages {
    stage('stage1') {
      steps {
        echo "This is build number $BUILD_NUMBER of demo $DEMO"
        sh '''
             echo "Using a multi-line shell step'
             chmod +x test.sh
              ./test.sh
          '''
      }
    }

  }
  environment {
    DEMO = '1'
  }
}
