package com.vordel.client.manager.filter.assertion;

import org.eclipse.swt.widgets.Shell;

import com.vordel.client.manager.EntityContextAdapterDialog;
import com.vordel.client.manager.Manager;
import com.vordel.es.Entity;
import com.vordel.es.EntityType;
import com.vordel.es.KeyHolder;

public class AssertionPropertyDialog extends EntityContextAdapterDialog {
	private String flavor = null;

	public AssertionPropertyDialog(Shell parentShell, Manager manager, Entity selected) {
		super(parentShell, "EDIT_PROPERTY", manager, selected);
	}

	public AssertionPropertyDialog(Shell parentShell, Manager manager, EntityType type, KeyHolder parentKeyHolder) {
		super(parentShell, "ADD_PROPERTY", manager, type, parentKeyHolder);
	}

	@Override
	protected String getFlavor() {
		return this.flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public String getHelpID() {
		// TODO Auto-generated method stub
		return "";
	}
}
