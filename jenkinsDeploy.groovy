properties([
    parameters([
        booleanParam(defaultValue: false, description: 'please select to apply changes', name: 'terraformApply'), 
        booleanParam(defaultValue: false, description: 'please select to destroy everything', name: 'terraformDestroy'), 
        booleanParam(defaultValue: false, description: 'please select to run the job in debug mode', name: 'debugMode'), 
        choice(choices: ['dev', 'qa', 'stage', 'prod'], description: 'please select the environment to deploy', name: 'environment')
        ])
    ])

println('Hello World')