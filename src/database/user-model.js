const waterline = require('waterline')

const user = waterline.Collection.extend({
  identity: 'user',
  connection: 'default',
  attributes: {
    name: 'string'
  }
})

module.exports = user