const request = require('./route-initializer')('../../src/routes/index','/')
describe('Test the index endpoit', () => {
    test('home returns 200', async () => {
        let result = await request.get('/').send()
        expect(result.statusCode).toBe(200)
    })
})