package com.growcontrol.server.net.firewall.rules;

import io.netty.channel.Channel;

import com.growcontrol.server.net.firewall.NetFirewallRule;


public class ruleIPList implements NetFirewallRule {



	@Override
	public boolean check(Channel channel) {
		return false;
	}



}