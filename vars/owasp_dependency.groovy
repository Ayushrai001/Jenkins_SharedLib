def call(){
  dependencyCheck additionalArguments: '--scan ./ --format ALL --out .', odcInstallation: 'OWASP'
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
