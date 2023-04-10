package edu.harvard.fas.zfeledy.fiximulator.core;

import quickfix.FieldNotFound;
import quickfix.field.ClOrdID;
import quickfix.field.HandlInst;
import quickfix.field.OrdType;
import quickfix.field.Side;
import quickfix.field.Symbol;
import quickfix.field.TransactTime;
import quickfix.fix44.NewOrderSingle;

public class CustomNewOrderSingle extends NewOrderSingle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CustomField custField;
	
	public CustomNewOrderSingle(ClOrdID clOrdID,
            HandlInst handlInst,
            Symbol symbol,
            Side side,
            TransactTime transactTime,
            OrdType ordType,CustomField custField)
	{
		this.set(clOrdID);
		this.set(handlInst);
		this.set(symbol);
		this.set(side);
		this.set(transactTime);
		this.set(ordType);
		this.set(custField);
	}

	public void set(CustomField custField) {
		// TODO Auto-generated method stub
		this.custField=custField;
	}
	
	CustomField get(CustomField value) throws FieldNotFound
	{
		value=custField;
		return custField;
	}
	
	

}
