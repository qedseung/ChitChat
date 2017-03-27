package md58b3d939d061c162c7a16be0d4ecab390;


public class WebsocketConnection
	extends websockets.DroidBridge.BridgeProxy
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_RaiseClosed:()V:GetRaiseClosedHandler\n" +
			"n_RaiseError:(Ljava/lang/String;)V:GetRaiseError_Ljava_lang_String_Handler\n" +
			"n_RaiseLog:(Ljava/lang/String;)V:GetRaiseLog_Ljava_lang_String_Handler\n" +
			"n_RaiseMessage:(Ljava/lang/String;)V:GetRaiseMessage_Ljava_lang_String_Handler\n" +
			"n_RaiseOpened:()V:GetRaiseOpenedHandler\n" +
			"";
		mono.android.Runtime.register ("Websockets.Droid.WebsocketConnection, Websockets.Droid, Version=1.0.1.8, Culture=neutral, PublicKeyToken=null", WebsocketConnection.class, __md_methods);
	}


	public WebsocketConnection () throws java.lang.Throwable
	{
		super ();
		if (getClass () == WebsocketConnection.class)
			mono.android.TypeManager.Activate ("Websockets.Droid.WebsocketConnection, Websockets.Droid, Version=1.0.1.8, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void RaiseClosed ()
	{
		n_RaiseClosed ();
	}

	private native void n_RaiseClosed ();


	public void RaiseError (java.lang.String p0)
	{
		n_RaiseError (p0);
	}

	private native void n_RaiseError (java.lang.String p0);


	public void RaiseLog (java.lang.String p0)
	{
		n_RaiseLog (p0);
	}

	private native void n_RaiseLog (java.lang.String p0);


	public void RaiseMessage (java.lang.String p0)
	{
		n_RaiseMessage (p0);
	}

	private native void n_RaiseMessage (java.lang.String p0);


	public void RaiseOpened ()
	{
		n_RaiseOpened ();
	}

	private native void n_RaiseOpened ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
