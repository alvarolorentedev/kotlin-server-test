const Waterline = require('waterline')

const Framework = Waterline.Collection.extend({
  identity: 'framework',
  connection: 'default',
  attributes: {
    name: 'string'
  }
})

module.exports = Framework