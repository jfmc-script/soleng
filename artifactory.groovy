artifactory("RT1") {
localRepository("docker-local-a") {
  packageType "docker"
  description "My local Docker registry"
}
}