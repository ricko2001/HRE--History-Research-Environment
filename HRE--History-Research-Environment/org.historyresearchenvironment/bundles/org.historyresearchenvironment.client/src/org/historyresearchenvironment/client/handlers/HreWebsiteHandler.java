
package org.historyresearchenvironment.client.handlers;

import java.util.List;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;

/**
 * @version 2018-06-10
 * @author Michael Erichsen, &copy; History Research Environment Ltd., 2018
 *
 */
public class HreWebsiteHandler {
	@Execute
	public void execute(EPartService partService, MApplication application, EModelService modelService) {
		final MPart part = MBasicFactory.INSTANCE.createPart();
		part.setLabel("HRE Web Site");
		part.setContainerData("650");
		part.setCloseable(true);
		part.setVisible(true);
		part.setContributionURI(
				"bundleclass://org.historyresearchenvironment.client/org.historyresearchenvironment.client.parts.HreWebsite");
		final List<MPartStack> stacks = modelService.findElements(application, null, MPartStack.class, null);
		stacks.get(stacks.size() - 2).getChildren().add(part);
		partService.showPart(part, PartState.ACTIVATE);

	}

}