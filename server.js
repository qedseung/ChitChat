//Author: Steven Seung
//Chat Room
//NOT SECURE CONNECTIONS
//NO ERROR HANDLING
//FOR TESTING PURPOSES ONLY

var express = require('express');
var expressWs = require('express-ws');
var expressWs = expressWs(express());
var app = expressWs.app;

var countid = 0;
 
app.use(function (req, res, next) {
  console.log('middleware');
  req.testing = 'testing';
  return next();
});
 
app.get('/', function(req, res, next){
  console.log('get route', req.testing);
  res.end();
});

var aWss = expressWs.getWss('/');

aWss.on('connection', function(ws) {
  ws.id = countid++;
  console.log('connection open');
});
 
app.ws('/', function(ws, req) {
  ws.on('message', function(msg) {
    //console.log(msg);
    aWss.clients.forEach(function (client) {
      //console.log(client.id)
      if(client!==ws){
        if(client.readyState == 1){
          var res = client.id+" : "+msg;
          client.send(res);
        }
      }
    });
  });
});

app.listen(process.env.PORT);
