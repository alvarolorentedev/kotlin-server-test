const express = require('express'),
middlewareBinder = require('./binders/middleware-binder'),
middlewareBinder = require('./binders/database-binder'),
routeBinder = require('./binders/route-binder'),
port = process.env.PORT || 8080,
app = express()

middlewareBinder(app)
databaseBinder(app)
routeBinder(app)

app.listen(port)