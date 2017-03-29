# ChitChat
Simple Chat Room App made in Xamarin Studio using Xamarin.Forms and Websockets (connects to Node.js backend). 
Works with iOS & Android

## Getting Started
One should be able hit the ground running by downloading this project and opening the solution in Xamarin Studio or Visual Studio; however you will need to set up your own server and reference it in this chitchat app, or email me to turn on the default server. The default server this app connects to **DOES NOT RUN 24/7.**  Included is the server.js [file](https://github.com/qedseung/ChitChat/blob/master/server.js).
Alternatively you can use the [echo server](https://www.websocket.org/echo.html) wss://echo.websocket.org 

Most functionality is implemented in the ChitChatPage.xaml.cs file and the UI elements in the ChitChatPage.xaml file. Edit these files for desired effects. For example, edit this line in ChitChatPage.xaml.cs ` _connection.Open("wss://echo.websocket.org"); ` to connect to an echo server instead of the default.


### Trouble Shooting Packages
If there are problems with the websocket packages. Please try manually installing them following the instructions [here.](https://github.com/NVentimiglia/Websockets.PCL/blob/master/README.md)
Also be wary that there are 2 Websockets.Pcl on Nuget, so get the more recent one with Mr. Ventimiglia's face on it. 

### License
This project is licensed under the MIT [License](https://github.com/qedseung/ChitChat/blob/master/License).

### Acknowledgements
- Thanks to Mr. Ventimiglia for developing the only Websocket PCL that I could get installed with Xamarin Forms
