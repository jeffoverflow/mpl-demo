// MPL-based pipeline
@Library('mpl') _

pipeline {
	agent {
	  label 'megawise-gis'
	}
	stages {
		stage ('Build') {
			MPLModule()
		}
	}
}