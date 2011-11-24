package de.bmotionstudio.gef.editor.attribute;

import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.PropertyDescriptor;

public class BAttributeOrientation extends AbstractAttribute {

	public static final int HORIZONTAL = 0;
	public static final int VERTICAL = 1;

	public BAttributeOrientation(Object value) {
		super(value);
	}

	@Override
	protected PropertyDescriptor preparePropertyDescriptor() {
		return new ComboBoxPropertyDescriptor(getID(), getName(), new String[] {
				"HORIZONTAL", "VERTICAL" });
	}

	@Override
	public String getName() {
		return "Orientation";
	}

}
