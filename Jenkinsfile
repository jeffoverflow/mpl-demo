// MPL-based pipeline
@Library('mpl') _

def mpl = MPLPipelineConfig([:])

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