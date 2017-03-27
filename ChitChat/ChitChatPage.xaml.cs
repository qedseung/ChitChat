//Author: Steven Seung
//Credit for the client side websocket PCL goes to Nicholas Ventimiglia 

using System;
using Websockets;
using Xamarin.Forms;
using System.Diagnostics;
using System.Threading.Tasks;

namespace ChitChat
{
	public partial class ChitChatPage : ContentPage
	{
		//flags
		private bool _echo, _failed;
		//instantiate socket object
		private readonly IWebSocketConnection _connection;

		public ChitChatPage() 
		{
			InitializeComponent();
			_connection = WebSocketFactory.Create();
			_connection.OnOpened += Connection_OnOpened;
			_connection.OnMessage += Connection_OnMessage;
			_connection.OnClosed += Connection_OnClosed;
			_connection.OnError += Connection_OnError;
		}
		private void Connection_OnClosed()
		{
			Debug.WriteLine("Closed!");
		}
		private void Connection_OnError(string obj)
		{
			_failed = true;
			Debug.WriteLine("ERROR " + obj);
		}

		private void Connection_OnOpened()
		{
			Debug.WriteLine("Opened!");
		}

		private void Connection_OnMessage(string obj)
		{
			_echo = true;
			Debug.WriteLine(obj);
			Device.BeginInvokeOnMainThread(() =>
			{
				Label temp = new Label() { Text = obj, HorizontalOptions = LayoutOptions.Start };
				room.Children.Add(temp);
				scrol.ScrollToAsync(temp, ScrollToPosition.End, false);
			});
		}

		protected override async void OnAppearing()
		{
			base.OnAppearing();
			//insert url/ip address to your server here
			_connection.Open("ws://chitchat-qedseung.c9users.io");
			while (!_connection.IsOpen && !_failed)
			{
				await Task.Delay(10);
			}
			msg.Focus();
		}

		void Push_MSG(object sender, System.EventArgs e)
		{
			if (msg.Text.Length != 0)
			{
				Label temp = new Label() { Text = msg.Text, HorizontalOptions = LayoutOptions.End };
				room.Children.Add(temp);
				scrol.ScrollToAsync(temp, ScrollToPosition.End, false);
				_connection.Send(msg.Text);
				msg.Text = "";
				scrol.Focus();
			}
		}
	}
}
