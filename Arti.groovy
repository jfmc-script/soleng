artifactoryToUserInput = userInput (
    name : "Input to name artifactory",
    type : "ARTIFACTORY",
    description : "please provide a to name artifactory"
)

artifactory(artifactoryToUserInput.name) {
  localRepository("local-repository-key") {
    replication(artifactoryToUserInput) {
      username artifactoryToUserInput.credentials.userName
      password artifactoryToUserInput.credentials.password

      cronExp "0 0/9 14 * * ?"
      socketTimeoutMillis 15000
    }
  }
}

artifactoryToUserInput2 = userInput (
    name : "Input to name artifactory",
    type : "ARTIFACTORY",
    description : "please provide a to name artifactory"
)
artifactory(artifactoryToUserInput.name) {
  localRepository("local-repository-key") {
    replication(artifactoryToUserInput) {
      username artifactoryToUserInput.credentials.userName
      password artifactoryToUserInput.credentials.password

      cronExp "0 0/9 14 * * ?"
      socketTimeoutMillis 15000
    }
  }
}