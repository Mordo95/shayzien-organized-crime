package com.organisedcrime;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class OrganisedCrimePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(OrganisedCrimePlugin.class);
		RuneLite.main(args);
	}
}