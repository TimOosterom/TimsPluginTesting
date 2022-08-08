package com.tim.plugins.testing;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class TimsPluginTestingPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(TimsPluginTestingPlugin.class);
		RuneLite.main(args);
	}
}