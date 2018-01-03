const Waterline = require('waterline')

const user = Waterline.Collection.extend({
  identity: 'user',
  connection: 'default',
  attributes: {
    name: 'string'
  }
})

module.exports = user