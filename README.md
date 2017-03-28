# ChitChat
Simple Chat Room App made in Xamarin Studio using Xamarin.Forms and Websockets (connects to Node.js backend). 
Works with iOS & Android

## Getting Started
One should be able hit the ground running by downloading this project and opening it in Xamarin Studio; however you will 
need to set up your own server and reference it in this chitchat app, as the default server this app connects to **DOES NOT RUN 24/7.**  Included is the server.js file.
Alternatively you can use the [echo server](https://www.websocket.org/echo.html) wss://echo.websocket.org 


### Trouble Shooting Packages
If there are problems with the websocket packages. Please try manually installing them following the instructions [here.](https://github.com/NVentimiglia/Websockets.PCL/blob/master/README.md)
Also be wary that there are 2 Websockets.Pcl on Nuget, so get the more recent one with Mr. Ventimiglia's face on it. 

### License
This project is licensed under the MIT [License](https://github.com/qedseung/ChitChat/blob/master/License).

### Acknowledgements
- Thanks to Mr. Ventimiglia for developing the only Websocket PCL that I could get installed with Xamarin Forms
