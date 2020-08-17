// MPL-based pipeline
@Library('mpl') _

pipeline {
	agent {
		label 'megawise-gis'
	}
	stages {
		stage ('Build') {
			steps {
				MPLModule()
			}
		}
	}
	post {
        always {
            MPLPostStepsRun('always')
        }
        success {
            MPLPostStepsRun('success')
        }
        failure {
            MPLPostStepsRun('failure')
        }
    }
}