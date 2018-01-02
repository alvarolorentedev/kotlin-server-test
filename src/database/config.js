const sailsMemoryAdapter = require('sails-memory')

const config = {
  adapters: {
    'memory': sailsMemoryAdapter
  },
    connections: {
        default: {
            adapter: 'memory'
        }
    }
}

module.exports = config