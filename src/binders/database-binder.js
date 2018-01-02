const Waterline = require('waterline')
const config = require('./db-config.js')
const Framework = require('./framework-model.js')
const waterline = new Waterline()

function dbInitialize(app){
    waterline.loadCollection(Framework)
    waterline.initialize(config, function(err, models) {
      if(err)
        throw err

      app.models = models.collections
      app.connections = models.connections

      app.models.framework.create({ name: 'pepe' }).then(console.log).catch(console.error)
    })
}

module.exports = dbInitialize