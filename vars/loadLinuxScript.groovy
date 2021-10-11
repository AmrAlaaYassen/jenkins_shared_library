def call (Map config=[:]) {
    def scriptcontents = libraryResource "org/scripts/linux/${config.scriptName}"
    writeFile file:"${config.scriptName}", text: scriptcontents
    sh "chmod a+x ./${config.scriptName}"
}
