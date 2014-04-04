package org.mule.transport.jms;

import org.mule.api.construct.FlowConstruct;
import org.mule.api.endpoint.InboundEndpoint;
import org.mule.api.lifecycle.CreateException;
import org.mule.api.transport.Connector;

public class GuaranteeOrderDeliveryMessageReceiver extends
		MultiConsumerJmsMessageReceiver {

	public GuaranteeOrderDeliveryMessageReceiver(Connector connector,
			FlowConstruct flowConstruct, InboundEndpoint endpoint)
			throws CreateException {
		super(connector, flowConstruct, endpoint);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean shouldConsumeInEveryNode() {
		System.out.println("************************** shouldConsumeInEveryNode? ************************** ");
		return false;
	}

}
