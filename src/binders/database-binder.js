const waterline = require('waterline')()
const config = require('../database/config.js')
const user = require('../database/user-model.js')

function dbInitialize(app){
    waterline.loadCollection(user)
    waterline.initialize(config, function(err, models) {
      if(err)
        throw err

      app.models = models.collections
      app.connections = models.connections

      app.models.framework.create({ name: 'pepe' }).then(console.log).catch(console.error)
    })
}

module.exports = dbInitialize