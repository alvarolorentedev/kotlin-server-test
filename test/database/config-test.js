jest.mock('sails-memory', () => jest.fn())

const config = require('../../src/database/config'),
      sailsMemoryAdapter = require('sails-memory')

describe('Test database configuration for sails', () => {

    test('should have adapter memory as sails-memory', async () => {
        expect(config.adapters.memory).toBe(sailsMemoryAdapter)
    })

    test('should have default connection as memory', async () => {
        expect(config.connections.default.adapter).toBe('memory')
    })
})