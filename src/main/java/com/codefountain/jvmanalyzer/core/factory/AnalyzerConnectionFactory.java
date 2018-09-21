package com.codefountain.jvmanalyzer.core.factory;

import com.codefountain.jvmanalyzer.core.ConnectionHandler;
import com.codefountain.jvmanalyzer.core.JMXConnectionHandler;
import com.codefountain.jvmanalyzer.core.ProcessIdentifierConnectionHandler;
import com.codefountain.jvmanalyzer.exception.ErrorMessages;

/**
 * Factory implementation to select the type of 
 * connection handler to be selected
 * 
 * @author Somnath Musib
 *
 */
public enum AnalyzerConnectionFactory {

	INSTANCE;
	
	public ConnectionHandler getConenctionHandler(ConenctionType connectionType){
		
		switch(connectionType){
			case JMX:
				return new JMXConnectionHandler();
			case PROCESS_ID:
				return new ProcessIdentifierConnectionHandler();
			default:
				throw new IllegalArgumentException(ErrorMessages.INVALID_CONN_ARGUMENT);
		
		}
	}
	
	
}
