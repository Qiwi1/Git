const express = require('express');
const http = require('http');
const socketio = require('socket.io');

const app = express();
const server = http.createServer(app);
const io = socketio(server);

io.on('connection', (socket) => {
  console.log('New client connected');

  // Обработчик события "mousemove"
  socket.on('mousemove', (data) => {
    // Отправляем данные всем подключенным клиентам, кроме отправителя
    socket.broadcast.emit('mousemove', data);
  });

  // Обработчик события "disconnect"
  socket.on('disconnect', () => {
    console.log('Client disconnected');
  });
});

server.listen(3000, () => {
  console.log('Server listening on port 3000');
});
