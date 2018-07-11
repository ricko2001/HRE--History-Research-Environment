package org.historyresearchenvironment.sample.client.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.historyresearchenvironment.client.HreConstants;
import org.historyresearchenvironment.client.parts.AbstractHreGuiPart;

/**
 * A navigator view part for sample models.
 * 
 * @version 2018-07-09
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class SampleModelNavigator extends AbstractHreGuiPart {
	private Table tableSampleModels;
	private final SampleViewProvider provider = new SampleViewProvider();

	/**
	 * Constructor
	 *
	 */
	public SampleModelNavigator() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		final TableViewer tableViewer = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);
		tableSampleModels = tableViewer.getTable();
		tableSampleModels.addMouseListener(new MouseAdapter() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.eclipse.swt.events.MouseAdapter#mouseDoubleClick(org.eclipse.swt.events.
			 * MouseEvent)
			 */
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Open sample view part
			}
		});
		tableSampleModels.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
	}

	/**
	 * 
	 */
	@PreDestroy
	public void dispose() {
	}

	/**
	 * 
	 */
	@Focus
	public void setFocus() {
	}

	@Inject
	@Optional
	private void subscribeSampleModelUpdateTopic(@UIEventTopic(HreConstants.SAMPLE_MODEL_UPDATE_TOPIC) String key) {
		callBusinessLayer("GET", provider, key);
	}

	/**
	 * @param operation
	 * @param provider2
	 * @param key
	 */
	private void callBusinessLayer(String operation, SampleViewProvider provider2, String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void updateGui() {

	}
}
