artifactory("RT1") {
localRepository("docker-local") {
  packageType "docker"
  description "My local Docker registry"
}
}