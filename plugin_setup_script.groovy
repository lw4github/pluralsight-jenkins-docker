#!groovy

import jenkins.model.Jenkins;

pm = Jenkins.instance.pluginManager
uc = Jenkins.instance.updateCenter

pm.doCheckUpdatesServer()

["git", "workflow-aggregator", "blueocean", "slack"].each {
    if(! pm.getPlugin(it)) {
        deployment = uc.getPlugin(it).deploy(true)
        deployment.get()
    }
}


/* Run the script at: Manage Jenkins -> Script Console
 *
 * Result
 * Result: [git, workflow-aggregator, blueocean, slack]
 */
