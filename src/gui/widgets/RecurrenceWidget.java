/**
 * Abstract GUI component for recurrence expression builders.
 * 
 * @author Dana Burkart
 *
 */

package gui.widgets;

import javax.swing.JPanel;

public abstract class RecurrenceWidget extends JPanel {
	
	/**
	 * Builds and returns the recurrence expression
	 * 
	 * @return recurrence expression in this widget
	 */
	public abstract String getREX();
	
	public abstract void reset();
}
