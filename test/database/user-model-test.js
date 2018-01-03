jest.mock('waterline', () => ({
    Collection: {extend: jest.fn()}
  }))

const user = require('../../src/database/user-model'),
      waterline = require('waterline')

    describe('Test user model for sails', () => {

    test('should be called once to register', async () => {
        expect(waterline.Collection.extend.mock.calls.length).toBe(1)
    })

    test('identity should be user', async () => {
        expect(waterline.Collection.extend.mock.calls[0][0].identity).toBe('user')
    })

    test('connection should be default', async () => {
        expect(waterline.Collection.extend.mock.calls[0][0].connection).toBe('default')
    })

    test('attributes should be of correct types', async () => {
        expect(waterline.Collection.extend.mock.calls[0][0].attributes.name).toBe('string')
    })
})