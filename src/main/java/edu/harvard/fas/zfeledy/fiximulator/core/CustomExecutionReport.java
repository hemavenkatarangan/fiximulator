package edu.harvard.fas.zfeledy.fiximulator.core;

import quickfix.fix44.ExecutionReport;

public class CustomExecutionReport extends ExecutionReport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomExecutionReport() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public CustomExecutionReport(quickfix.field.OrderID orderID, quickfix.field.ExecID execID, quickfix.field.ExecType execType, quickfix.field.OrdStatus ordStatus, quickfix.field.Side side, quickfix.field.LeavesQty leavesQty, quickfix.field.CumQty cumQty, quickfix.field.AvgPx avgPx,CustomField custField) {
		this();
		setField(orderID);
		setField(execID);
		setField(execType);
		setField(ordStatus);
		setField(side);
		setField(leavesQty);
		setField(cumQty);
		setField(avgPx);
		setField(custField);
	}

}
