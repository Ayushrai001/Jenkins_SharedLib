def call(){
  dependencyCheck additionalArguments: '--scan ./ --format XML --out . --noupdate', odcInstallation: 'OWASP'
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
