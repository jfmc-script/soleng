artifactory("RT1") {
  localRepository('RT1-ivy-local') {
    description "bla bla"
    notes "Some internal notes"
    includesPattern "**/*" // default
    excludesPattern "" // default
    repoLayoutRef "maven-2-default"
    propertySets // (["ps1", "ps2"])
    archiveBrowsingEnabled false
    blackedOut false // default
    packageType "ivy"
  }
}