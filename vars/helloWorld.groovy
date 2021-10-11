def call(Map config = [:]) {
    loadLinuxScript(scriptName: 'hello-world.sh')
    sh "./hello-world.sh ${config.name} ${config.dayOfWeek}"
}
