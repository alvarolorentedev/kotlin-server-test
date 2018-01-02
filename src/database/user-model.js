const Waterline = require('waterline')

const user = Waterline.Collection.extend({
  identity: 'framework',
  connection: 'default',
  attributes: {
    name: 'string'
  }
})

module.exports = user