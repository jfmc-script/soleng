artifactory("RT1") {
localRepository('ivy-key') {
  description "Public description"
  notes "Some internal notes"
  includesPattern "**/*" // default
  excludesPattern "" // default
  repoLayoutRef "maven-2-default"
  // xrayIndex false
  // blockXrayUnscannedArtifacts false
  // xrayMinimumBlockedSeverity "" // "Minor" | "Major" | "Critical"
  propertySets // (["ps1", "ps2"])
  archiveBrowsingEnabled false
  blackedOut false // default
  packageType "ivy" // "bower" | "chef" | "cocoapods" | "debian" | "docker" | "gems" | "generic" | "gitlfs" | "gradle" | "ivy" | "maven" | "npm" | "nuget" | "opkg" | "puppet" | "pypi" | "sbt" | "vagrant" | "yum"
  
  // packageType "debian"
  // debianTrivialLayout false
  
  // packageType "docker"
  // dockerApiVersion "V2" // "V1"
  // forceDockerAuthentication false
  // maxUniqueTags 0 // optional
  
  // packageType "gradle"
  // maxUniqueSnapshots 0 // default
  // handleReleases true // default
  // handleSnapshots true // default
  // suppressPomConsistencyChecks false // default
  // snapshotVersionBehavior "unique" // "non-unique" | "deployer"
  // checksumPolicyType "client-checksums" // default | "server-generated-checksums"
  
  // packageType "ivy"
  // maxUniqueSnapshots 0 // default
  // handleReleases true // default
  // handleSnapshots true // default
  // suppressPomConsistencyChecks false // default
  // snapshotVersionBehavior "unique" // "non-unique" | "deployer"
  // checksumPolicyType "client-checksums" // default | "server-generated-checksums"
  
  // packageType "maven"
  // maxUniqueSnapshots 0 // default
  // handleReleases true // default
  // handleSnapshots true // default
  // suppressPomConsistencyChecks false // default
  // snapshotVersionBehavior "unique" // "non-unique" | "deployer"
  // checksumPolicyType "client-checksums" // default | "server-generated-checksums"
  
  // packageType "nuget"
  // maxUniqueSnapshots 0 // default
  // forceNugetAuthentication false // default
  
  // packageType "sbt"
  // maxUniqueSnapshots 0 // default
  // handleReleases true // default
  // handleSnapshots true // default
  // suppressPomConsistencyChecks false // default
  // snapshotVersionBehavior "unique" // "non-unique" | "deployer"
  // checksumPolicyType "client-checksums" // default | "server-generated-checksums"
  
  // packageType "yum"
  // yumRootDepth 0
  // groupFileNames "groups.xml"
  // calculateYumMetadata false
  
}
}