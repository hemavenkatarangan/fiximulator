package edu.harvard.fas.zfeledy.fiximulator.core;

import quickfix.FieldNotFound;
import quickfix.IncorrectTagValue;
import quickfix.SessionID;
import quickfix.UnsupportedMessageType;
import quickfix.fix44.MessageCracker;

public class CustomMessageCracker extends MessageCracker {
	
	public void onMessage(CustomNewOrderSingle message, SessionID sessionID)
			throws FieldNotFound, UnsupportedMessageType, IncorrectTagValue {
		System.out.println("On message custom");
	}

}
