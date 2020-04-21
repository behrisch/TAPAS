package de.dlr.ivf.tapas.analyzer.gui;

import javax.swing.JComponent;

import de.dlr.ivf.tapas.analyzer.core.CoreProcessInterface;

/**
 * Interface for an analysis-module. Grants access to the ui-component and the logic-component ({@link CoreProcessInterface}
 * 
 * @author Marco
 * 
 */
public interface ControlInputInterface {
	
	/**
	 * The ui-component for all settings needed for this module.
	 * 
	 * @return
	 */
    JComponent getComponent();
	
	/**
	 * the logic-component
	 * 
	 * @return
	 */
    CoreProcessInterface getProcessImpl();
	
	/**
	 * 
	 * @return true when the process is running
	 */
    boolean isActive();
	
	/**
	 * the priority gives the ui an advice how the subcomponents should be sorted. a lower priority means that a component is further above
	 * 
	 * @return
	 */
    int getIndex();
	
}
